package Adapter;

public class Main {
    public static void main(String[] args) {
        ISender sender = new Adapter();
        sender.send("Hello World!");
    }
}
