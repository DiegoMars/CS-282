package CSArrayList;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CSArrayListTest {
    public static void main(String[] args) {
//        Collection<String> testCollection = new CSArrayList<>();
        CSArrayList<String> testCollection = new CSArrayList<>();
        testCollection.add("A");
        testCollection.add("B");

//        Iterator<String> iterator = testCollection.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        System.out.println(testCollection);
//        testCollection.remove("A");
//        testCollection.clear();
//        System.out.println(testCollection);
//        testCollection.ensureCapacity(25);
//        testCollection.trimToSize();
//        System.out.println(testCollection.isEmpty());
//        System.out.println(testCollection.size());
//        System.out.println(testCollection.contains("B"));
//        System.out.println(((CSArrayList<String>) testCollection).indexOf("B"));

    }
}