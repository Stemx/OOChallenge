package com.company.mateuszstempak;

//DeluxeBurger inherits from Burger
public class DeluxeBurger extends Burger {

    //String and enum representation for two additional additions
    private String chips;
    private String drink;

    private Items chipsItem;
    private Items drinkItem;


    //Constructor
    public DeluxeBurger(AdditionsPrices additionsPrices, BasicsPrices basicsPrices, Items chipsItem, Items drinkItem) {
        super(additionsPrices, basicsPrices);
        this.chips = "";
        this.drink = "";
        //change empty Strings into item: chips and drink
        if (chipsItem.equals(Items.POTATO_CHIPS) || chipsItem.equals(Items.FRENCH_FRIES) || chipsItem.equals(Items.BELGIAN_FRIES)) {
            this.chipsItem = chipsItem;
            setChips(additionsPrices.tellItem(chipsItem));
        }
        else
            System.out.println("You cannot choose it.");

        if (drinkItem.equals(Items.BEER) || drinkItem.equals(Items.COFFEE) || drinkItem.equals(Items.BARTENDER_DRINK)) {
            this.drinkItem = drinkItem;
            setDrink(additionsPrices.tellItem(drinkItem));
        }
        else
            System.out.println("You cannot choose it.");
    }

    //Overridden method from Burger
    @Override
    public int totalPrice() {
        int finalValue = super.totalPrice() +
                getAdditionsPrices().tellPrice(chipsItem) + getAdditionsPrices().tellPrice(drinkItem);
        return finalValue;
    }

    //Override method from Burger
    @Override
    public void printTotal() {
        System.out.println("TOTAL: " + totalPrice() + " PLN.");
    }

    //Override method from Burger
    @Override
    public void order() {
        System.out.println("Your order: \n");
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

    //Setters and getters
    public void setChips(String chips) {
        this.chips = chips;
    }

    public void setDrink(String drink) {
        this.drink = drink;
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
