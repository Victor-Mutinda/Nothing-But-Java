package Constructors;

public class Employee {
    int id;
    String name;
    String department;
    int salary;

    // Parameterized constructor to initialize the employee object
    // Comprehensive/Central constructor that initializes all attributes
    public Employee(int id, String name, String department, int salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // default constructor with sensible default values
    //Constructor chaining - technique of calling one constructor from another constructor in the same class
    public Employee(){
        //this.id = 0;
        //this.name = "unknown";
        //this.department = "unknown";
        //this.salary = 0;
        this(0,"unknown","unknown",0);
    }
    
    // Constructor calls comprehensive constructor but sets salary to 0 by default.
    // This saves code duplication  
    public Employee(int id, String name, String department){
        //this.id = id;
        //this.name = name;
       // this.department = department;
       // this.salary = 0;
       this(id,name,department,0);
    }
    
    
    public void displayInfo(){
        System.out.println("Employee ID:" + id + ", \nName: " + name + ", \nDepartment: " + department + ", \nSalary: " + salary);
    }

    
}
