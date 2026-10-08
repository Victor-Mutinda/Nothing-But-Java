package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

// Linked Hash Sets maintain insertion order and allow unique values only.
// Insertion order means - if you remove an element and add it again. It will be added at the end of the list.
// Combines features of a LinkedList and HashSet

public class LinkedHashSets {
    public static void main(String[] args){

        LinkedHashSet<String> pets = new LinkedHashSet<>();
// Adding elements.
        pets.add("Serena");
        pets.add("Rafiki");
        pets.add("Ishmael");
// Element below wont be ignored since its a different case. LinkedHashSet is case-sensitive.
        pets.add("rafiki");
// It shares majority of the functions with the rest.
        pets.remove("Ishmael");
    

// Loop using iterator method
        System.out.println("Looping through Iterator method");
        Iterator<String> iterate = pets.iterator();

        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }
// Loop using enhanced for loop
    System.out.println("Looping through enhanced for loop");
    for(String pet:pets){
        System.out.println(pet);
    }
// Looping using forEach() method

    System.out.println("Looping through forEach() method");
    pets.forEach((pet) -> {
        System.out.println(pet);
    });



    
    }
}
