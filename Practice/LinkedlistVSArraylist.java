// ArrayList uses indexing so its fast in retreiving values
// ArrayList has to transfer all the elements one by one while removing so its slay in the middle but fast in start and end

import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedlistVSArraylist {
    public static void main(String args[]){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime; // start time for the test
        long endTime; // end time for the test
        long elapsedTime; // elapsed time for the test

        // insertng values
        for(int i=0; i<1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        // ********************* LinkedList *********************
        startTime = System.nanoTime();  // start time by system nanoseconds

        // linkedList.get(0); // getting value at index 0
        // linkedList.get(500000); // getting value at index 500000
        // linkedList.get(999999); // getting value at index 999999
        // linkedList.remove(0); // removing value at index 0
        // linkedList.remove(500000); // removing value at index 500000
        linkedList.remove(999999); // removing value at index 999999

        endTime = System.nanoTime(); // end time by system nanoseconds
        elapsedTime = endTime - startTime; // elapsed time by system nanoseconds
        System.out.println("LinkedList: " + elapsedTime + "ns"); // printing the final time taken by the operation

        // ********************* ArrayList **********************
        startTime = System.nanoTime();  // start time by system nanoseconds

        // arrayList.get(0); // getting value at index 0
        // arrayList.get(500000); // getting value at index 500000
        // arrayList.get(999999); // getting value at index 999999
        // arrayList.remove(0); // removing value at index 0
        // arrayList.remove(500000); // removing value at index 500000
        arrayList.remove(999999); // removing value at index 999999

        endTime = System.nanoTime(); // end time by system nanoseconds
        elapsedTime = endTime - startTime; // elapsed time by system nanoseconds
        System.out.println("ArrayList: " + elapsedTime + "ns"); // printing the final time taken by the operation
    }
}