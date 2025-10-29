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
        int iterations = 500;

        // For testing CSArrayList
        float csAverageAppend = 0;
        float csAverageGet = 0;
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
            // System.out.printf("CSArrayList: append = %.1fms, get = %.1fms\n", append, get);
            csAverageAppend += append;
            csAverageGet += append;
        }
        csAverageAppend = csAverageAppend / iterations;
        csAverageGet = csAverageGet / iterations;
        System.out.printf("CSArrayList Averages: append = %.1fms, get = %.1fms", csAverageGet, csAverageGet);
        System.out.println("\n");

        // // For testing java.util.ArrayList
        float averageAppend = 0;
        float averageGet = 0;
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
            // System.out.printf("ArrayList: append = %.1fms, get = %.1fms\n", append, get);
            averageAppend += append;
            averageGet += append;
        }
        averageAppend = averageAppend / iterations;
        averageGet = averageGet / iterations;
        System.out.printf("ArrayList Averages: append = %.1fms, get = %.1fms", averageGet, averageGet);

        // After 10 runs
        // CSArrayList: append = 8.7ms, get = 24.0ms
        // CSArrayList: append = 16.4ms, get = 20.7ms
        // CSArrayList: append = 22.0ms, get = 20.1ms
        // CSArrayList: append = 17.0ms, get = 19.0ms
        // CSArrayList: append = 4.4ms, get = 13.1ms
        // CSArrayList: append = 4.8ms, get = 11.7ms
        // CSArrayList: append = 5.0ms, get = 11.6ms
        // CSArrayList: append = 21.8ms, get = 15.2ms
        // CSArrayList: append = 17.9ms, get = 19.6ms
        // CSArrayList: append = 8.5ms, get = 15.3ms
        // Averages: append = 12.6ms, get = 12.6ms
        //
        // ArrayList: append = 7.6ms, get = 17.6ms
        // ArrayList: append = 23.6ms, get = 16.8ms
        // ArrayList: append = 4.4ms, get = 11.9ms
        // ArrayList: append = 4.8ms, get = 14.0ms
        // ArrayList: append = 4.3ms, get = 12.0ms
        // ArrayList: append = 2.4ms, get = 13.0ms
        // ArrayList: append = 2.7ms, get = 13.3ms
        // ArrayList: append = 3.1ms, get = 13.1ms
        // ArrayList: append = 24.7ms, get = 13.1ms
        // ArrayList: append = 2.7ms, get = 12.6ms
        // Averages: append = 8.0ms, get = 8.0ms
        //
        // While here we can see that ArrayList is better, for some reason on other runs, it can
        // go either way
    }
}
