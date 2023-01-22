package Decorator.Developer;

public class LeadDeveloper extends DeveloperDecorator{
    public LeadDeveloper(IDeveloper iDeveloper) {
        super(iDeveloper);
    }

    @Override
    public void write() {
        super.write();
        System.out.println("and manage!!!");
    }
}
