package FactoryMethod.FM.Developers;

public class JavaDeveloper implements Developer {
    @Override
    public String getCourse() {
        return "JAVA";
    }

    @Override
    public String getLanguage() {
        return "JAVA";
    }

    @Override
    public String getPositiveSides() {
        return "Cross-platform, multithreading, etc.";
    }

    @Override
    public String getNegativeSides() {
        return "no.";
    }
}
