package Inheritance;

public class Manager extends Employee{

    private int teamSize;

    public Manager(int id, String name, int salary, int teamSize){
        super(id,name,salary); // Constructor chaining avoid code duplication. I inherit from Employee
        // because Employee class already knows how to handle employee info.
        this.teamSize = teamSize;  
    }

    @Override
    // This below is called Method Overriding. Implementing a similar method but differently.
    public void displayInfo(){
        super.displayInfo(); // calls the General displayInfo() method from the super class
        System.out.println(name + " is a manager. He has a team of " + teamSize); // the new overriden method.
    }

      @Override
    public double calculateBonus(){
        double initialBonus = super.calculateBonus();

        double extraHours = 0.3 * this.salary;

        double totalBonus = initialBonus + extraHours ;

        System.out.println("The total Bonuses for this Month for " + this.name + " are : " + totalBonus);
        
        return totalBonus;

    }

}
