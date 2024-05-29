package com.company.client;

import com.company.brands.HighEndBrands;
import com.compnay.skateboard.Skateboard;

public class SkateboardClientArgs {

    public static void main(String[] args) {
        String brand = args[0];
        String model = args[1];
        int wheelSize = Integer.parseInt(args[2]);
        boolean isElectric = Boolean.parseBoolean(args[3]);
        HighEndBrands highEndBrands = HighEndBrands.valueOf(args[4]);

//        The above is how you would parse all the values from String to these designated values.

        Skateboard sk81 = new Skateboard(brand,wheelSize,model,isElectric,highEndBrands);
        System.out.println(sk81);
        System.out.println(args.length);
    }
}
