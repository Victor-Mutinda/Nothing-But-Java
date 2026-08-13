package LooseCoupling;

public class PushNotificationService implements Message {
    public void sendMessage(String message) {
        System.out.println(message + " [MESSAGE WILL BE SENT VIA PUSH NOTIFICATION]");
    }
}
