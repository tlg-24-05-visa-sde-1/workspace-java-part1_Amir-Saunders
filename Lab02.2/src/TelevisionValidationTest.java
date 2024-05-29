public class TelevisionValidationTest {

    public static void main(String[] args) {
        Television tv1 = new Television();
       Television tv2 = new Television(45,"LG");
       tv1.setVolume(105);
        tv1.setBrand("Mercedes");
        tv2.mute();
       System.out.println(tv2.getVolume());

       System.out.println(tv2.getVolume());

        tv2.mute();
        System.out.println(tv2.getVolume());
        tv2.mute();
        System.out.println(tv2.getVolume());
//        tv2.setBrand("APPLE");
        tv2.setBrand("Samsung");
        System.out.println(tv2.getBrand());
        tv2.setVolume(76);
        tv2.mute();
        System.out.println(tv2.getVolume());
        tv2.mute();
        System.out.println(tv2.getVolume());
    }
}
