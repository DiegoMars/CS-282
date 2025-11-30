// CSLinkedListDriver.java
// Starter file for the Linked List portion of the Data Structures assignment.
// DO NOT change the class name or the signature of main().
// Implement ONLY the method for your assigned task (e.g., runLL3_CourseWaitlist).

import java.util.Comparator;
import java.util.Iterator;

public class CSLinkedListDriver {

    public static void main(String[] args) {
        // TODO: Uncomment EXACTLY ONE of the following lines,
        // then implement that method below.

        // runLL1_Playlist();
        // runLL2_TodoList();
        // runLL3_CourseWaitlist();
        // runLL4_TextEditorLines();
        // runLL5_RecentlyContacted();
        // runLL6_ShoppingListAddAfter();
        // runLL7_BusRouteStops();
        // runLL8_EventScheduleSorted();
        // runLL9_BugTrackerRemoveById();
        runLL10_PlaylistShuffleCopy();
    }

    // LL1 – Music Playlist Manager
    private static void runLL1_Playlist() {
        // TODO: Implement task LL1 here.
        // See the assignment handout for the scenario description.
        CSLinkedList<String> playlist = new CSLinkedList<>();
        playlist.add("heart pt. 6");
        playlist.add("She Don't Ever Lose Her Groove");
        playlist.add("Tu Seras Mi Baby");
        playlist.add("Nangs");
        System.out.println(playlist);
        playlist.add(0, "Sienna");
        System.out.println(playlist);
        playlist.remove(2);
        System.out.println(playlist);
    }

    // LL2 – To-Do List with Priorities
    private static void runLL2_TodoList() {
        // TODO: Implement task LL2 here.
        CSLinkedList<String> todoList = new CSLinkedList<>();
        todoList.add("Do dishes");
        System.out.println(todoList);
        todoList.add("Do laundry");
        System.out.println(todoList);
        todoList.add(0, "Do essay");
        System.out.println(todoList);
        todoList.remove(0);
        System.out.println(todoList);
    }

    // LL3 – Course Waitlist (No Duplicates)
    private static void runLL3_CourseWaitlist() {
        // TODO: Implement task LL3 here.
        // You may add a helper method addIfAbsent(E item) to CSLinkedList if needed.
        CSLinkedList<String> waitlist = new CSLinkedList<>();
        waitlist.addIfAbsent("Alex");
        waitlist.addIfAbsent("Jesus");
        waitlist.addIfAbsent("Diego");
        waitlist.addIfAbsent("Isabel");
        waitlist.addIfAbsent("Diego");
        waitlist.addIfAbsent("Diana");
        waitlist.addIfAbsent("Isabel");
        System.out.println(waitlist);
    }

    // LL4 – Text Editor Line Manager
    private static void runLL4_TextEditorLines() {
        // TODO: Implement task LL4 here.
        CSLinkedList<String> lines = new CSLinkedList<>();
        lines.add("\"Fire And Ice\" by Robert Frost");
        lines.add("Some say the world will end in fire,");
        lines.add("Some say in ice.");
        lines.add("From what I\'ve tasted of desire");
        lines.add("I hold with those who favor fire.");
        lines.add("But if it had to perish twice,");
        lines.add("I think I know enough of hate");
        lines.add("To say that for destruction ice");
        lines.add("Is also great");
        lines.add("And would suffice.");
        lines.add(5,"");
        lines.remove(10);

        Iterator<String> i = lines.iterator();
        int lineNum = 1;
        while (i.hasNext()) {
            System.out.print(lineNum + " ");
            System.out.println(i.next());
            lineNum++;
        }
    }

    // LL5 – Recently Contacted Friends (Move to Front)
    private static void runLL5_RecentlyContacted() {
        // TODO: Implement task LL5 here.
        // You may add a helper method moveToFront(E item) to CSLinkedList if needed.
        CSLinkedList<String> friends = new CSLinkedList<>();
        friends.add("Alex");
        friends.add("Jesus");
        friends.add("Diego");
        friends.add("Isabel");
        friends.add("Diana");
        System.out.println(friends);
        friends.moveToFront("Diana");
        friends.moveToFront("Diego");
        friends.moveToFront("Le Grand");
        System.out.println(friends);
    }

    // LL6 – Shopping List: Insert After Item
    private static void runLL6_ShoppingListAddAfter() {
        // TODO: Implement task LL6 here.
        // You may add a helper method addAfter(E target, E newItem) to CSLinkedList if needed.
        CSLinkedList<String> list = new CSLinkedList<>();
        list.add("Eggs");
        list.add("Milk");
        list.add("Bread");
        System.out.println(list);
        list.addAfter("Eggs", "Bananas");
        list.addAfter("Bread", "Apples");
        System.out.println(list);
    }

    // LL7 – Bus Route Stops
    private static void runLL7_BusRouteStops() {
        // TODO: Implement task LL7 here.
        CSLinkedList<String> stops = new CSLinkedList<>();
        stops.add("Northridge");
        stops.add("Pacoima");
        stops.add("San Ferando");
        stops.add("Van Nuys");
        stops.add("Sylmar");
        System.out.println(stops);
        stops.add(2, "Santa Monica");
        System.out.println(stops);
        stops.remove("Pacoima");
        System.out.println(stops);
    }

    // Negative if a comes before b
    // 0 if a = b
    // Positive if a comes after b
    static Comparator<String> timeCmp = (String a, String b) -> (int)(a.compareTo(b));
    private static void runLL8_EventScheduleSorted() {
        // TODO: Implement task LL8 here.
        // You may add a helper method addInOrder(E item, Comparator<E> cmp) to CSLinkedList if needed.
        CSLinkedList<String> events = new CSLinkedList<String>();
        events.addInOrder("09:00 Class", timeCmp);
        events.addInOrder("10:00 Break", timeCmp);
        events.addInOrder("08:00 Breakfast", timeCmp);
        events.addInOrder("07:45 Wake Up", timeCmp);
        events.addInOrder("07:50 Brush Teeth", timeCmp);
        for (String e : events) {
            System.out.println(e);
        }
    }

    // LL9 – Bug Tracker List (Remove by ID)
    private static void runLL9_BugTrackerRemoveById() {
        // TODO: Implement task LL9 here.
        // You may add a helper method removeFirstOccurrence(E item) to CSLinkedList if needed.
        CSLinkedList<Integer> ids = new CSLinkedList<Integer>();
        ids.add(5);
        ids.add(6);
        ids.add(8);
        ids.add(8);
        ids.add(6);
        ids.add(9);
        ids.add(9);
        ids.removeFirstOccurrence(6);
        ids.removeFirstOccurrence(9);
        ids.removeFirstOccurrence(9);
        System.out.println(ids);
    }

    // LL10 – Playlist Shuffle Copy
    private static void runLL10_PlaylistShuffleCopy() {
        // TODO: Implement task LL10 here.
        // You may add a helper method copy() to CSLinkedList if needed.
        CSLinkedList<Integer> ids = new CSLinkedList<Integer>();
        ids.add(5);
        ids.add(6);
        ids.add(8);
        CSLinkedList<Integer> idsCopy = ids.copy();
        idsCopy.add(100000);
        System.out.println(ids);
        System.out.println(idsCopy);
    }
}
