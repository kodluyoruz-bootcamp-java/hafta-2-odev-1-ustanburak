package KodluyoruzHwWeek2;

public class Main {
    public static void main(String[] args) {

        Apple apple=new Apple();
        apple.setModelName ("Iphone 11");
        apple.setVersionNumber("00000");
        apple.setImeiNumber("kafa1500");
        apple.setMemoryCapacity(128);
        apple.setScreenSize(6.06);
        apple.getInfo();
        apple.screenShare();
        apple.call();
        apple.sendingSMS();
        apple.videoCall();
        apple.showKeyboardInfo();

        System.out.println("--------------------------------");

        Samsung samsung =new Samsung();
        samsung.setModelName("S20");
        samsung.setVersionNumber("20000");
        samsung.setImeiNumber("kafa1501");
        samsung.setMemoryCapacity(256);
        samsung.setScreenSize(6.2);
        samsung.getInfo();
        samsung.fileSharing();
        samsung.call();
        samsung.sendingSMS();
        samsung.MP3Player();
        samsung.showKeyboardInfo();

    }
}
