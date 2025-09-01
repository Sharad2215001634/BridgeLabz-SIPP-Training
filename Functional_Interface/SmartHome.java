
interface SmartDevice {
    void turnOn();
    void turnOff();
}


class Light implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("💡 Light is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("💡 Light is now OFF.");
    }
}

class AirConditioner implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("❄️ Air Conditioner is cooling...");
    }

    @Override
    public void turnOff() {
        System.out.println("❄️ Air Conditioner is turned OFF.");
    }
}

class Television implements SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("📺 TV is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("📺 TV is now OFF.");
    }
}


public class SmartHome {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AirConditioner();
        SmartDevice tv = new Television();

        
        light.turnOn();
        ac.turnOn();
        tv.turnOn();

        System.out.println("\nTurning everything OFF...");

        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}
