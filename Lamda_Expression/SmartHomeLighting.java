@FunctionalInterface
interface LightBehavior {
    void activate();
}

public class SmartHomeLighting {
    public static void main(String[] args) {
        
        LightBehavior motionTrigger = () -> 
            System.out.println("🔦 Motion detected → Turning ON hallway lights.");

        LightBehavior timeTrigger = () -> 
            System.out.println("⏰ Evening time → Dimming lights to 50%.");

        LightBehavior voiceTrigger = () -> 
            System.out.println("🎤 Voice command → Switching ON living room lights.");

        LightBehavior partyMode = () -> 
            System.out.println("🎉 Party mode → Activating disco lights!");

        
        simulateTrigger("Motion", motionTrigger);
        simulateTrigger("Time", timeTrigger);
        simulateTrigger("Voice", voiceTrigger);
        simulateTrigger("Custom", partyMode);
    }

    
    private static void simulateTrigger(String triggerName, LightBehavior behavior) {
        System.out.println("\nTrigger: " + triggerName);
        behavior.activate();
    }
}
