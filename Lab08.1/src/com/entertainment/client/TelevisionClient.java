/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
 
package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

class TelevisionClient {
  
    public static void main(String[] args) {
        Television tv = new Television("Samsung", 65, DisplayType.LED);
        Television tv2 = new Television("LG", 55, DisplayType.LED);
//        System.out.println(tv);
        
        // TODO: change the channel

        tv2.changeChannel("Home Menu");

        System.out.println(tv2.getCurrentChannel());
    }
}