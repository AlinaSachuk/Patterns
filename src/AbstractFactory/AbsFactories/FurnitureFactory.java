package AbstractFactory.AbsFactories;

import AbstractFactory.models.Bed;
import AbstractFactory.models.Chair;
import AbstractFactory.models.Sofa;

public interface FurnitureFactory {
    Chair getChair();

    Sofa getSofa();

    Bed getBed();
}
