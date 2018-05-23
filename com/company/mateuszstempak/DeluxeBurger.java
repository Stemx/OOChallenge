package com.company.mateuszstempak;

public class DeluxeBurger extends Burger {

    private String chips;
    private String drink;

    private Items chipsItem;
    private Items drinkItem;

    public DeluxeBurger(AdditionsPrices additionsPrices, BasicsPrices basicsPrices, String chips, String drink, Items chipsItem, Items drinkItem) {
        super(additionsPrices, basicsPrices);
        this.chips = chips;
        this.drink = drink;
        this.chipsItem = chipsItem;
        this.drinkItem = drinkItem;
    }

    @Override
    public int totalPrice() {
        int finalValue = super.totalPrice() +
                getAdditionsPrices().tellPrice(chipsItem) + getAdditionsPrices().tellPrice(drinkItem);
        return finalValue;
    }

    @Override
    public void printTotal() {
        System.out.println("TOTAL: " + totalPrice() + " PLN.");
    }

    @Override
    public void order() {
        getBasicsPrices().printBurgerOrder(getBasicsPrices().getItem1());
        getBasicsPrices().printBreadOrder(getBasicsPrices().getItem2());

        getAdditionsPrices().printOrder(getAdditionsPrices().getItem1());
        getAdditionsPrices().printOrder(getAdditionsPrices().getItem2());
        getAdditionsPrices().printOrder(getAdditionsPrices().getItem3());
        getAdditionsPrices().printOrder(getAdditionsPrices().getItem4());
        getAdditionsPrices().printOrder(getChips());
        getAdditionsPrices().printOrder(getDrink());
        System.out.println("------------------------");
        printTotal();
    }

    public String getChips() {
        return chips;
    }

    public String getDrink() {
        return drink;
    }

    public Items getChipsItem() {
        return chipsItem;
    }

    public Items getDrinkItem() {
        return drinkItem;
    }
}
