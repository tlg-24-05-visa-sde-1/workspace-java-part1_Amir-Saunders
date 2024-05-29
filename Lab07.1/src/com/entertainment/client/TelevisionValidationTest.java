package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionValidationTest {

    public static void main(String[] args) {
        Television tv1 = new Television();
        Television tv2 = new Television(45,"LG");
        tv1.setVolume(105);
        tv1.setBrand("Mercedes");
        tv2.mute();
        System.out.println(tv2.getVolume());
        tv2.unmute(45);
        System.out.println(tv2.getVolume());
    }
}
