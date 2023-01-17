package AbstractFactory.models.impl.Paper;

import AbstractFactory.models.Chair;

public class PaperChair implements Chair {
    @Override
    public String getMaterial() {
        return "paper chair";
    }
}
