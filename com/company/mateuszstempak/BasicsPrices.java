package com.company.mateuszstempak;

public class BasicsPrices extends Price {
    //Price constants
    private final int BEEF_PRICE = 14;
    private final int CHICKEN_PRICE = 12;
    private final int FISH_PRICE = 11;
    private final int VEGE_PRICE = 9;
    private final int STANDARD_BREAD_PRICE = 2;
    private final int DARK_BREAD_PRICE = 3;
    private final int HEALTHY_BREAD_PRICE = 4;
    private final int BROWN_RYE_BREAD_PRICE = 6;

    //Global (for this class) variable for price
    private int price;

    //String representation
    private String item1;
    private String item2;

    //Enum Items - two fields
    private Items items1;
    private Items items2;

    //Constructor which takes two basic items: burger and bread
    public BasicsPrices(Items items1, Items items2) {
        this.price = 0;
        this.item1 = "";
        this.item2 = "";
        this.items1 = items1;
        this.setItem1(tellItem(this.items1));
        this.items2 = items2;
        this.setItem2(tellItem(this.items2));
    }

    //Getters and setters
    public Items getItems1() {
        return items1;
    }

    public void setItems1(Items items1) {
        this.items1 = items1;
    }

    public Items getItems2() {
        return items2;
    }

    public void setItems2(Items items2) {
        this.items2 = items2;
    }

    public String getItem1() {
        return item1;
    }

    public void setItem1(String item1) {
        this.item1 = item1;
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    //Method which return what is the price for each item
    public int tellPrice(Items items) {

        switch(items) {
            case BEEF_BURGER:
                return BEEF_PRICE;
            case CHICKEN_BURGER:
                return CHICKEN_PRICE;
            case FISH_BURGER:
                return FISH_PRICE;
            case VEGE_BURGER:
                return VEGE_PRICE;
            case STANDARD_BREAD:
                return STANDARD_BREAD_PRICE;
            case DARK_BREAD:
                return DARK_BREAD_PRICE;
            case HEALTHY_BREAD:
                return HEALTHY_BREAD_PRICE;
            case BROWN_RYE_BREAD:
                return BROWN_RYE_BREAD_PRICE;
        }

        return 0;
    }

    //Method which returns String representation for enum Items
    public String tellItem(Items items) {

        switch(items) {
            case BEEF_BURGER:
                return "Beef burger";
            case CHICKEN_BURGER:
                return "Chicken burger";
            case FISH_BURGER:
                return "Fish burger";
            case VEGE_BURGER:
                return "Vege burger";
            case STANDARD_BREAD:
                return "Standard bread";
            case DARK_BREAD:
                return "Dark bread";
            case HEALTHY_BREAD:
                return "Healthy bread";
            case BROWN_RYE_BREAD:
                return "Brown rye bread";
        }

        return null;
    }

    //Print bread order
    public void printBreadOrder(String item) {
        switch(item) {
            case "Standard bread":
                System.out.println(item + ": " + this.tellPrice(Items.STANDARD_BREAD) + " PLN.");
                break;
            case "Dark bread":
                System.out.println(item + ": " + this.tellPrice(Items.DARK_BREAD) + " PLN.");
                break;
            case "Healthy bread":
                System.out.println(item + ": " + this.tellPrice(Items.HEALTHY_BREAD) + " PLN.");
                break;
            case "Brown rye bread":
                System.out.println(item + ": " + this.tellPrice(Items.BROWN_RYE_BREAD) + " PLN.");
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }

    //Print burger order
    public void printBurgerOrder(String item) {
        switch(item) {
            case "Beef burger":
                System.out.println(item + ": " + this.tellPrice(Items.BEEF_BURGER) + " PLN.");
                break;
            case "Chicken burger":
                System.out.println(item + ": " + this.tellPrice(Items.CHICKEN_BURGER) + " PLN.");
                break;
            case "Fish burger":
                System.out.println(item + ": " + this.tellPrice(Items.FISH_BURGER) + " PLN.");
                break;
            case "Vege burger":
                System.out.println(item + ": " + this.tellPrice(Items.VEGE_BURGER) + " PLN.");
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }

    //A method which returns overall price for basics
    public int addPrice() {
        int currentPrice = 0;
        int totalPrice;
        currentPrice += tellPrice(items1);
        currentPrice += tellPrice(items2);
        this.price += currentPrice;
        totalPrice = currentPrice;

        return totalPrice;
    }
}
