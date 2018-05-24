package com.company.mateuszstempak;

public class Burger {

    //Three fields
    private AdditionsPrices additionsPrices;
    private BasicsPrices basicsPrices;
    private int totalPrice;

    //Constructor
    public Burger(AdditionsPrices additionsPrices, BasicsPrices basicsPrices) {
        this.additionsPrices = additionsPrices;
        this.basicsPrices = basicsPrices;
        this.totalPrice = 0;
    }

    //A method which returns overall price for burger meal
    public int totalPrice() {
        totalPrice = additionsPrices.addPrice() + basicsPrices.addPrice();
        return totalPrice;
    }

    //Print total price
    public void printTotal() {
        System.out.println("TOTAL: " + totalPrice() + " PLN");
    }

    //Print overall order
    public void order() {

        System.out.println("Your order: \n");

        basicsPrices.printBurgerOrder(basicsPrices.getItem1());
        basicsPrices.printBreadOrder(basicsPrices.getItem2());
        additionsPrices.printOrder(additionsPrices.getItem1());
        additionsPrices.printOrder(additionsPrices.getItem2());
        additionsPrices.printOrder(additionsPrices.getItem3());
        additionsPrices.printOrder(additionsPrices.getItem4());
        System.out.println("---------------------------");
        printTotal();

    }

    //Getters
    public AdditionsPrices getAdditionsPrices() {
        return additionsPrices;
    }

    public BasicsPrices getBasicsPrices() {
        return basicsPrices;
    }
}
