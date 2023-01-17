package AbstractFactory.AbsFactories;

import AbstractFactory.models.Bed;
import AbstractFactory.models.Chair;
import AbstractFactory.models.Sofa;
import AbstractFactory.models.impl.Paper.PaperBed;
import AbstractFactory.models.impl.Paper.PaperChair;
import AbstractFactory.models.impl.Paper.PaperSofa;

public class PaperFactory implements FurnitureFactory{
    @Override
    public Chair getChair() {
        return new PaperChair();
    }

    @Override
    public Sofa getSofa() {
        return new PaperSofa();
    }

    @Override
    public Bed getBed() {
        return new PaperBed();
    }
}
