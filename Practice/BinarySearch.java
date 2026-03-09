/*
Explaination:
Binary Search is a search algorithm that finds the position of a target value within a 'sorted' array
Half of the array is eliminated during each 'step'
Moves to middle, check if that is the target, if not checks if the target is greater of less than middle and eliminates the other half, repeats
Efficient in large data sets but not in small

Runtime Complexity: O(log n)
*/

// import java.util.Arrays; // if default Arrays.binarySearch(array, target) needs to be used

public class BinarySearch {
    public static void main(String args[]){
        int[] array = new int[1000000];
        int target = 777777; // target value to search

        // filling our array
        for(int i=0; i<array.length; i++){
            array[i] = i;
        }

        // int index = Arrays.binarySearch(array, target); // already defined function in java.util.Arrays

        int index = binarySearch(array, target); // calling out own search method

        if(index!=-1){ // if target is found
            System.out.print("Target found at index: "+index); // printing output
        }
        else{ // if target is not found
            System.out.println("Target not found!"); // printing output
        }
    }

    // our own binary search method
    private static int binarySearch(int[] array, int target) {
        int low = 0; // start of array
        int high = array.length - 1; // end of array

        // while loop to keep checking and eliminating until the value is found
        while(low <= high){
            int middle = low + (high - low) / 2; // calculating middle index
            int value = array[middle]; // getting middle value

            System.out.println("Middle: " + value); // printing middle value to keep track of steps

            if(value < target){ // checking if target is greater (eliminating lower array portion)
                low = middle + 1; // setting new low
            }
            else if(value > target){  // checking if target is smaller (eliminating higher array portion)
                high = middle - 1; // setting new high
            }
            else{ // index found
                return middle; // returning index
            }
        }

        return -1; // value does not exist in array, returning -1
    }
}