package AbstractFactory.models.impl.Paper;

import AbstractFactory.models.Sofa;

public class PaperSofa implements Sofa {
    @Override
    public String getMaterial() {
        return "paper sofa";
    }
}
