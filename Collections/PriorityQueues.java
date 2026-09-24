package Collections;

import java.util.Queue;
import java.util.PriorityQueue;
// Priority queue is a queue where elements are ordered based on the priority. Not based on insertion order.
// By default, it uses natural ordering (min-heap), but a custom comparator can be used to define different priorities.
// min-heap - sorts based on smallest value as highest priority in Integers && alphabetical order in Strings.
// Null insertion is impossible
public class PriorityQueues {
    public static void main(String[] args){
           

    PriorityQueue<String> pets = new PriorityQueue<>();

// Adding Elements
        pets.add("Ishmael");
        pets.add("Ishma");
        pets.add("Lola");

// peek() method - retrieves the head but doesn't remove it from the queue. Ishma is the head because it has the smallest priority level
        System.out.println("Accessed Element is : "+ pets.peek());
//poll() method - retrieves the head but removes it from the queue.
        System.out.println("Removed Element is : " + pets.poll());
// Final Queue
        System.out.println(pets);


      
    }
}
