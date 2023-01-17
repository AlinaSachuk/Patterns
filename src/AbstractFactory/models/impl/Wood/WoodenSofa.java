package AbstractFactory.models.impl.Wood;

import AbstractFactory.models.Sofa;

public class WoodenSofa implements Sofa {
    @Override
    public String getMaterial() {
        return "wooden sofa";
    }
}
