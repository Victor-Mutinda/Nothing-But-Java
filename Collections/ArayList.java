package Collections;

import java.util.ArrayList;
// -----Ordered Lists----- Both Array and Linked Lists. They allow duplicates.

// An ArrayList is a resizable array. Its size can grow or shrink dynamically unlike a normal array,
// It can allow duplicates. Maintains insertion order on the element.

// ----When To Use ArrayLists-----
// 1.) For most standard applications, especially when your program requires frequent lookups, index-based access and minimal removals from the middle of the list.

public class ArayList {
    public static void main(String[] args){
// Creating an Array List
        ArrayList<String> pets = new ArrayList<>();
// Add items in a list.
        pets.add("Sparky");
        pets.add("Sting");
        pets.add("Kamai");
        pets.add("Bob");
        pets.add("Santa");
        pets.add("Serena");
        pets.add("Rafiki");
        pets.add("Ishmael");
        pets.add("Ishamael");
        pets.add("Lola");

        System.out.println("List of all my Dog Pets since 2010 till to date:");
        System.out.println(pets);

// Add an item at a specific index position
        pets.add(10, "Shepherd");
        System.out.println(pets);

// Removing an item at a specific index position
        pets.remove(8);
         System.out.println(pets);
// Removing an item without using index position
        pets.remove("Ishmael");
        System.out.println(pets);

// Updating an item at a index position
        pets.set(0, "Sparky The great");
        System.out.println(pets);

        System.out.println(pets.get(1)); // returns Sting
        System.out.println(pets.contains("Rafiki")); // returns true


// Looping using forEach() method
            
            

    }
}
    
