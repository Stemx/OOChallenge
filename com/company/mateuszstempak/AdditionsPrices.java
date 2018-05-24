package com.company.mateuszstempak;

public class AdditionsPrices extends Price {
    //Price constants
    private final int FIRST_PRICE = 1;
    private final int SECOND_PRICE = 2;
    private final int THIRD_PRICE = 4;
    private final int FOURTH_PRICE = 6;
    private final int FIFTH_PRICE = 9;

    //Global (for this class) price variable
    private int price;

    //User additions items
    private Items items1;
    private Items items2;
    private Items items3;
    private Items items4;

    //Strings representation of Enum Items
    private String item1;
    private String item2;
    private String item3;
    private String item4;

    //Constructor with 4 enum Items references
    public AdditionsPrices(Items items1, Items items2, Items items3, Items items4) {
        this.item1 = "";
        this.item2 = "";
        this.item3 = "";
        this.item4 = "";
        this.items1 = items1;
        this.setItem1(tellItem(items1));
        this.items2 = items2;
        this.setItem2(tellItem(items2));
        this.items3 = items3;
        this.setItem3(tellItem(items3));
        this.items4 = items4;
        this.setItem4(tellItem(items4));
        this.price = 0;
    }

    //Setters
    public void setItem1(String item1) {
        this.item1 = item1;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    public void setItem3(String item3) {
        this.item3 = item3;
    }

    public void setItem4(String item4) {
        this.item4 = item4;
    }

    //Getters
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

    //Method which return what is the price for each item
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

    //Method which returns String representation for enum Items
    public String tellItem(Items items) {

        switch(items) {

            case BASIL:
                return "Basil";

            case BACON:
                return "Bacon";

            case BASIL_PESTO:
                return "Basil pesto";

            case BARBECUE_SAUCE:
                return "Barbecue sauce";

            case BLUE_CHEESE:
                return "Blue cheese";

            case CHEESE:
                return "Cheese";

            case CUCUMBER:
                return "Cucumber";

            case JALAPENO:
                return "Jalapeno";

            case KETCHUP:
                return "Ketchup";

            case LETTUCE:
                return "Lettuce";

            case MAYONNAISE:
                return "Mayonnaise";

            case MUSTARD:
                return "Mustard";

            case PAPRIKA:
                return "Paprika";

            case PARSLEY_PESTO:
                return "Parsley pesto";

            case RUCOLA:
                return "Rucola";

            case SALSA:
                return "Salsa";

            case TOMATO:
                return "Tomato";

            case POTATO_CHIPS:
                return "Potato chips";

            case FRENCH_FRIES:
                return "French fries";

            case BELGIAN_FRIES:
                return "Belgian fries";

            case COFFEE:
                return "Coffee";

            case BEER:
                return "Beer";

            case BARTENDER_DRINK:
                return "Bartender drink";
        }

        return null;
    }

    //Print each item
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

    //A method which returns overall price for additions
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
