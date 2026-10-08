public class Main {

    public static void main (String[] args){
// The above code snippet is the starting/entry point of a Java program where execution begins.
// The public keyword indicates that the method is accessed anywhere outside the class.
// static - indicates the main method belongs to the class itself rather than an instance of the class.
// void - return type of the method. It doesnt return any value.
// main - name of the method. Must be spelled exactly as main and preceeded by void.
// String[] args - parameters of the method. Meaning the method can accept 
// an array of String arguments via the command line when the program is executed.
        cars car1 = new cars();
        bikes bike1 = new bikes();


        car1.startEngine();
        bike1.rideBike();

        vehicles vehicle1 = new vehicles();
        vehicle1.setConsumption(5.5);
        vehicle1.setYear(2020);

        System.out.println("Vehicle consumption: " + vehicle1.getConsumption());
        System.out.println("Vehicle year: " + vehicle1.getYear());
  

    
    }
    
}
