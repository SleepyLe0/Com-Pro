public class Droid {
    private static int nextVersion;
    private String name;
    private int version;
    private int batteryLevel;

    public Droid(String name) {
        if (name == null || name.isBlank())
            this.name = "Codey";
        else
            this.name = name;
        version = nextVersion;
        nextVersion++;
        batteryLevel = 100;
    }

    public String getName() {
        return name;
    }

    public int getVersion() {
        return version;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String performTask(String task) {
        batteryLevel -= 20;
        if (batteryLevel < 0) {
            batteryLevel = 0;
            return String.format("Error, %s is out of battery", name);
        } else {
            if (batteryLevel < 20)
                return String.format("%s is performing %s : battery is running low", name, task);
            else
                return String.format("%s is performing %s", name, task);
        }
    }

    public void chargeBattery(int battery) {
        batteryLevel += battery;
        if (batteryLevel > 100)
            batteryLevel = 100;
    }

    @Override
    public String toString() {
        return String.format("DROID : %d (%s) %d", version, name, batteryLevel);
    }
}
