package Abstraction;

public class Main {
    public static void main(String[] args){

        // Polymorphism in action. Abstraction + inheritance + polymorphism

        Payment pay1 = new Mpesa("0723456789");
        Payment pay2 = new BankCard("1234-5678-9012-3456");
        Payment pay3 = new PayPal("bossie@gmail.com");

        pay1.pay(500);
        pay1.paymentInfo("Victor","victormutinda01@gmail.com","0723456789");

        pay2.pay(1000);
        pay2.paymentInfo("Tajiri","tajiri@gmail.com","0798765432");

        pay3.pay(2000);
        pay3.paymentInfo("Bossie","bossie@gmail.com","0712345678");


        // PaymentProcessor demonstrates loose coupling
        PaymentProcessor mpesaProcessor = new PaymentProcessor(new Mpesa("0721247005"));
        mpesaProcessor.processPayment(1500);
        PaymentProcessor cardProcessor = new PaymentProcessor(new BankCard("1230-2025"));
        cardProcessor.processPayment(10000); 
        // Reason why PaymentProcessor works with all 3 payment methods is because;
        // PaymentProcessor depends on the Payment abstraction rather than a specific payment method/implementation
        // Since Payment methods(mpesa,...) are extended from the Payment class, they can be passed to the PaymentProcessor through Payment reference
        // therefore PaymentProcessor works with different Payment methods without changing code.
    }
}
