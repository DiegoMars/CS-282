public class Main {
    public static void attemptToChangePrimitive(int val) {
        System.out.println("Inside method, parameter 'val' starts as: " + val);
        val = 99; // Local change
        System.out.println("Inside method, parameter 'val' is now: " + val);
    }

    // Used for Exercise 5
    public static int sumCoordinates(Point... points) {
        // Implementation needed for Exercise 5
        int sum = 0;
        for (int i = 0; i < points.length; i++) {
            sum += points[i].x;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Exercise 1
        Point startPoint;
        startPoint = new Point(10, 20);
        System.out.println(startPoint.x);
        startPoint.move(5, -3);
        startPoint.printState();

        // Exercise 2
        int originalValue = 50;
        attemptToChangePrimitive(originalValue);
        System.out.println(originalValue);
        // The reason it doesn't change the orignalValue, is because when passing a primitive value to a function, it
        // passes by value. Meaning that a copy of the value is passed to the function, so any changes made to the copy
        // does not affect the orginal value

        // Testing Exercise 3
        Point test = new Point();
        test.printState();

        // Testing Exercise 5
        System.out.println(sumCoordinates(new Point(0,0), new Point(1,1), new Point(2,2)));
        Point[] test2 = {new Point(3,3), new Point(4,4), new Point(5,5), new Point(6,6), new Point(7,7)};
        System.out.println(sumCoordinates(test2));

        // Exercise 7
        Device d1 = new Device(10);
        Microwave m1 = new Microwave(20, 30);
        Device polyDevice;
        polyDevice = m1;
        polyDevice.printDescription();
        // It outputs the printDescription of the microwave. This is because we used a subtype to initialize the
        // polyDevice. At run type, the JVM will determine the actual class of the object despite what the reference
        // variable is. So at run time, polyDevice would be made a Microwave class

        // Testing Exercise 8
        if (polyDevice instanceof Microwave) {
            Microwave polyDevice1 = (Microwave)polyDevice;
            polyDevice1.heatFood();
        }
    }

}
