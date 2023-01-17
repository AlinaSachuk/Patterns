package AbstractFactory.models.impl.Plastic;

import AbstractFactory.models.Sofa;

public class PlasticSofa implements Sofa {
    @Override
    public String getMaterial() {
        return "plastic sofa";
    }
}
