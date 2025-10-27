package CSArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CSArrayListTest {
    private CSArrayList<String> testCollection;

    @BeforeEach
    void setUp() {
        testCollection = new CSArrayList<>();
        testCollection.add("A");
        testCollection.add("B");
        testCollection.add("C");
    }

    @Test
    void testIndex() {
        assertEquals("A", testCollection.get(0));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            testCollection.get(testCollection.size());  // This should throw ArrayIndexOutOfBoundsException
        });
        assertEquals("C", testCollection.get(testCollection.size()-1));
    }

    @Test
    void testResize() {
        // Honest a lil vague, so I am just guessing here
        // Adding a bunch of stuff
        for (int i = 0; i < 10000; i++) {
            testCollection.add(String.valueOf(i));
        }
        assertTrue(testCollection.size() >= 10000);
    }

    @Test
    void testSearch() {
       assertEquals(0, testCollection.indexOf("A"));
       testCollection.remove("A");
       assertEquals(-1, testCollection.indexOf("A"));

       assertEquals(-1, testCollection.indexOf(null));
    }

    @Test
    void testRemove() {
        testCollection.remove("A");
        assertFalse(testCollection.contains("A"));
    }
}
