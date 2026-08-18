package Abstraction;

public class Mpesa extends Payment {

    private String phoneNumber;

    public Mpesa(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    void pay(int amount){
        System.out.println("A prompt to pay " + amount + " via mpesa has been sent to " + phoneNumber);
    }

    
}
