package KodluyoruzHwWeek2;

import Interfaces.KeyboardInterface;

public class TouchKeyboard implements KeyboardInterface {

    @Override
    public void showKeyboardInfo() {
        System.out.println(this.getClass().getSimpleName() + " Touchpad Kullanıyor");

    }
}