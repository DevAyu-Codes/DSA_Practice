package DynamicArray;
/*
Explaination:
Dynamic Array is a resizable array that has index so easy to search elements (random access)
Good locality of reference and data cache utilization
Easy to insert/Delete at end
Wastes more memory, Shifting elements or expanding/shrinking array is time consuming (o(n))
Also known as ArrayList in java, Vector in c++, Array in javascript and list in python

Commands:
add(value) to add the element to array, insert(index, value) to add to a certain index
delete(value) to remove the elementfrom array
search(value) to search for the index of the element in array
isEmpty() to check if the array is empty
.size and .capacity to check the size and capacity of the array respectively

Usage:
Shopping Carts: When a user is adding items to an online cart, you don't know if they will buy 1 item or 50. A dynamic array grows to accommodate as many items as they click.
Reading Files/Databases: If you are writing a script to read a log file line-by-line, you likely don't know the exact number of lines. A dynamic array allows you to just keep calling add() until the file ends.
*/

public class DynamicArrayPractice{
    public static void main(String[] args){

        DynamicArray dynamicArray = new DynamicArray(5); // giving custom initial capacity

        dynamicArray.add("A"); // adding data to the array
        dynamicArray.add("B"); // adding data to the array
        dynamicArray.add("C"); // adding data to the array
        dynamicArray.insert(0, "X"); // inserting data to the array at a certain index
        dynamicArray.delete("A"); // deleting data from the array
        dynamicArray.insert(1, "A"); // inserting data to the array at a certain index
        dynamicArray.add("D"); // adding data to the array
        dynamicArray.add("E"); // adding data to the array

        // after adding "D" the array is completely full and when "E" is added the array capacity grows by 2 times

        dynamicArray.delete("X"); // deleting data from the array
        dynamicArray.delete("A"); // deleting data from the array
        dynamicArray.delete("B"); // deleting data from the array

        // after deleting "B" the array size is using 3 times less than the capacity so the array shrinks by 2 times

        System.out.println(dynamicArray.search("C")); // searching for the index of a value in array
        System.out.println(dynamicArray); // printing the array
        System.out.println("Empty: " + dynamicArray.isEmpty()); // checking if the array is empty
        System.out.println("Size: " + dynamicArray.size); // checking the size of the array
        System.out.println("Capacity: " + dynamicArray.capacity); // checking the capacity of the array
    }
}