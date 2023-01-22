package Decorator.Developer;

public class DeveloperDecorator implements IDeveloper{
    IDeveloper iDeveloper;

    public DeveloperDecorator(IDeveloper iDeveloper) {
        this.iDeveloper = iDeveloper;
    }

    @Override
    public void write() {
        iDeveloper.write();
    }
}
