abstract class SmartphoneFactory {
    abstract public Phone CreatePhone();
}


public class Main {
    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        Phone phone = appleFactory.CreatePhone();
        System.out.println(phone.getOs());

        AndroidFactory androidFactory = new AndroidFactory();
        phone = androidFactory.CreatePhone();
        System.out.println(phone.getOs());

        WindowsFactory windowsFactory = new WindowsFactory();
        phone = windowsFactory.CreatePhone();
        System.out.println(phone.getOs());
    }
}