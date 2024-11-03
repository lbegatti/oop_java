package devices;

public class TV implements Device {
    public void activeDevice() {
        System.out.println(this.getClass().getName()+" connected.");
    }

    @Override
    public String getDeviceName() {
        return this.getClass().getName();
    }
}
