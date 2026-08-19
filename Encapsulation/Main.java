package Encapsulation;

public class Main {
    public static void main(String[] args){
        Employee employee1 = new Employee();

        employee1.setId(1);
        employee1.setName("Victor");
        employee1.setSalary(-50000);
        employee1.setDepartment("Service Management");

        System.out.println("---Employee Details---");
        System.out.println(employee1.getName() +"\n" + employee1.getSalary() + "\n" + employee1.getDepartment() );

        employee1.displayInfo();
    }
    
}
