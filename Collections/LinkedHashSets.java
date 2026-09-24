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
// It shares majority of the functions with the rest.
        pets.remove("Ishmael");

// Loop using iterator method
        Iterator<String> iterate = pets.iterator();

        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }




    
    }
}
