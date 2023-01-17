package AbstractFactory;

import AbstractFactory.AbsFactories.FurnitureFactory;
import AbstractFactory.AbsFactories.PaperFactory;
import AbstractFactory.AbsFactories.PlasticFactory;
import AbstractFactory.AbsFactories.WoodFactory;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String material = "paper";
        FurnitureFactory furnitureFactory = getFactory(material);
        System.out.println("We are glad to present you your set of furniture: " + furnitureFactory.
                getChair().getMaterial() + ", " + furnitureFactory.
                getSofa().getMaterial() + ", " + furnitureFactory.
                getBed().getMaterial() + ".");
    }

    static FurnitureFactory getFactory(String material) {
        Map<String, FurnitureFactory> list = new HashMap<>();
        list.put("wood", new WoodFactory());
        list.put("plastic", new PlasticFactory());
        list.put("paper", new PaperFactory());
        return list.get(material);
    }
}
