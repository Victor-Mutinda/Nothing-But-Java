package Collections;

import java.util.HashSet;
import java.util.Iterator;

// Hash Sets doesn't maintain insertion order of elements. Therefore index-based access isnt possible.
// Store unique elements - ignores duplicates. 

public class HashSets {
    
    public static void main(String[] args) {
        
        HashSet<String> pets = new HashSet<>();

// adding elements. Share majority of the methods with the likes of array list
        pets.add("Kamai");
        pets.add("Bob");
        pets.add("Santa");
// The element below wont be ignored since its a different case. HashSet is case-sensitive.
        pets.add("kamai");


        // remove an element
        pets.remove("Bob");

//Iterating through the set using Iterator method
        System.out.println("Looping through Iterator method");

        Iterator<String> iterator = pets.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());  
        }
// Iterating using enhanced for loop
    System.out.println("Enhanced for-Loop method");

        for(String str : pets){
            System.out.print(str + " ");
        }
        



    }
}
