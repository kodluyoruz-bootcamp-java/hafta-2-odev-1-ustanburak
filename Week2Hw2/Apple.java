package KodluyoruzHwWeek2;

import Interfaces.AppleInterface;
import Interfaces.KeyboardInterface;

public class Apple extends MobilePhones implements AppleInterface, KeyboardInterface {

    private TouchKeyboard keyboard = new TouchKeyboard();


    public Apple() {
    }

    public Apple(String modelName, String imeiNumber, String versionNumber, int memoryCapacity, double screenSize) {
        super(modelName, imeiNumber, versionNumber, memoryCapacity, screenSize);
    }

    @Override
    public void videoCall() {
        System.out.println(this.getClass().getSimpleName() + " Video Araması Yaptı");

    }

    @Override
    public void screenShare() {
        System.out.println(this.getClass().getSimpleName() + " Ekranı Paylaştı");

    }

    @Override
    public void showKeyboardInfo() {
        System.out.println(this.getClass().getSimpleName() + " Dokunmatik ekran kullanıyor");

    }
}
