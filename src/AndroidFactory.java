public class AndroidFactory extends SmartphoneFactory {
    public Phone CreatePhone() {
        return new AndroidPhone();
    }
}
