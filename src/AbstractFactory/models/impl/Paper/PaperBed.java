package AbstractFactory.models.impl.Paper;

import AbstractFactory.models.Bed;

public class PaperBed implements Bed {
    @Override
    public String getMaterial() {
        return "paper bed";
    }
}
