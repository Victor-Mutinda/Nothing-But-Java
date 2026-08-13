public class Main {

    public static void main(String[] args){
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
