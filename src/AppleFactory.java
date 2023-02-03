public class AppleFactory extends SmartphoneFactory {
    public Phone CreatePhone() {
        return new IPhone();
    }
}
