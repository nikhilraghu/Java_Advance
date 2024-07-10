package Lab1_ANPC8706;

public class Smartphone extends Device {
    private String operatingSystem;
    private String cameraResolution;

    public Smartphone(String brand, String model, String operatingSystem, String cameraResolution) {
        super(brand, model);
        this.operatingSystem = operatingSystem;
        this.cameraResolution = cameraResolution;
    }

    public void displaySmartphoneInfo() {
        displayInfo();
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Camera Resolution: " + cameraResolution);
    }

    public void takePhoto() {
        if (isPowerStatus()) {
            System.out.println("Taking a photo with " + cameraResolution + " resolution.");
        } else {
            System.out.println("Cannot take photo. The smartphone is off.");
        }
    }


    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getCameraResolution() {
        return cameraResolution;
    }
}

