package CSArrayList;

import java.util.ArrayList;
import java.util.Random;

public class CSArrayListTest {
    public static void main(String[] args) {
        // // Collection<String> testCollection = new CSArrayList<>();
        // CSArrayList<String> testCollection = new CSArrayList<>();
        // testCollection.add("A");
        // testCollection.add("B");
        //
        // // Iterator<String> iterator = testCollection.iterator();
        // // while (iterator.hasNext()) {
        // //     System.out.println(iterator.next());
        // // }
        // System.out.println(testCollection);
        // testCollection.remove("A");
        // testCollection.clear();
        // System.out.println(testCollection);
        // testCollection.ensureCapacity(25);
        // testCollection.trimToSize();
        // System.out.println(testCollection.isEmpty());
        // System.out.println(testCollection.size());
        // System.out.println(testCollection.contains("B"));
        // System.out.println(((CSArrayList<String>) testCollection).indexOf("B"));

        int N = 1_000_000; // or larger
        int iterations = 10;

        // For testing CSArrayList
        float csAverageAppend = 0;
        float csAverageGet = 0;
        double csHighestAppend = 0;
        double csHighestGet = 0;
        double csLowestAppend = 100000000;
        double csLowestGet = 100000000;
        for (int count = 0; count < iterations; count++){
            CSArrayList<Integer> csTest = new CSArrayList<>();
            long tCS0 = System.nanoTime();
            for (int i = 0; i < N; i++) csTest.add(i);
            long tCS1 = System.nanoTime();
            Random rCS = new Random(0);
            long sCS = 0;
            for (int i = 0; i < N; i++) sCS += csTest.get(rCS.nextInt(N));
            long tCS2 = System.nanoTime();
            double append = (tCS1-tCS0)/1e6;
            double get = (tCS2-tCS1)/1e6;
            System.out.printf("CSArrayList: append = %.1fms, get = %.1fms\n", append, get);
            csAverageAppend += append;
            csAverageGet += append;
            if (append > csHighestAppend) csHighestAppend = append;
            if (append > csHighestGet) csHighestGet = get;
            if (append < csLowestAppend) csLowestAppend = append;
            if (append < csLowestGet) csLowestGet = get;
        }
        csAverageAppend = csAverageAppend / iterations;
        csAverageGet = csAverageGet / iterations;
        System.out.printf("CSArrayList Highest: append = %.1fms, get = %.1fms\n", csHighestAppend, csHighestGet);
        System.out.printf("CSArrayList Lowest: append = %.1fms, get = %.1fms\n", csLowestAppend, csLowestGet);
        System.out.printf("CSArrayList Averages: append = %.1fms, get = %.1fms\n", csAverageGet, csAverageGet);
        System.out.print("\n");

        // // For testing java.util.ArrayList
        float averageAppend = 0;
        float averageGet = 0;
        double highestAppend = 0;
        double highestGet = 0;
        double lowestAppend = 100000000;
        double lowestGet = 100000000;
        for (int count = 0; count < iterations; count++){
            ArrayList<Integer> a = new ArrayList<>();
            long t0 = System.nanoTime();
            for (int i = 0; i < N; i++) a.add(i);
            long t1 = System.nanoTime();
            Random r = new Random(0);
            long s = 0;
            for (int i = 0; i < N; i++) s += a.get(r.nextInt(N));
            long t2 = System.nanoTime();
            double append = (t1-t0)/1e6;
            double get = (t2-t1)/1e6;
            System.out.printf("ArrayList: append = %.1fms, get = %.1fms\n", append, get);
            averageAppend += append;
            averageGet += append;
            if (append > highestAppend) highestAppend = append;
            if (append > highestGet) highestGet = get;
            if (append < lowestAppend) lowestAppend = append;
            if (append < lowestGet) lowestGet = get;
        }
        averageAppend = averageAppend / iterations;
        averageGet = averageGet / iterations;
        System.out.printf("ArrayList Highest: append = %.1fms, get = %.1fms\n", highestAppend, highestGet);
        System.out.printf("ArrayList lowest: append = %.1fms, get = %.1fms\n", lowestAppend, lowestGet);
        System.out.printf("ArrayList Averages: append = %.1fms, get = %.1fms\n", averageGet, averageGet);
    }
}
