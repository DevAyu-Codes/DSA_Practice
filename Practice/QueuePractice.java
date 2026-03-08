/*
Explaination:
Queue is a FIFO data structure (first in first out)
A collection designed for holding elements prior to processing
Linear data structure
In java: Queue is an interface and inherits from collection class thats why we used LinkedList

Commands:
offer(value) or add(value) to push the object to queue, also known as enqueue
poll() or remove() to remove the first element, also known as dequeue
peek() or element() to get value of the first element without removing, element will through error if queue is empty
isEmpty() to check if the queue is empty 
size() to check the size of the queue

Usage:
Keyboard Buffer (letters should appear on the screen in the order they're pressed)
Printer  Queue (Print jobs should be completed in order)
Used in LinkedLists, PriorityQueues, Breadth-First-Search
*/

import java.util.Queue;
import java.util.LinkedList;

public class QueuePractice{

    // Manual search function
    public static int getQueueIndex(Queue<String> queue, String target) {
        int index = 0;
        for (String item : queue) {
            if (item != null && item.equals(target)) {
                return index;
            }
            index++;
        }
        return -1; // Not found
    }
    public static void main(String[] args){

        Queue<String> queue = new LinkedList<String>();

        System.out.println("Is queue empty?: "+queue.isEmpty()); // True as queue is empty

        queue.offer("Karen"); // adding to the queue (add(value) can also be used)
        queue.offer("Chad"); // adding to the queue (add(value) can also be used)
        queue.offer("Steve"); // adding to the queue (add(value) can also be used)
        queue.offer("Harold"); // adding to the queue (add(value) can also be used)

        System.out.println("Is queue empty?: "+queue.isEmpty()); // False as queue is not empty
        System.out.println("Size of the queue is "+queue.size()); // To get the size of the queue
        System.out.println("is Harold in queue?: "+queue.contains("Harold")); // To check if an element is in the queue
        System.out.println("what is the index of Harold in queue?: "+getQueueIndex(queue, "Harold")); // To get the index of an element in queue

        String inFront = queue.peek(); // Can assign the first element's value withut dequeue
        System.out.println("The person first in the line is "+inFront); // Printing the assigned value

        queue.poll(); // Will remove the first one eg. Karen (remove() can also be used)
        queue.poll(); // Will remove the first one eg. Chad (remove() can also be used)
        
        // Can use element() to peak but it will through exception if queue is empty, peek will not
        inFront = queue.peek(); // Can assign the first element's value withut dequeue
        System.out.println("The person first in the line is "+inFront); // Printing the assigned value

        System.out.println("Queue values are: "+queue); // Prints the queue
    }
}