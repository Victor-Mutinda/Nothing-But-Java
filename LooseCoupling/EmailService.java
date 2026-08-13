package LooseCoupling;

public class EmailService implements Message {
    
    public void sendMessage(String message) {
        System.out.println(message + " [MESSAGE WILL BE SENT VIA EMAIL]");
    }
}


