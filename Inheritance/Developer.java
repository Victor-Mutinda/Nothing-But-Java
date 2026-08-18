package Inheritance;

public class Developer extends Employee {
    
    private String programmingLanguage;

    public Developer(int id, String name, int salary, String programmingLanguage){
        super(id,name,salary);
        this.programmingLanguage = programmingLanguage;  
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("The programming language " + name + " uses is " + programmingLanguage);
    }

    @Override
    public double calculateBonus(){
        double initialBonus = super.calculateBonus();

        double extraHours = 0.2 * this.salary;

        double totalBonus = initialBonus + extraHours ;

        System.out.println("The total Bonuses for this Month for " + name + " are : " + totalBonus);
        
        return totalBonus;

    }
    
}
