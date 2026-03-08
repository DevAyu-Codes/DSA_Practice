/*
Explaination:
PriorityQueue is a FIFO data structure (first in first out)
It serves elemets with the highest priority first before elements with lower priority (Ascending Order by default, Collections.reverseOrder() for Descending)
In java: Queue is an interface and inherits from collection class thats why we used LinkedList

Commands:
offer(value) or add(value) to push the object to queue, also known as enqueue
poll() or remove() to remove the first element, also known as dequeue
peek() or element() to get value of the first element without removing, element will through error if queue is empty
isEmpty() to check if the queue is empty 
size() to check the size of the queue

Usage:
CPU Task Scheduling: Your computer's processor can only do so many things at once. It uses a Priority Queue to ensure critical system tasks (like handling a mouse click or keeping the OS stable) are executed before background tasks (like downloading an update).
Interrupt Handling: When hardware components send signals to the CPU (e.g., a hard drive finishing a read operation), these interrupts are placed in a Priority Queue so the most urgent hardware needs are addressed first.
Network Bandwidth Management: Routers use priority queues to manage traffic. For example, real-time data like Voice-over-IP (Skype/Zoom calls) gets a higher priority than standard file downloads to prevent your call from lagging.
*/

import java.util.Queue;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueuePractice{

    // Manual search function
    public static int getQueueIndex(Queue<String> queue, String target) {
        // Create a copy of the queue so we don't destroy the original
        Queue<String> copyQueue = new PriorityQueue<>(queue);
        
        int index = 0;
        // Poll (remove) elements one by one to get them in actual priority order
        while (!copyQueue.isEmpty()) {
            String item = copyQueue.poll();
            if (item != null && item.equals(target)) {
                return index;
            }
            index++;
        }
        return -1; // Not found
    }
    public static void main(String[] args){

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        System.out.println("Is queue empty?: "+queue.isEmpty()); // True as queue is empty

        queue.offer("B"); // adding to the queue (add(value) can also be used)
        queue.offer("C"); // adding to the queue (add(value) can also be used)
        queue.offer("A"); // adding to the queue (add(value) can also be used)
        queue.offer("F"); // adding to the queue (add(value) can also be used)
        queue.offer("D"); // adding to the queue (add(value) can also be used)

        System.out.println("Is queue empty?: "+queue.isEmpty()); // False as queue is not empty
        System.out.println("Size of the queue is "+queue.size()); // To get the size of the queue
        System.out.println("is F in queue?: "+queue.contains("F")); // To check if an element is in the queue
        System.out.println("what is the index of F in queue?: "+getQueueIndex(queue, "F")); // To get the index of an element in queue

        String inFront = queue.peek(); // Can assign the first element's value withut dequeue
        System.out.println("The person first in the line is "+inFront); // Printing the assigned value

        queue.poll(); // Will remove the first one eg. F (remove() can also be used)
        queue.poll(); // Will remove the first one eg. D (remove() can also be used)
        
        // Can use element() to peak but it will through exception if queue is empty, peek will not
        inFront = queue.peek(); // Can assign the first element's value withut dequeue
        System.out.println("The person first in the line is "+inFront); // Printing the assigned value

        System.out.println("Queue values are: "+queue); // Prints the queue

        while(!queue.isEmpty()){ // Printing the queue in order
            System.out.println(queue.poll());
        }
    }
}