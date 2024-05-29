package com.compnay.skateboard;

import com.company.brands.HighEndBrands;

public class Skateboard {

    private String brand;
    private String model;
    private int wheelSize;
    private boolean isElectric;
    HighEndBrands highEndBrands;


    public Skateboard(String brand, int wheelSize, String model, boolean isElectric) {
        this.brand = brand;
        this.wheelSize = wheelSize;
        this.model = model;
        this.isElectric = isElectric;
    }


    public Skateboard(String brand, int wheelSize, String model,boolean isElectric,  HighEndBrands highEndBrands) {
       this(brand, wheelSize, model, isElectric);
        this.highEndBrands = highEndBrands;
    }


    public HighEndBrands getHighEndBrands() {
        return highEndBrands;
    }

    public void setHighEndBrands(HighEndBrands highEndBrands) {
        this.highEndBrands = highEndBrands;
    }

    public boolean isItElectric() {
        System.out.println(isElectric);
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
        System.out.println("Is it electric?  " + isItElectric());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println("I made a mistake its this " + getBrand());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
        System.out.println("I made a mistake its this " + getModel());
    }

    public int getWheelSize() {
        System.out.println(wheelSize);

        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {

        if (wheelSize < 1) {
            System.out.println("The wheel size must be greater than 0");
        }else {
            this.wheelSize = wheelSize;
            System.out.println("The new wheel size is" + getWheelSize());
        }
    }







    public void autoOrManual(){
        if(isElectric){
            System.out.println("this thing is electric I dont need to kick push");
        }
    }

    public void highEnd() {
        System.out.println("I have this " + brand + " It's one of the high end models");
    }

    public void onOrOffRoad() {
        if(getWheelSize() >= 20){
            System.out.println("This " + brand + " Is made for offroading");
        } else if (getWheelSize() < 20) {
            System.out.println("This " + brand + " Is made for street riding");
        }
    }

    public String toString() {
        return brand + " " + model + " " + wheelSize + " " + isItElectric() + " " +highEndBrands;
    }


}
