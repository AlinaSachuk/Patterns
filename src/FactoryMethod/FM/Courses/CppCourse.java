package FactoryMethod.FM.Courses;

import FactoryMethod.FM.Developers.CppDeveloper;
import FactoryMethod.FM.Developers.Developer;

public class CppCourse extends Course{
    @Override
    Developer getDeveloper() {
        return new CppDeveloper();
    }
}
