package FactoryMethod.FM.Courses;

import FactoryMethod.FM.Developers.Developer;
import FactoryMethod.FM.Developers.PythonDeveloper;

public class PythonCourse extends Course{
    @Override
    Developer getDeveloper() {
        return new PythonDeveloper();
    }
}
