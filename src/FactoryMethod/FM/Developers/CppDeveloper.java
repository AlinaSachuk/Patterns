package FactoryMethod.FM.Developers;

public class CppDeveloper implements Developer {
    @Override
    public String getCourse() {
        return "C++.";
    }

    @Override
    public String getLanguage() {
        return "C++";
    }

    @Override
    public String getPositiveSides() {
        return "Large community support";
    }

    @Override
    public String getNegativeSides() {
        return "programs written in C++ aren't as safe as others, take up a lot of memory ";
    }
}
