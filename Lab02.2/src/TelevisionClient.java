class TelevisionClient {
    public static void main(String[] args) {


        Television tv1 = new Television(65,"Sony");
        Television tv2 = new Television(75,"Samsung");
        Television tv3 = new Television("Samsung");
        Television tv4 = new Television(100,"LG");
        Television tv5 = new Television("Apple",50,DisplayType.LED);


        tv1.setBrand("Samsung");
        System.out.println(tv1.getBrand());
//        tv1.setVolume(85);
//
//        tv2.setBrand("Toshiba");
//        tv2.setVolume(75);
//        tv1.setBrand("LG");
//        tv3.setVolumeToMax();
//        System.out.println(tv3.getVolume());
//        tv2.setVolumeToMin();
//        System.out.println(tv2.getVolume());
//
//
//        System.out.println(tv1.toString());
//        System.out.println(tv2.toString());
//
//        tv1.turnOff();
//        tv2.turnOff();
//        tv1.turnOn();
//        tv2.turnOn();
//
//        System.out.println(Television.getInstanceCount());
//        tv1.setVolume(55);
//
//        System.out.println(tv1.getDisplay());
//
//        System.out.println(tv2.getDisplay());
//
//        System.out.println(tv3.getDisplay());
//
//        System.out.println(tv4.getDisplay());


    }
}
