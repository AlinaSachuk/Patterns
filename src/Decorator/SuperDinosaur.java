package Decorator;

public class SuperDinosaur extends DinoDecorator{
    public SuperDinosaur(IDinosaur iDinosaur) {
        super(iDinosaur);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("I growl super!!!");
    }
}
