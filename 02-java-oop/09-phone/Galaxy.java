public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return this.getRingtone();
    }
    @Override
    public String unlock() {
        return "Galaxy unlocked";
    }
    @Override
    public void displayInfo() {
        System.out.println("Galaxy " + this.getVersionNumber() + " with " + this.getCarrier());
        System.out.println("Battery Percentage: " + this.getBatteryPercentage());             
    }
}

