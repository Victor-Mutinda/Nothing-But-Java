package LooseCoupling;

public class SmsService implements Message {

    public void sendMessage(String message){
        System.out.println(message + " [MESSAGE WILL BE SENT VIA SMS]");
    }
    
}
