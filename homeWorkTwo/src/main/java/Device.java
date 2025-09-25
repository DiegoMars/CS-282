public class Device {
    public String model = "Generic Device";
    protected int powerLevel; // Protected members are inherited

    // Required constructor for base initialization
    public Device(int startPower) {
        this.powerLevel = startPower;
        System.out.println("--- Device initialized. ---");
    }

    // Method to modify state safely
    public void setPower(int newLevel) {
        if (newLevel >= 0) {
            powerLevel = newLevel;
        }
    }

    // Base implementation for description
    public void printDescription() {
        System.out.println("Device Model: " + model + ", Current Power: " + powerLevel + " Watts.");
    }

}
