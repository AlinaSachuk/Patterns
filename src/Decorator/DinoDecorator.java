package Decorator;

public class DinoDecorator implements IDinosaur {
    IDinosaur iDinosaur;

    public DinoDecorator(IDinosaur iDinosaur) {
        this.iDinosaur = iDinosaur;
    }

    @Override
    public void eat() {
        iDinosaur.eat();
    }

    @Override
    public void voice() {
        iDinosaur.voice();
    }
}
