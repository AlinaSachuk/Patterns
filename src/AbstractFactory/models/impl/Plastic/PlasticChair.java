package AbstractFactory.models.impl.Plastic;

import AbstractFactory.models.Chair;

public class PlasticChair implements Chair {
    @Override
    public String getMaterial() {
        return "plastic chair";
    }
}
