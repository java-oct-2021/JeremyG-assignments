public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return this.getRingtone();
    }
    @Override
    public String unlock() {
        return "Iphone unlocked";
    }
    @Override
    public void displayInfo() {
        System.out.println("Iphone " + this.getVersionNumber() + " with " + this.getCarrier());
        System.out.println("Battery Percentage: " + this.getBatteryPercentage());           
    }
}

