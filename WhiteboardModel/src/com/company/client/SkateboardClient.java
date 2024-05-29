package com.company.client;

import com.company.brands.HighEndBrands;

import com.compnay.skateboard.Skateboard;

public class SkateboardClient {

    public static void main(String[] args) {

        Skateboard skateboard1 = new Skateboard("Backfire",32,"rangerX3",true);
        Skateboard skateboard2 = new Skateboard("Boosted",25,"Boosted Stealth",true);
        Skateboard skateboard3 = new Skateboard("Meepo",15,"Meepo V3",false);
        Skateboard skateboard4 = new Skateboard("Meepo",15,"Meepo V3",false, HighEndBrands.EXWAY);

        skateboard1.highEnd();
        skateboard2.highEnd();
        skateboard3.highEnd();

        skateboard1.autoOrManual();
        skateboard2.autoOrManual();
        skateboard3.autoOrManual();



        skateboard1.onOrOffRoad();
        skateboard2.onOrOffRoad();
        skateboard3.onOrOffRoad();

        skateboard1.setElectric(false);
        skateboard1.setWheelSize(40);

        skateboard2.setBrand("High-End");

        skateboard3.setModel("Rocket Power");
        skateboard1.isItElectric();
        skateboard2.getWheelSize();


            skateboard1.toString();
            moreStrings(skateboard2);


        skateboard2.setBrand("High-End");

        skateboard3.setModel("Rocket Power");
        skateboard4.setHighEndBrands(HighEndBrands.EVOLVE);
        System.out.println(skateboard4.getHighEndBrands());


    }

    public static void moreStrings(Skateboard skateboard) {
        skateboard.toString();
        System.out.println("This wheelsize is " + skateboard.getWheelSize() + " The brand is " + skateboard.getBrand() + " and the model is " + skateboard.getModel()); ;
    }
}
