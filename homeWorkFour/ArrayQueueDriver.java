// ArrayQueueDriver.java
// Starter file for the Queue portion of the Data Structures assignment.
// DO NOT change the class name or the signature of main().
// Implement ONLY the method for your assigned task (e.g., runQ2_CallCenterQueue).

public class ArrayQueueDriver {

    public static void main(String[] args) {
        // TODO: Uncomment EXACTLY ONE of the following lines,
        // then implement that method below.

        // runQ1_PrintQueue();
        // runQ2_CallCenterQueue();
        // runQ3_ThemeParkRideLine();
        // runQ4_CustomerServiceTickets();
        // runQ5_TaskSchedulingQueue();
        // runQ6_CheckoutLine();
        // runQ7_MessageQueueChatApp();
        // runQ8_PrintSpoolingBurst();
        runQ9_RoundRobinService();
    }

    // Q1 – Print Queue
    private static void runQ1_PrintQueue() {
        // TODO: Implement task Q1 here.
        ArrayQueue<String> queue = new ArrayQueue<>();
        queue.offer("hw1.pdf");
        queue.offer("hw2.pdf");
        queue.offer("hw3.pdf");
        System.out.println(queue.poll());
        queue.offer("hw4.pdf");
        System.out.println(queue.poll());
    }

    // Q2 – Call Center Queue
    private static void runQ2_CallCenterQueue() {
        // TODO: Implement task Q2 here.
        ArrayQueue<String> queue = new ArrayQueue<>();
        queue.offer("James");
        queue.offer("Alex");
        queue.offer("Diego");
        System.out.println(queue.poll());
        queue.offer("Didi");
        System.out.println(queue.poll());
    }

    // Q3 – Theme Park Ride Line
    private static void runQ3_ThemeParkRideLine() {
        // TODO: Implement task Q3 here.
        ArrayQueue<String> line = new ArrayQueue<>();
        line.offer("James");
        line.offer("Alex");
        line.offer("Diego");
        System.out.println(line.poll());
        line.offer("Didi");
        System.out.println(line.poll());
    }

    // Q4 – Customer Service Tickets
    private static void runQ4_CustomerServiceTickets() {
        // TODO: Implement task Q4 here.
        ArrayQueue<Integer> tickets = new ArrayQueue<>();
        tickets.offer(1);
        tickets.offer(2);
        tickets.offer(3);
        System.out.println(tickets.poll());
        tickets.offer(4);
        System.out.println(tickets.poll());
    }

    // Q5 – Task Scheduling Queue
    private static void runQ5_TaskSchedulingQueue() {
        // TODO: Implement task Q5 here.
        ArrayQueue<String> queue = new ArrayQueue<>();
        queue.offer("MOV R0,#5");
        queue.offer("MOV R1,#7");
        queue.offer("ADD R2,R0,R1");
        System.out.println(queue.poll());
        queue.offer("ADD R2,R0,R2");
        System.out.println(queue.poll());
    }

    // Q6 – Checkout Line at a Store
    private static void runQ6_CheckoutLine() {
        // TODO: Implement task Q6 here.
        ArrayQueue<String> customers = new ArrayQueue<>();
        customers.offer("Customer 1");
        customers.offer("Customer 2");
        customers.offer("Customer 3");
        customers.offer("Customer 4");
        System.out.println(customers.poll());
        customers.offer("Customer 5");
        System.out.println(customers.poll());
        System.out.println(customers.poll());
    }

    // Q7 – Message Queue in a Chat App
    private static void runQ7_MessageQueueChatApp() {
        // TODO: Implement task Q7 here.
        ArrayQueue<String> messages = new ArrayQueue<>();
        messages.offer("Hello");
        System.out.println(messages.poll());
        messages.offer("Hello");
        System.out.println(messages.poll());
        messages.offer("How are you doing?");
        System.out.println(messages.poll());
        messages.offer("Good and yourself?");
        System.out.println(messages.poll());
        messages.offer("Good as well");
        System.out.println(messages.poll());
    }

    // Q8 – Print Spooling with Burst of Jobs
    private static void runQ8_PrintSpoolingBurst() {
        // TODO: Implement task Q8 here.
        ArrayQueue<String> queue = new ArrayQueue<>();
        queue.offer("Hw1");
        queue.offer("Class Notes");
        queue.offer("Invoice");
        queue.offer("Hw2");
        queue.offer("Grades");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

    // Q9 – Round-Robin Service (Single Queue Version)
    private static void runQ9_RoundRobinService() {
        // TODO: Implement task Q9 here.
        ArrayQueue<String> queue = new ArrayQueue<>();
        String[] test = {"Abigial", "Angel", "Ricky", "Alexis", "Rohn"};
        int limit = 6;
        for (int i = 0; i < test.length; i++) {
            queue.offer(test[i]);
        }
        for (int i = 0; i < limit && 0 < test.length; i++) {
            String person = queue.poll();
            System.out.println(person);
            switch (person){
                case "Angel":
                    queue.offer("Angel");
                    break;
                case "Rohn":
                    queue.offer("Rohn");
                    break;
                default:
                    continue;
            }
        }
    }
}
