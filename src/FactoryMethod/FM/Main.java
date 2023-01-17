package FactoryMethod.FM;

import FactoryMethod.FM.Courses.Course;
import FactoryMethod.FM.Courses.CppCourse;
import FactoryMethod.FM.Courses.JavaCourse;
import FactoryMethod.FM.Courses.PythonCourse;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Course course = getCourse ("Python");
        course.logic();
    }
    public static Course getCourse(String line){
        Map<String, Course> courses = new HashMap<>();
        courses.put("Java", new JavaCourse());
        courses.put("Python", new PythonCourse());
        courses.put("Cpp", new CppCourse());
        return courses.get(line);
    }
}
