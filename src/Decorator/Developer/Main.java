package Decorator.Developer;

public class Main {
    public static void main(String[] args) {
        IDeveloper developer = new JuniorDeveloper();
        developer.write();
        System.out.println("--------------------------");
        IDeveloper developer2 = new MiddleDeveloper(new JuniorDeveloper());
        developer2.write();
        System.out.println("--------------------------");
        IDeveloper developer3 = new LeadDeveloper(new MiddleDeveloper(new JuniorDeveloper()));
        developer3.write();
    }
}
