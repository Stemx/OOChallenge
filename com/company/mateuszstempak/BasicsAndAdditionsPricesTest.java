package com.company.mateuszstempak;

public class BasicsAndAdditionsPricesTest {

    public static void main(String[] args) {

        BasicsPrices basicsPrices = new BasicsPrices(Items.VEGE_BURGER, Items.DARK_BREAD, "Vege burger", "Dark bread");
        AdditionsPrices additionsPrices = new AdditionsPrices(Items.JALAPENO, "Jalapeno", Items.KETCHUP, "Ketchup",
                Items.BASIL_PESTO, "Basil pesto", Items.BACON, "Bacon");

        Burger hamburger = new Burger(additionsPrices, basicsPrices);

        hamburger.order();

        System.out.println("\n****\n");

        BasicsPrices bPrices = new BasicsPrices(Items.FISH_BURGER, Items.STANDARD_BREAD, "Fish burger", "Standard bread");
        AdditionsPrices aPrices = new AdditionsPrices(Items.BASIL_PESTO, "Basil pesto", Items.BLUE_CHEESE, "Blue cheese", Items.CUCUMBER,
                "Cucumber", Items.BACON, "Bacon");

        Burger healthyBurger = new HealthyBurger(aPrices, bPrices, Items.BARBECUE_SAUCE, "Barbecue sauce",
                Items.JALAPENO, "Jalapeno");

        healthyBurger.order();

        System.out.println("\n****\n");

        BasicsPrices baPrices = new BasicsPrices(Items.BEEF_BURGER, Items.DARK_BREAD, "Beef burger", "Dark bread");
        AdditionsPrices adPrices = new AdditionsPrices(Items.KETCHUP, "Ketchup", Items.BLUE_CHEESE, "Blue cheese", Items.CUCUMBER,
                "Cucumber", Items.JALAPENO, "Bacon");

        Burger deluxeBurger = new DeluxeBurger(adPrices, baPrices, "French fries", "Beer", Items.FRENCH_FRIES, Items.BEER);

        deluxeBurger.order();

    }
}
