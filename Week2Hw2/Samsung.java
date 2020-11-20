package KodluyoruzHwWeek2;

import Interfaces.KeyboardInterface;
import Interfaces.SamsungInterface;

public class Samsung extends MobilePhones implements SamsungInterface, KeyboardInterface {
    private ClassicKeyboard keyboard = new ClassicKeyboard();


    public Samsung() {
    }

    public Samsung(String modelName, String imeiNumber, String versionNumber, int memoryCapacity, double screenSize) {
        super(modelName, imeiNumber, versionNumber, memoryCapacity, screenSize);
    }


    @Override
    public void fileSharing() {
        System.out.println(this.getClass().getSimpleName() + " Dosya Paylaştı");



    }

    @Override
    public void MP3Player() {
        System.out.println(this.getClass().getSimpleName() + " Mp3 player çalıyor..");

    }

    @Override
    public void showKeyboardInfo() {
        System.out.println(this.getClass().getSimpleName() + " Classic Keyboard kullanıyor..");
    }
}
