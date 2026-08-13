package LooseCoupling;

public class NotificationService {

    private final Message messageService;

    public NotificationService(Message messageService){

        this.messageService = messageService;
    }

    public void notifyUser(String message) {
        messageService.sendMessage(message);
    }
    
}
