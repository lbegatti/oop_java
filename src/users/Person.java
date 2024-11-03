package users;

import devices.Device;
import devices.Projector;
import devices.SurroundSystem;
import devices.TV;
import remotes.RemoteControl;

public class Person {
    public static void main(String[] args) {
        System.out.println("Connecting to a device...\n");
        Device proj = new Projector();
        Device tv = new TV();
        Device ss = new SurroundSystem();
        RemoteControl remote = new RemoteControl();

        Device selected_dev = RemoteControl.chooseDevice(tv);
        remote.turnDeviceON(selected_dev,true);
        remote.turnDeviceOFF(selected_dev,false);
    }
}
