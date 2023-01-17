package FactoryMethod.FM.Courses;

import FactoryMethod.FM.Developers.Developer;

public abstract class Course {
    public void logic(){
        System.out.println("Welcome to course - " + getDeveloper().getCourse());
        System.out.println("You will learn " + getDeveloper().getLanguage() + " programming language.");
        System.out.println("Positive sides: " + getDeveloper().getPositiveSides());
        System.out.println("Negative sides: " + getDeveloper().getNegativeSides());
    }
    abstract Developer getDeveloper();
}
