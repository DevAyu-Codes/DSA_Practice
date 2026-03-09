/*
Explaination:
Improvement over binary search
Best used for "uninformly" distributed data "guesses" where a value might be based on calculated probe results
If probe is incorrect, search area is narrowed and a new probe is calculated

Runtime Complexity (average case): O(log(log(n)))
Runtime Complexity (worst case): O(n) [value increase exponentially]
*/

public class InterpolationSearch {
    public static void main(String args[]){
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int index = interpolationSearch(array, 256);

        if(index!=-1){ // if element is found
            System.out.print("Element found at index: "+index); // printing output
        }
        else{ // if element is not found
            System.out.println("Element not found!"); // printing output
        }
    }

    // Custom InterpolationSearch method
    private static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1; // setting high as last index
        int low = 0; // setting low as first index

        while(value >= array[low] && value <= array[high] && low <= high){ // while condition to keep running until the value index is found
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]); // formula to guess the probe
            System.out.println("Probe: "+ probe); // printing probe for explaination

            if(array[probe] == value){ // checking if value at probe is target
                return probe; // returning probe as index if true
            }
            else if (array[probe] < value){ // checking if value at probe is less than target
                low = probe + 1; // setting new low
            }
            else{ // checking if value at probe is greater than target
                high = probe - 1; // setting new high
            }
        }
        return -1; // value does not exist in array, returning -1
    }
}