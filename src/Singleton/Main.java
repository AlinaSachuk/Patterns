package Singleton;

import Singleton.City;

public class Main {
    public static void main(String[] args) {
        City city = City.creator("Minsk");
        City city1 = City.creator("Brest");
        System.out.println(city.cityName);
        System.out.println(city1.cityName);
    }
}