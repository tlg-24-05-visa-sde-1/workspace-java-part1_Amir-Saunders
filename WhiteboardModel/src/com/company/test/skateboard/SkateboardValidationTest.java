package com.company.test.skateboard;

import com.company.brands.HighEndBrands;
import com.compnay.skateboard.Skateboard;

public class SkateboardValidationTest {

    public static void main(String[] args) {
        Skateboard skateboard1 = new Skateboard("Backfire",32,"rangerX3",true);
        Skateboard skateboard2 = new Skateboard("Boosted",25,"Boosted Stealth",true);
        Skateboard skateboard3 = new Skateboard("Meepo",15,"Meepo V3",false);
        Skateboard skateboard4 = new Skateboard("Meepo",15,"Meepo V3",false, HighEndBrands.EXWAY);




        skateboard1.setElectric(false);
        skateboard1.setWheelSize(40);

        skateboard2.setBrand("High-End");

        skateboard3.setModel("Rocket Power");
        skateboard4.setHighEndBrands(HighEndBrands.EVOLVE);
        System.out.println(skateboard4.getHighEndBrands());
    }
}
