/*
Explaination:
Stack is a LIFO data structure (last in first out)
Stores objetcts into a sort of "vertical tower"

Commands:
push(value) to push the object to stack
pop() to remove the topmost element
peek() to get value of topmost element without removing
search(value) to search the element, index starts from 1 and -1 if value not found
empty() to check if the stack is empty 

Usage:
undo/redo feature in text editors
moving back/forward through browser history
backtracing algorithms (maze, file directories)
calling functions (call stack)
*/

import java.util.Stack;

public class StackPractice{
    public static void main(String[] args){


        Stack<String> stack = new Stack<String>();

        System.out.println("Is stack empty?: "+stack.empty()); // True as stack is empty

        stack.push("GTA 1"); // Pushing to stack
        stack.push("GTA 2"); // Pushing to stack
        stack.push("GTA 3"); // Pushing to stack
        stack.push("GTA VC"); // Pushing to stack
        stack.push("GTA SA"); // Pushing to stack
        stack.push("GTA IV"); // Pushing to stack
        stack.push("GTA V"); // Pushing to stack

        System.out.println("Is stack empty?: "+stack.empty()); // False as stack is not empty

        stack.pop(); // Will remove the most recent eg. GTA V (top one)
        stack.pop(); // Will remove the most recent eg. GTA IV (top one)
        String myfavGame = stack.pop(); // Can assign the topmost element's value and pop at the same time

        String myfavGame2 = stack.peek(); // Can assign the topmost element's value withut popping

        System.out.println("My favourite game is "+myfavGame); // Printing the assigned value
        System.out.println("My 2nd favourite game is "+myfavGame2); // Printing the assigned value

        System.out.println(myfavGame2+" is at index "+stack.search(myfavGame2)); // Search for an element within the stack (indexing starts from 1), if not in stack you'll get -1

        System.out.println("Stack values are: "+stack); // Prints the stack


    }
}