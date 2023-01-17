package AbstractFactory.models.impl.Wood;

import AbstractFactory.models.Chair;

public class WoodenChair implements Chair {
    @Override
    public String getMaterial() {
        return "wooden chair";
    }
}
