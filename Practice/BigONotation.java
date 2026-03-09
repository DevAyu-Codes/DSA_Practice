/*
Explaination:
It explains how code slows as data grows.
1. Describes the performance of an algorithm as the amount of data increases.
2. Machine Independent (Number of steps to complete).
3, Ignore smaller operations eg. O(n+1) = O(n).

Some of the Big Os are:  O(1), O(n), O(log n), O(n^2), O(nlog n), O(n!)
Explaination of these with graphs can be found at: https://github.com/DevAyu-Codes/DSA_Practice/blob/main/Practice/output.md#7-bigonotationjava
*/

public class BigONotation {

    // Linear O(n) Algo eg. n = 1000000, Steps = 1000000
    public static int linearAddUp(int n){
        int sum = 0;
        for(int i=0; i<+n; i++){
            sum += i;
        }
        return sum;
    }

    // Constant O(1) Algo eg. n = 1000000, Steps = 3
    public static int constantAddUp(int n){
        int sum = n*(n+1)/2;
        return sum;
    }
    public static void main(String args[]){

        long startTime; // start time for the test
        long endTime; // end time for the test
        long elapsedTime; // elapsed time for the test

        startTime = System.nanoTime();  // start time by system nanoseconds

        int linear = linearAddUp(1000000); // removing value at index 999999

        endTime = System.nanoTime(); // end time by system nanoseconds
        elapsedTime = endTime - startTime; // elapsed time by system nanoseconds
        System.out.println("Linear: " + elapsedTime + "ns"); // printing the final time taken by the operation

        startTime = System.nanoTime();  // start time by system nanoseconds

        int constant = constantAddUp(1000000); // removing value at index 999999

        endTime = System.nanoTime(); // end time by system nanoseconds
        elapsedTime = endTime - startTime; // elapsed time by system nanoseconds
        System.out.println("Constant: " + elapsedTime + "ns"); // printing the final time taken by the operation
    }
}