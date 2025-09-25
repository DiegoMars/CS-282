// Exercise 4
public class Microwave extends Device {
    int maxTime;

    public Microwave(int startPower, int maxCookingTime) {
        super(startPower);
        this.maxTime = maxCookingTime;
    }

    public void heatFood() {
        System.out.println("Food is heating");
    }

    // Exercise 6
    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Max Cooking Time: " + maxTime);
    }
}
