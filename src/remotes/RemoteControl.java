package remotes;

import devices.Device;

public class RemoteControl {
    public static Device chooseDevice(Device dev) {
        dev.activeDevice();
        return dev;
    }

    public   boolean turnDeviceON(Device d, boolean status) {
        if (status) {
            System.out.println("Turning the "+d.getDeviceName()+" on...");
            return true;
        }else {
            return false;
        }

    }
    public boolean turnDeviceOFF(Device d, boolean status){
        if (!status) {
            System.out.println("Turning the "+d.getDeviceName()+" off...");
            return false;
        } else {
            return true;
        }
    }
}
