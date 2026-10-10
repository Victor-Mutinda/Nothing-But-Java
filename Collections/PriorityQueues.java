package Collections;

import java.util.PriorityQueue;
// Priority queue is a queue(FIFO) where elements are ordered based on the priority. Not based on insertion order.
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
        System.out.println("QUEUE 1 \n"+pets); // Ishma is the head, followed by Ishmael and Lola. Ordered based on alphabetical order

// peek() method - retrieves the head but doesn't remove it from the queue. Ishma is the head because it has the smallest priority level
        System.out.println("Accessed Element is : "+ pets.peek());
//poll() method - retrieves the head but removes it from the queue.
        System.out.println("Removed Element is : " + pets.poll());
// Final Queue
        System.out.println(pets);

// Removing an element from the queue
        pets.remove("Lola");
        pets.add("Alpha");

// When Using Iterator and for loops, There's no guarantee that the elements will be
// traversed in the order of priority. Using peek()/poll() is the ONLY SURE BET.

// Looping through the queue using enhanced for loop
        System.out.println("Looping through use of enhanced for loop");
        for(String pet:pets){
                System.out.println(pet);
        }        
// Loop using forEach() method
        System.out.println("Looping through use of enhanced for loop");
        pets.forEach((pet) -> {
                System.out.println(pet);
        });
// Loop using iterator method
        System.out.println("Looping through Iterator method");
// var is a reserved keyword. Automatically infers iterate is of type Iterator<String> based on the return type of the iterator() method.
// You can use this instead of Iterator<String> iterate = pets.iterator();
        var iterate = pets.iterator();
        while(iterate.hasNext()){
                System.out.println(iterate.next());
        }
// Looping using poll(), your queue will be emptied. So to loop through without emptying the queue
// we clone the original queue and use the cloned to analyze the elements
        PriorityQueue<String> clonedPets = new PriorityQueue<>(pets);

        System.out.println("Loop using poll() method");
        while(!clonedPets.isEmpty()){
                System.out.println("Element: " + clonedPets.poll());
        }




      
    }
}
