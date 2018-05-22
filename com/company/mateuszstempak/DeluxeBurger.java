package com.company.mateuszstempak;

public class DeluxeBurger extends Burger {

    private String chips;
    private String drink;

    private Items chipsItem;
    private Items drinkItem;

    public String getChips() {
        return chips;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public Items getChipsItem() {
        return chipsItem;
    }

    public void setChipsItem(Items chipsItem) {
        this.chipsItem = chipsItem;
    }

    public Items getDrinkItem() {
        return drinkItem;
    }

    public void setDrinkItem(Items drinkItem) {
        this.drinkItem = drinkItem;
    }

    public DeluxeBurger(AdditionsPrices additionsPrices, BasicsPrices basicsPrices, String chips, Items chipsItem,
                        String drink, Items drinkItem) {
        super(additionsPrices, basicsPrices);


    }
}
