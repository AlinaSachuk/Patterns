package FactoryMethod.FM.Developers;

public class PythonDeveloper implements Developer {
    @Override
    public String getCourse() {
        return "Python.";
    }

    @Override
    public String getLanguage() {
        return "Python";
    }

    @Override
    public String getPositiveSides() {
        return "Easy to read, learn and write; dynamically typed";
    }

    @Override
    public String getNegativeSides() {
        return "Slow speed, poor memory efficiency";
    }
}
