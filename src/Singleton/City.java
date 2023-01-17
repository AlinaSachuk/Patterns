package Singleton;

public class City {
    private static City instance;
    public String cityName;

    private City(String name) {
        this.cityName = name;
    }

    public static City creator(String name) {
        if (instance == null) {
            instance = new City(name);
        }
        return instance;
    }
}
