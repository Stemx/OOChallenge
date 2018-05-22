package com.company.mateuszstempak;

public class BasicsPrices extends Price {
    private final int BEEF_PRICE;
    private final int CHICKEN_PRICE;
    private final int FISH_PRICE;
    private final int VEGE_PRICE;
    private final int STANDARD_BREAD_PRICE;
    private final int DARK_BREAD_PRICE;
    private final int HEALTHY_BREAD_PRICE;
    private final int BROWN_RYE_BREAD_PRICE;

    private int price;
    private String item1;
    private String item2;

    private Items items1;
    private Items items2;

    public BasicsPrices(Items items1, Items items2, String item1, String item2) {
        this.BEEF_PRICE = 14;
        this.CHICKEN_PRICE = 12;
        this.FISH_PRICE = 11;
        this.VEGE_PRICE = 9;
        this.STANDARD_BREAD_PRICE = 2;
        this.DARK_BREAD_PRICE = 3;
        this.HEALTHY_BREAD_PRICE = 4;
        this.BROWN_RYE_BREAD_PRICE = 6;
        this.price = 0;
        this.items1 = items1;
        this.items2 = items2;
        this.item1 = item1;
        this.item2 = item2;
    }

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int tellPrice(Items items) {

        switch(items) {
            case BEEF_BURGER:
                item1 = "Beef burger";
                return BEEF_PRICE;
            case CHICKEN_BURGER:
                item1 = "Chicken burger";
                return CHICKEN_PRICE;
            case FISH_BURGER:
                item1 = "Fish burger";
                return FISH_PRICE;
            case VEGE_BURGER:
                item1 = "Vege burger";
                return VEGE_PRICE;
            case STANDARD_BREAD:
                item2 = "Standard bread";
                return STANDARD_BREAD_PRICE;
            case DARK_BREAD:
                item2 = "Dark bread";
                return DARK_BREAD_PRICE;
            case HEALTHY_BREAD:
                item2 = "Healthy bread";
                return HEALTHY_BREAD_PRICE;
            case BROWN_RYE_BREAD:
                item2 = "Brown rye bread";
                return BROWN_RYE_BREAD_PRICE;
        }

        return 0;
    }

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
