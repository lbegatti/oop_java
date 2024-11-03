package devices;

import devices.Device;

public class Projector implements Device {
    @Override
    public void activeDevice() {
        System.out.println(this.getClass().getName()+" connected.");
    }

    @Override
    public String getDeviceName() {
        return this.getClass().getName();
    }
}

