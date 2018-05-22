package com.company.mateuszstempak;

public class AdditionsPrices extends Price {
    private final int FIRST_PRICE;
    private final int SECOND_PRICE;
    private final int THIRD_PRICE;
    private final int FOURTH_PRICE;
    private final int FIFTH_PRICE;
    private int price;

    private Items items1;
    private Items items2;
    private Items items3;
    private Items items4;

    private String item1;
    private String item2;
    private String item3;
    private String item4;

    public AdditionsPrices(Items items1, String item1, Items items2, String item2, Items items3,
                           String item3, Items items4, String item4) {
        this.FIRST_PRICE = 1;
        this.SECOND_PRICE = 2;
        this.THIRD_PRICE = 4;
        this.FOURTH_PRICE = 6;
        this.FIFTH_PRICE = 9;
        this.items1 = items1;
        this.item1 = item1;
        this.items2 = items2;
        this.item2 = item2;
        this.items3 = items3;
        this.item3 = item3;
        this.items4 = items4;
        this.item4 = item4;
        this.price = 0;
    }

    public String getItem1() {
        return item1;
    }

    public String getItem2() {
        return item2;
    }

    public String getItem3() {
        return item3;
    }

    public String getItem4() {
        return item4;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int tellPrice(Items items) {

        switch(items) {

            case BASIL:
                return FIRST_PRICE;

            case BACON:
                return SECOND_PRICE;

            case BASIL_PESTO:
                return SECOND_PRICE;

            case BARBECUE_SAUCE:
                return FIRST_PRICE;

            case BLUE_CHEESE:
                return SECOND_PRICE;

            case CHEESE:
                return FIRST_PRICE;

            case CUCUMBER:
                return FIRST_PRICE;

            case JALAPENO:
                return SECOND_PRICE;

            case KETCHUP:
                return FIRST_PRICE;

            case LETTUCE:
                return FIRST_PRICE;

            case MAYONNAISE:
                return FIRST_PRICE;

            case MUSTARD:
                return FIRST_PRICE;

            case PAPRIKA:
                return FIRST_PRICE;

            case PARSLEY_PESTO:
                return SECOND_PRICE;

            case RUCOLA:
                return FIRST_PRICE;

            case SALSA:
                return SECOND_PRICE;

            case TOMATO:
                return FIRST_PRICE;

            case POTATO_CHIPS:
                return THIRD_PRICE;

            case FRENCH_FRIES:
                return THIRD_PRICE;

            case BELGIAN_FRIES:
                return FOURTH_PRICE;

            case COFFEE:
                return FOURTH_PRICE;

            case BEER:
                return FIFTH_PRICE;

            case BARTENDER_DRINK:
                return FIFTH_PRICE;
        }

        return 0;
    }

    public void printOrder(String item) {
        switch(item) {
            case "Tomato":
                System.out.println(item + ": " + this.tellPrice(Items.TOMATO) + " PLN.");
                break;
            case "Cucumber":
                System.out.println(item + ": " + this.tellPrice(Items.CUCUMBER) + " PLN.");
                break;
            case "Lettuce":
                System.out.println(item + ": " + this.tellPrice(Items.LETTUCE) + " PLN.");
                break;
            case "Rucola":
                System.out.println(item + ": " + this.tellPrice(Items.RUCOLA) + " PLN.");
                break;
            case "Bacon":
                System.out.println(item + ": " + this.tellPrice(Items.BACON) + " PLN.");
                break;
            case "Cheese":
                System.out.println(item + ": " + this.tellPrice(Items.CHEESE) + " PLN.");
                break;
            case "Blue cheese":
                System.out.println(item + ": " + this.tellPrice(Items.BLUE_CHEESE) + " PLN.");
                break;
            case "Jalapeno":
                System.out.println(item + ": " + this.tellPrice(Items.JALAPENO) + " PLN.");
                break;
            case "Paprika":
                System.out.println(item + ": " + this.tellPrice(Items.PAPRIKA) + " PLN.");
                break;
            case "Basil":
                System.out.println(item + ": " + this.tellPrice(Items.BASIL) + " PLN.");
                break;
            case "Basil pesto":
                System.out.println(item + ": " + this.tellPrice(Items.BASIL_PESTO) + " PLN.");
                break;
            case "Parsley pesto":
                System.out.println(item + ": " + this.tellPrice(Items.PARSLEY_PESTO) + " PLN.");
                break;
            case "Salsa":
                System.out.println(item + ": " + this.tellPrice(Items.SALSA) + " PLN.");
                break;
            case "Ketchup":
                System.out.println(item + ": " + this.tellPrice(Items.KETCHUP) + " PLN.");
                break;
            case "Mustard":
                System.out.println(item + ": " + this.tellPrice(Items.MUSTARD) + " PLN.");
                break;
            case "Mayonnaise":
                System.out.println(item + ": " + this.tellPrice(Items.MAYONNAISE) + " PLN.");
                break;
            case "Barbecue sauce":
                System.out.println(item + ": " + this.tellPrice(Items.BARBECUE_SAUCE) + " PLN.");
                break;
            case "Potato chips":
                System.out.println(item + ": " + this.tellPrice(Items.POTATO_CHIPS) + " PLN.");
                break;
            case "French fries":
                System.out.println(item + ": " + this.tellPrice(Items.FRENCH_FRIES) + " PLN.");
                break;
            case "Belgian fries":
                System.out.println(item + ": " + this.tellPrice(Items.BELGIAN_FRIES) + " PLN.");
                break;
            case "Coffee":
                System.out.println(item + ": " + this.tellPrice(Items.COFFEE) + " PLN.");
                break;
            case "Beer":
                System.out.println(item + ": " + this.tellPrice(Items.BEER) + " PLN.");
                break;
            case "Bartender drink":
                System.out.println(item + ": " + this.tellPrice(Items.BARTENDER_DRINK) + " PLN.");
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }

    public int addPrice() {
        int currentPrice = 0;
        int totalPrice;
        currentPrice += tellPrice(items1);
        currentPrice += tellPrice(items2);
        currentPrice += tellPrice(items3);
        currentPrice += tellPrice(items4);
        this.price += currentPrice;
        totalPrice = currentPrice;

        return totalPrice;
    }




}
