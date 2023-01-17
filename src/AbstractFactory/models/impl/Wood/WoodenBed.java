package AbstractFactory.models.impl.Wood;

import AbstractFactory.models.Bed;

public class WoodenBed implements Bed {
    @Override
    public String getMaterial() {
        return "wooden bed";
    }
}
