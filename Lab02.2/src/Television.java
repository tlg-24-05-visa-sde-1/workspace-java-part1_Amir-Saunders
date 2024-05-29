import java.util.Arrays;

class Television {

    private String brand;
    private int volume;
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;
    private DisplayType display = DisplayType.LED;
    private int oldVolume;
    private boolean isMuted;



    public static final String[] VALID_BRANDS = {"Samsung","LG","Sony","Toshiba"};

//    Declaration: This line declares a private field named display of type DisplayType. It's declaring a variable that can hold an instance of the DisplayType enum.
//
//    Initialization: The = sign initializes the display field with the value DisplayType.LED. This means that by default, when a new Television object is created, its display field will be set to DisplayType.LED.
//
//    Enum Assignment: DisplayType.LED is an enum constant. Assuming that DisplayType is an enum type, LED is one of its possible values. It represents a specific type of display, likely indicating that the television has an LED display.



    public Television() {
        instanceCount++;
//        This no args constructor increments the instanceCount variable. A no args constructor also allows you to set values
    }


    public Television(String brand) {
        this();
//        the this keyword calls the no args constructor above. This keyword will call whwtever  constrcutor you have depending on the arguments inside the braces (). Since we have nothing isnide the braces it calls the no args constrcutor we have above which increments InstanceCount. Then the getInstanceCount() method returns the value of Instancecount. Since this is inside all of our other constructors with arguments what will happen is that instanceCount will be incramented everytime a constructor with args is called. using the this keyowrd because this is calling the no args constructor that increments instanceCount
//
        setBrand(brand);

    }

    public Television(int volume, String brand) {
        this();
        this.brand = brand;
        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
//            This will check if the volume is within the proper range before the volumr is set in the constructor
            System.out.println("Error: volume out of range");
        }else{
            this.volume = volume;
        }

    }
    public Television(String brand, int volume, DisplayType display) {
     this(volume,brand);
        setDisplay(display);
    }


//    public: Indicates that the variable can be accessed from outside the class.
//    static: Indicates that the variable is a class-level variable, shared among all instances of the class. It can be accessed using the class name.
//    final: Indicates that the variable is a constant and cannot be reassigned after initialization. Once initialized, its value cannot be changed.





    public boolean isMuted() {
        return isMuted;
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        boolean isValid = false;
//        switch (brand){
//            case "LG", "Sony","Toshiba":
//                this.brand = brand;
//                break;
//            default:
//                System.out.println("This " + brand + " is not a valid brand");
////                This checks if the brand is any of the three options set the brand to whatever it is out of the three options. If it's not any of the three options then the default message will sout'
//        }
        for (String validBrand : VALID_BRANDS) {
           if (brand.equals(validBrand)) {
              this.brand = brand;
              isValid = true;
               break;
            }
        }
        if (!isValid) {
            System.out.printf("Error: invalid brand: %s. Must be one of %s. \n",brand, Arrays.toString(VALID_BRANDS));
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
            System.out.println("This is not a valid volume");

        }else {
           this.volume = volume;
           isMuted = false;
        }
    }


    @Override
    public String toString() {
        return "Television{" +
                "brand='" + brand + '\'' +
                ", volume=" + volume +
                ", display=" + display +
                ", oldVolume=" + oldVolume +
                ", isMuted=" + isMuted +
                '}';
    }

    public void setVolumeToMax() {
        this.volume = MAX_VOLUME;
//        you can set the volume using this to the variable MAX_VOLUME uisng this method using the this keyword. It is a static variable but the methods can acces them to be used on an instance method
    }

    public void setVolumeToMin() {
        this.volume = MIN_VOLUME;
    }
    public void turnOn() {
        System.out.println("Turning on your " + brand + " TV to volume " + volume);
        System.out.println(getBrand() + "   " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye" + brand + " TV to volume " + volume);
        System.out.println(getBrand() + "   " + getVolume());
    }

    public static int getInstanceCount() {
        return instanceCount;
//        This will tell you the value of instantceCount.
    }

    public void mute(){
        if(volume != MIN_VOLUME){
           oldVolume = getVolume();
           setVolume(MIN_VOLUME);
           isMuted = true;
        }else{
            setVolume(oldVolume);
            isMuted = false;
        }
    }

//    public void unmute(int volume){
//        if(volume == MIN_VOLUME){
//            setVolume(this.volume);
//            System.out.println("The device is un-muted The volume " + volume);
//        }
//    }

}
