package com.ecommerce.Checkoutmicroservice.StrategyPattern;

public class PremiumShipping implements Strategy {

    @Override
    public double setShippingcharges(double carttotal) {
        return carttotal * 0.1 ;

    }


}