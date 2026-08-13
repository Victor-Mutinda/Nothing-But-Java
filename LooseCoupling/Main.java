package LooseCoupling;

public class Main {
    public static void main(String[] args){


         NotificationService emailNotification = new NotificationService(new EmailService());
         emailNotification.notifyUser("Hello. We are pleased to Inform you, You've got the job.");

         NotificationService smsNotification = new NotificationService(new SmsService());
         smsNotification.notifyUser("Hello. We are pleased to Inform you, You've got the job.");    
         
         NotificationService pushNotification = new NotificationService(new PushNotificationService());
        pushNotification.notifyUser("Hello. We are pleased to Inform you, You've got the job.");


    }
    
}
