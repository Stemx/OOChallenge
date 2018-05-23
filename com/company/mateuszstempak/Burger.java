package com.company.mateuszstempak;

public class Burger {

    private AdditionsPrices additionsPrices;
    private BasicsPrices basicsPrices;
    private int totalPrice;

    public Burger(AdditionsPrices additionsPrices, BasicsPrices basicsPrices) {
        this.additionsPrices = additionsPrices;
        this.basicsPrices = basicsPrices;
        this.totalPrice = 0;
    }

    public int totalPrice() {
        totalPrice = additionsPrices.addPrice() + basicsPrices.addPrice();
        return totalPrice;
    }

    public void printTotal() {
        System.out.println("TOTAL: " + totalPrice() + " PLN");
    }

    public void order() {

        System.out.println("Your order: ");

        basicsPrices.printBurgerOrder(basicsPrices.getItem1());
        basicsPrices.printBreadOrder(basicsPrices.getItem2());
        additionsPrices.printOrder(additionsPrices.getItem1());
        additionsPrices.printOrder(additionsPrices.getItem2());
        additionsPrices.printOrder(additionsPrices.getItem3());
        additionsPrices.printOrder(additionsPrices.getItem4());
        System.out.println("---------------------------");
        printTotal();

    }

    public AdditionsPrices getAdditionsPrices() {
        return additionsPrices;
    }

    public BasicsPrices getBasicsPrices() {
        return basicsPrices;
    }
}
