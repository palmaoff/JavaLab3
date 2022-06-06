import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    private static final int N = 100000;

    public static void main(String[] args) {
        
        long[] array_list_time = ArrayListTest();

        long[] linked_list_time = LinkedListTest();

        PrintTable(array_list_time, linked_list_time);

    }

    public static void PrintTable(long[] array_list_time, long[] linked_list_time) {

        System.out.print("Number of operations: ");
        System.out.println(N);

        // Names of colums
        System.out.print("Type of list");
        System.out.print("\t");
        System.out.print("add method");
        System.out.print("\t");
        System.out.print("get method");
        System.out.print("\t");
        System.out.print("delete method");
        System.out.println();

        // Array List
        System.out.print("Array List");
        System.out.print("\t\t");
        System.out.print(array_list_time[0]);
        System.out.print("\t\t");
        System.out.print(array_list_time[1]);
        System.out.print("\t\t");
        System.out.print(array_list_time[2]);
        System.out.println();

        // Linked List
        System.out.print("Linked List");
        System.out.print("\t\t");
        System.out.print(linked_list_time[0]);
        System.out.print("\t\t");
        System.out.print(linked_list_time[1]);
        System.out.print("\t\t");
        System.out.print(linked_list_time[2]);
        System.out.println();

    }
    
    public static long[] ArrayListTest() {

        ArrayList<Integer> array_list = new ArrayList<Integer>();
        long[] timeElapsed = new long[3];

        // add
        long start = System.currentTimeMillis();

        for (int i = 0; i < N; i++) {
            array_list.add(i);
        }

        long finish = System.currentTimeMillis();
        timeElapsed[0] = finish - start;

        // get
        start = System.currentTimeMillis();

        for (int i = 0; i < N; i++) {
            array_list.get(i);
        }

        finish = System.currentTimeMillis();
        timeElapsed[1] = finish - start;

        // delete
        start = System.currentTimeMillis();

        for (int i = 0; i < N; i++) {
            array_list.remove(N - i - 1);
            // array_list.remove(0);
        }

        finish = System.currentTimeMillis();
        timeElapsed[2] = finish - start;

        return timeElapsed;

    }

    public static long[] LinkedListTest() {

        LinkedList<Integer> linked_list = new LinkedList<Integer>();
        long[] timeElapsed = new long[3];

        // add
        long start = System.currentTimeMillis();

        for (int i = 0; i < N; i++) {
            linked_list.add(i);
        }
        
        long finish = System.currentTimeMillis();
        timeElapsed[0] = finish - start;

        // get
        start = System.currentTimeMillis();

        for (int i = 0; i < N; i++) {
            linked_list.get(i);
        }

        finish = System.currentTimeMillis();
        timeElapsed[1] = finish - start;

        // delete
        start = System.currentTimeMillis();

        for (int i = 0; i < N; i++) {
            linked_list.remove(N - i - 1);
            // linked_list.remove(0);
        }

        finish = System.currentTimeMillis();
        timeElapsed[2] = finish - start;

        return timeElapsed;

    }

}
