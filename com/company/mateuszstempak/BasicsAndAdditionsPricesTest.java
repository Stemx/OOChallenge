package com.company.mateuszstempak;

public class BasicsAndAdditionsPricesTest {

    public static void main(String[] args) {

        BasicsPrices basicsPrices = new BasicsPrices(Items.VEGE_BURGER, Items.DARK_BREAD);
        AdditionsPrices additionsPrices = new AdditionsPrices(Items.JALAPENO, Items.KETCHUP, Items.BASIL_PESTO, Items.BACON);

        Burger hamburger = new Burger(additionsPrices, basicsPrices);

        hamburger.order();

        System.out.println("\n****\n");

        BasicsPrices bPrices = new BasicsPrices(Items.FISH_BURGER, Items.STANDARD_BREAD);
        AdditionsPrices aPrices = new AdditionsPrices(Items.BASIL_PESTO, Items.BLUE_CHEESE, Items.CUCUMBER, Items.BACON);

        Burger healthyBurger = new HealthyBurger(aPrices, bPrices, Items.BARBECUE_SAUCE,
                Items.JALAPENO);

        healthyBurger.order();

        System.out.println("\n****\n");

        BasicsPrices baPrices = new BasicsPrices(Items.BEEF_BURGER, Items.DARK_BREAD);
        AdditionsPrices adPrices = new AdditionsPrices(Items.KETCHUP, Items.BLUE_CHEESE, Items.CUCUMBER, Items.JALAPENO);

        Burger deluxeBurger = new DeluxeBurger(adPrices, baPrices, Items.FRENCH_FRIES, Items.BEER);

        deluxeBurger.order();

    }
}
