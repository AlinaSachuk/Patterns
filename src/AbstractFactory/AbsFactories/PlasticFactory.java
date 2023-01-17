package AbstractFactory.AbsFactories;

import AbstractFactory.models.Bed;
import AbstractFactory.models.Chair;
import AbstractFactory.models.Sofa;
import AbstractFactory.models.impl.Plastic.PlasticBed;
import AbstractFactory.models.impl.Plastic.PlasticChair;
import AbstractFactory.models.impl.Plastic.PlasticSofa;

public class PlasticFactory implements FurnitureFactory{
    @Override
    public Chair getChair() {
        return new PlasticChair();
    }

    @Override
    public Sofa getSofa() {
        return new PlasticSofa();
    }

    @Override
    public Bed getBed() {
        return new PlasticBed();
    }
}
