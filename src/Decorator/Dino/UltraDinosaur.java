package Decorator.Dino;

public class UltraDinosaur extends DinoDecorator{
    public UltraDinosaur(IDinosaur iDinosaur) {
        super(iDinosaur);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("ULTRA growl!!!!!");
    }
}
