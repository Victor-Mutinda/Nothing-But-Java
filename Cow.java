public class Cow extends Animal {

    public void makeSound(){
        System.out.println("Cow makes moo moo");
        super.makeSound(); // super keyword is used to call the parent class method
    }
}
