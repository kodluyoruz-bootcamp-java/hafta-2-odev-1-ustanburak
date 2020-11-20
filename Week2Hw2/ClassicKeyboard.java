package KodluyoruzHwWeek2;

import Interfaces.KeyboardInterface;

public class ClassicKeyboard implements KeyboardInterface {

    @Override
    public void showKeyboardInfo() {
        System.out.println(this.getClass().getSimpleName() + " Classic Keyboard kullanıyor");

    }
}
