package Constructors;

public class Main {
    public static void main(String[] args){

        Employee employee1 = new Employee();
        Employee employee2 = new Employee(2,"Victor Mutinda","Problem Management",150000);
        Employee employee3 = new Employee(3,"Annette Munyiva","Mass Communication",120000);

        Employee employee4 = new Employee(4,"Cj Rafiki","Security");
        
    
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();

        employee4.displayInfo();


    
    }
}
