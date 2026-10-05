package Abstraction;

public class PaymentProcessor {
    private final Payment paymentMethod;
 // final is used to lock the value of the variable of type Payment,
 //  so that when we create an object of PaymentProcessor, it can't be changed to another payment method.   

    public PaymentProcessor(Payment paymentMethod){

        this.paymentMethod = paymentMethod ;

    }

    public void processPayment(int amount){
        paymentMethod.pay(amount);
    }


    

    
}
