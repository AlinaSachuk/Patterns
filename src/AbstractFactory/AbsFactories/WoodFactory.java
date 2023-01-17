package AbstractFactory.AbsFactories;

import AbstractFactory.models.Bed;
import AbstractFactory.models.Chair;
import AbstractFactory.models.Sofa;
import AbstractFactory.models.impl.Wood.WoodenBed;
import AbstractFactory.models.impl.Wood.WoodenChair;
import AbstractFactory.models.impl.Wood.WoodenSofa;

public class WoodFactory implements FurnitureFactory {
    @Override
    public Chair getChair() {
        return new WoodenChair();
    }

    @Override
    public Sofa getSofa() {
        return new WoodenSofa();
    }

    @Override
    public Bed getBed() {
        return new WoodenBed();
    }
}
