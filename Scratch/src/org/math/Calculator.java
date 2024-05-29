package org.math;

import java.util.Random;

class Calculator {

    double add(double a, double b) {
        return a + b;
    }
    double sub(double a, double b) {
        return a - b;
    }



    boolean isEevnt(int value) {
        return value % 2 == 0;
    }

    public void randomInt(int min, int max){
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        System.out.println(randomNumber);
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
         calculator.randomInt(10, 20);
         int rand = 5;
         double scaled = (rand * 2) +1;
        System.out.println(scaled);
    }
}
