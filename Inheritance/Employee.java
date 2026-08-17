package Inheritance;

public class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary){
        this.id = id ;
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo(){
        System.out.println("---Employee Details--- \n" + name + " earns :: " + salary);
    }
    
}
