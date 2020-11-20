package KodluyoruzHwWeek2;

public class MobilePhones {

    private String modelName;
    private String imeiNumber;
    private String versionNumber;
    private int memoryCapacity;
    private double screenSize;


    public MobilePhones() {
    }

    public MobilePhones(String modelName, String imeiNumber, String versionNumber, int memoryCapacity, double screenSize) {
        this.modelName = modelName;
        this.imeiNumber = imeiNumber;
        this.versionNumber = versionNumber;
        this.memoryCapacity = memoryCapacity;
        this.screenSize = screenSize;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getImeiNumber() {
        return imeiNumber;
    }

    public void setImeiNumber(String imeiNumber) {
        this.imeiNumber = imeiNumber;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void call() {
        System.out.println(this.getClass().getSimpleName() + " Arama Yaptı");
    }

    public void sendingSMS() {
        System.out.println(this.getClass().getSimpleName() + " SMS gönderdi");
    }
    public void getInfo(){
        String s = "Model Name = " + this.getModelName()
                + "\nIMEI Number = " + this.getImeiNumber()
                + "\nVersion Number = " + this.getVersionNumber()
                + "\nMemory Capacity = " + this.getMemoryCapacity() + " MB"
                + "\nScreen Size = " + this.getScreenSize() + " INC";
        System.out.println(s);
    }


}
