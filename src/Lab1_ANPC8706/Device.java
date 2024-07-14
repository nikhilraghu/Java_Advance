package Lab1_ANPC8706;

public class Device {
    private String brand;
    private String model;
    private boolean powerStatus;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.powerStatus = false;
    }

    public void displayInfo() {
        System.out.println("Device Brand: " + brand);
        System.out.println("Device Model: " + model);
    }

    public void powerOn() {
        if (!powerStatus) {
            powerStatus = true;
            System.out.println(brand + " " + model + " is now powered on.");
        } else {
            System.out.println(brand + " " + model + " is already on.");
        }
    }

    public void powerOff() {
        if (powerStatus) {
            powerStatus = false;
            System.out.println(brand + " " + model + " is now powered off.");
        } else {
            System.out.println(brand + " " + model + " is already off.");
        }
    }


    public boolean isPowerStatus() {
        return powerStatus;
    }
}
