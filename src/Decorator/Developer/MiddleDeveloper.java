package Decorator.Developer;

public class MiddleDeveloper extends DeveloperDecorator{
    public MiddleDeveloper(IDeveloper iDeveloper) {
        super(iDeveloper);
    }

    @Override
    public void write() {
        super.write();
        System.out.println("and testing!!!");
    }
}
