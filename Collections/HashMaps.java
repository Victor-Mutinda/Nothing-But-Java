package Collections;

import java.util.Map;
import java.util.HashMap;

// Map stores elements in key-value pairs. Key is unique. Values can be duplicates.
// Has Map doesn't maintain the order.
// HashMap is not thread-safe, to make it synchronized, use Collections.synchronizedMap().

public class HashMaps {
    public static void main(String[] args){

        HashMap<Integer, String> employees = new HashMap<>();

// Adding elements - put() method
        employees.put(1,"Victor");
        employees.put(2,"Ian");
        employees.put(3,"Gavin");
    System.out.println("My employees are : +\n " + employees);

// Accessing/retrieving values associated with a certain key  - get() method
        System.out.println("The employee Name for employee ID 1 is : " + employees.get(1));
// Overwriting / Replacing an existing value using put() 
        employees.put(1,"Victor Mutinda");
        System.out.println("The New employee Name for employee ID 1 is : " + employees.get(1));
//Removing an element through the use of the key - remove()
        employees.remove(3); // deletes element 3
        // values() method - returns all values in the HashMap
        System.out.println("Employees : " + employees.values());
// Traversing a HashMap using for-each loop
        for(Map.Entry<Integer,String> itr : employees.entrySet()){
            System.out.println("employeeID : " + itr.getKey() + " Name : " + itr.getValue());

        }




    }
    
}
