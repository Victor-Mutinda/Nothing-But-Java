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
    
}
