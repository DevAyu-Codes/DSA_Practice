package DynamicArray;

// Our manually coded dynamic array class
// We can also use ArrayList (precoded) in java
public class DynamicArray {
    int size; // current size of the array
    int capacity = 10; // default capacity is set to 10
    Object[] array;

    // constructor with no parameters
    public DynamicArray(){
        this.array = new Object[capacity];
    }

    // constructor with capacity
    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    // add function to add an elements to array
    public void add(Object data){
        if(size >= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }

    // insert function to insert an element at a certain index
    public void insert(int index, Object data){
        if(size >= capacity){
            grow();
        }
        for(int i = size; i>index; i--){
            array[i] = array[i-1];
        }
        array[index] = data;
        size++;
    }

    // delete method to delete an element
    public void delete(Object data){
        for(int i=0; i<size; i++){
            if(array[i] == data){
                for(int j=0; j<size-i-1; j++){
                    array[i+j] = array[i+j+1];
                }
                array[size-1] = null;
                size--;
                if(size <= (int) (capacity/3)){
                    shrink();
                }
                break;
            }
        }
    }

    // search function to search for an element in array
    public int search(Object data){
        for(int i=0; i<size; i++){
            if(array[i] == data){
                return i;
            }
        }
        return -1;
    }

    // grow function to automatically grow the size of array by 2 times, private as its being used within this class and not outside
    private void grow(){
        int newCapacity = (int) (capacity * 2);
        Object[] newArray = new Object[newCapacity];
        for(int i=0; i<size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    // shrink function to automatically shrink the size of array by 2 times, private as its being used within this class and not outside
    private void shrink(){
        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];
        for(int i=0; i<size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    // isEmpty function to check if the array is currently empty
    public boolean isEmpty(){
        return size == 0;
    }

    // toString function to see the array
    public String toString(){
        String string = "";
        for(int i=0; i<size; i++){ // you can use capacity instead of size to view the complete array along with nulls
            string += array[i] + ", ";
        }
        if(string != ""){
            string = "[" + string.substring(0, string.length() -2) + "]";
        }
        else{
            string = "[]";
        }
        return string;
    }
}