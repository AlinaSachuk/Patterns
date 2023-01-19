package Adapter;

public class TelegaSender implements ISender{
    @Override
    public void send(String text) {
        System.out.println("посылаем сообщение в телеграм: ");
        System.out.println(text);
    }
}
