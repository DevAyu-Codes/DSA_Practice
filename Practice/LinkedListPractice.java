/*
Explaination:
LinkedList is dynamic a data struction (allocates needed memory while running) that stores memory address of the next node (singly), if address of both previous or next node is stored (doubly) and can be traversed, and if a full circle (circular)
Easy to insert/delete node (o(1)) compared to arrays
Search is time consuming (o(n)) and more memory in case of doubly or circular linked list, no random access
Nodes are stored in non-consecutive memory locations and are linked via pointers
Can be used to mimic a stack or queue

Commands:
offer(value) or push(value) to push the object to linkedlist, add(index, value) to add to a certain index
poll() or pop() to remove the first element, remove(value) to remove a particular node
peekFirst() or peekLast() to get value of the first and last element respectively
addFirst() or addLast() to add value to the first and last respectively
removeFirst() or removeLast() to remove the first and last value respectively

Usage:
Implement Stacks/Queues
GPS Navigation
Music Playlist
*/

import java.util.LinkedList;

public class LinkedListPractice{
    public static void main(String[] args){

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.push("A"); // adding to the linkedlist (offer(value) can also be used)
        linkedList.push("B"); // adding to the linkedlist (offer(value) can also be used)
        linkedList.push("C"); // adding to the linkedlist (offer(value) can also be used)
        linkedList.push("D"); // adding to the linkedlist (offer(value) can also be used)
        linkedList.push("F"); // adding to the linkedlist (offer(value) can also be used)

        linkedList.add(1, "E"); // adding to a specific index

        System.out.println(linkedList); // printing linkedlist

        linkedList.pop(); // Removing the value at tail

        linkedList.remove("E"); // removing a specific value

        System.out.println(linkedList); // printing linkedlist

        System.out.println(linkedList.indexOf("B")); // getting index of a specific value

        System.out.println(linkedList.peekFirst()); // getting tail value
        System.out.println(linkedList.peekLast()); // getting head value

        linkedList.addFirst("E"); // making new tail
        linkedList.addLast("0"); //making new head

        System.out.println(linkedList); // printing linkedlist

        linkedList.removeFirst(); // removing tail
        linkedList.removeLast(); // removing head

        System.out.println(linkedList); // printing linkedlist
    }
}