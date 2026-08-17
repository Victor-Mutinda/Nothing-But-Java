package Inheritance;

public class Main {
    public static void main(String[] args){

        // Inheritance and Normal polymorphism

        Manager chiefTechnology = new Manager(1,"Victor",150000,8);
        
        Developer webDev = new Developer(2,"Annette", 120000, "java");

        chiefTechnology.displayInfo();
        webDev.displayInfo();

        System.out.println("------Run-Time Polymorphism Below-------");

        Employee director = new Manager(3,"Chuck",100000,20);
        // director is a variable of type Employee reference, but the actual object is from Manager
        // The reference type determines what methods are available to you at compile time.
        // The actual object type determines which overriden methods execute at runtime. 
        // Hence the name runtime polymorphism or dynamic-method dispatch
        director.displayInfo();

        Employee softwareDev = new Developer(4,"Lola",80000,"Python");
        softwareDev.displayInfo();

        
    }

    
}
