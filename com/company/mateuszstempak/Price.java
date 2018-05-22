package com.company.mateuszstempak;

public abstract class Price implements Priceable{

    public abstract int tellPrice(Items items);
    public abstract int addPrice();

}
