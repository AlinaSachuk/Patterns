package Adapter;

public class Adapter implements ISender {
    SmsNotification smsNotification = new SmsNotification();

    @Override
    public void send(String text) {
        smsNotification.sendSms(text);
    }
}
