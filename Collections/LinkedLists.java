package Collections;

import java.util.LinkedList;
// -----Ordered Lists----- Both Array and Linked Lists. They allow duplicates. Maintain insertion order.
// ----When To Use LinkedLists-----
//1) If application involves frequent data manipulation (additions and deletions) particularly at the beginning or end of the collection, or if you need to use the collection as a Queue/Deque.
// 2) Implementing queues(FIFO - add elements via tail and Remove elements via head) and deques(Double Ended Queues- FIFO & LIFO) - optimized to add/remove elements from the ends.
// 3) Implementing undo/redo-style structures.

public class LinkedLists {

    public static void main(String[] args){
// Reference with Array List file.They share majority of the methods. Since they implement interface List.
// Due to the shared interface. Devs can write polymorphic code like this below, to enable faster
// switching of implementation without touching the rest of the code.

        // List<String> pets = new LinkedList<>();
        LinkedList<String> pets = new LinkedList<>();

        pets.add("Sparky");
        pets.add("Sting");
        pets.add("Coco");

        pets.remove(2);

        System.out.println("The Linked List is as follows : " + "\n" + pets);

        // Iterating through the linkedlist can be done using for loop or forEach method
        for(String str:pets){

        System.out.println(str);
        }




    }
    
}
