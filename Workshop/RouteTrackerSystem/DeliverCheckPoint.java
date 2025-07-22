package Workshop.RouteTrackerSystem;

class DeliveryCheckpoint extends Checkpoint {
    public DeliveryCheckpoint(String checkpointId, String locationName, double distance,int expected, int actual) {
        super(checkpointId, locationName, distance, expected, actual);
    }
    @Override
    public boolean isCritical() {
        return true;
    }
    @Override
    public String getType() {
        return "DeliveryCheckpoint";
    }
    @Override
    public double calculatePenalty() {
        return isDelayed() ? (actualDuration - expectedDuration) * 2.0 : 0.0;
    }
}
class FuelCheckpoint extends Checkpoint {
    public FuelCheckpoint(String checkpointId, String locationName, double distance,int expected, int actual) {
        super(checkpointId, locationName, distance, expected, actual);
    }
    @Override
    public boolean isCritical() {
        return true;
    }

    @Override
    public String getType() {
        return "FuelCheckpoint";
    }

    @Override
    public double calculatePenalty() {
        return isDelayed() ? 10.0 : 0.0;
    }
}
class RestCheckpoint extends Checkpoint {
    public RestCheckpoint(String checkpointId, String locationName, double distance,int expected, int actual) {
        super(checkpointId, locationName, distance, expected, actual);
    }

    @Override
    public boolean isCritical() {
        return false;
    }

    @Override
    public String getType() {
        return "RestCheckpoint";
    }

    @Override
    public double calculatePenalty() {
        if (isDelayed() && (actualDuration - expectedDuration) > 30) {
            return (actualDuration - expectedDuration) * 0.5;
        }
        return 0.0;
    }
}

