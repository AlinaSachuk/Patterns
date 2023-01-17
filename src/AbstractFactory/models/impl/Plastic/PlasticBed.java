package AbstractFactory.models.impl.Plastic;

import AbstractFactory.models.Bed;

public class PlasticBed implements Bed {
    @Override
    public String getMaterial() {
        return "plastic bed";
    }
}
