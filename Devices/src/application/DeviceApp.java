package application;

import entity.*;
import dao.*;

public class DeviceApp {

    public static void main(String[] args) {
    	
    	Dao dao = new Dao();
    	
        Device l1 = new Device("Dell Latitude 7390");
        dao.saveDevice(l1);
        System.out.println("Device saved.");
        System.out.println(l1.getDeviceId());

        dao.loadDeviceById(1);

        System.out.println();
        System.out.println(dao.updateDeviceDescription(1, "Dell Latitude 7290 - updated"));

        System.out.println();
        dao.loadDeviceById(1);

        System.out.println();
        dao.removeDevice(1);
    }
}

