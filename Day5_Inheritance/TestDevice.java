package Day5_Inheritance;

class Device {
    int deviceId;
    String status;

    Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    double temperatureSetting;

    Thermostat(int deviceId, String status, double temp) {
        super(deviceId, status);
        this.temperatureSetting = temp;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status + ", Temp: " + temperatureSetting);
    }
}

public class TestDevice {
    public static void main(String[] args) {
        Thermostat t = new Thermostat(101, "Active", 22.5);
        t.displayStatus();
    }
}