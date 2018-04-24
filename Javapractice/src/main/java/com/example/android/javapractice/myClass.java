package com.example.android.javapractice;

public class myClass {

    public static void main(String[] args) {

        System.out.println("Mohammed Mutwakil");

        double myCash;
        myCash = 100;
        int monthlySalary = 20;
        final double UK_VAT_RATE = 0.20;

        String mainCourse = "Fish";
        String Side = "Chips";

        double COST_OF_FISH = 5.60;
        double COST_OF_CHIPS = 2.65;

        myCash = 150;

        System.out.println("My Favourite food is: " + mainCourse + " " + Side);
        System.out.println("Payday. Got: " + (myCash + monthlySalary));

//        double whatsLeft = myCash - (COST_OF_FISH + COST_OF_CHIPS) * (1 + UK_VAT_RATE);
//        System.out.println("Had a pub lunch. Funds depleted to " + whatsLeft);

        myCash = myCash - (COST_OF_FISH + COST_OF_CHIPS) * (1 + UK_VAT_RATE);
        System.out.println("Had a pub lunch. Funds depleted to " + myCash);

    }
}
