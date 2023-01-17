package FactoryMethod.FM.Courses;

import FactoryMethod.FM.Developers.Developer;
import FactoryMethod.FM.Developers.JavaDeveloper;

public class JavaCourse extends Course {
    @Override
    Developer getDeveloper() {
        return new JavaDeveloper();
    }
}
