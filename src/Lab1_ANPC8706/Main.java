package Lab1_ANPC8706;

public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone("Apple", "iPhone 14", "iOS 16", "12MP");
        myPhone.displaySmartphoneInfo();
        myPhone.powerOn();
        myPhone.takePhoto();
        myPhone.powerOff();
        myPhone.takePhoto();
    }
}

