package Encapsulation;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    // getters for Employee attributes
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public String getDepartment(){
        return department;
    }
    // Setters
    public void setId(int id){
        if(id < 0){
            System.out.println("Employee ID can't be less than 0. TRY AGAIN!!");
        } else {
            this.id =  id ;
        }   
    }

    public void setName(String name){
        // trim() remove leading and trailing spaces from a string. 
        if (name == null || name.trim().isEmpty()){
            System.out.println("Employee name can't be empty. Try Again!!");
        }
        else{
            this.name = name;
        }
    }

    public void setSalary(double salary){
        if(salary < 0){
            System.out.println("Salary can't be a Negative value.Try again!!");
        }
        else {
            this.salary = salary;
        }
    }

    public void setDepartment(String department){
         if (department.isEmpty()){
            System.out.println("Department name can't be empty. Try Again!!");
        }
        else{
            this.department = department;
        }
    }

    public void displayInfo(){
        System.out.println("---Employee Details---" + "\nEmployee ID : " + id +
        "\nEmployee Name : " + name + "\nSalary : " + salary + "\nAssigned Department : " + department );
    
    }

}
