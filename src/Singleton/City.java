package Singleton;

public class City {
    private static City instance;
    public String name;

    private City(String name) {
        this.name = name;
    }

    public static City creator(String name) {
        if (instance == null) {
            instance = new City(name);
        }
        return instance;
    }
}
