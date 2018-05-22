package com.company.mateuszstempak;

public class HealthyBurger extends Burger {
    private Items items5;
    private Items items6;

    private String item5;
    private String item6;

    public HealthyBurger(AdditionsPrices additionsPrices, BasicsPrices basicsPrices, Items items5, String item5,
                         Items items6, String item6) {
        super(additionsPrices, basicsPrices);
        basicsPrices.setItem2("Brown rye bread");
        basicsPrices.setItems2(Items.BROWN_RYE_BREAD);
        this.items5 = items5;
        this.items6 = items6;
        this.item5 = item5;
        this.item6 = item6;
    }

    public int totalPrice() {
        int finalValue = super.sumPrice(getAdditionsPrices(), getBasicsPrices()); // + to cena dodatkowych produktów w tej klasie
        return finalValue;
    }

    public Items getItems5() {
        return items5;
    }

    public void setItems5(Items items5) {
        this.items5 = items5;
    }

    public Items getItems6() {
        return items6;
    }

    public void setItems6(Items items6) {
        this.items6 = items6;
    }

    public String getItem5() {
        return item5;
    }

    public void setItem5(String item5) {
        this.item5 = item5;
    }

    public String getItem6() {
        return item6;
    }

    public void setItem6(String item6) {
        this.item6 = item6;
    }
}
