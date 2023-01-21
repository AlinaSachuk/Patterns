package Decorator;

public class SimpleDinosaur implements IDinosaur {
    @Override
    public void eat() {
        System.out.println("I eat everything");
    }

    @Override
    public void voice() {
        System.out.println("I growl simply");
    }
}
