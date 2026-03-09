/*
Explaination:
Iterates through a collection one at a time
Fast for searches of small to medium data sets but slow for large data sets
Does not need to be sorted
Useful for data structures that does not have random access (LinkedList)

Runtime Complexity: O(n)
*/

public class LinearSearch {
    public static void main(String args[]){
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        int index = linearSearch(array, 5); // calling linearSearch method

        if(index!=-1){ // if element is found
            System.out.print("Element found at index: "+index); // printing output
        }
        else{ // if element is not found
            System.out.println("Element not found!"); // printing output
        }
    }

    // custom linear seach method using loops
    private static int linearSearch(int[] array, int value) {
        for(int i=0; i<array.length; i++){
            if(array[i] == value){
                return i;
            }
        }

        return -1;
    }
}