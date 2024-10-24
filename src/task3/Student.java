package task3;


import java.util.ArrayList;

public class Student extends Person {
    private ArrayList <String> passedCourses;
    private ArrayList <String> currentCourses;


    public Student (String name, ArrayList <String> passedCourses) {
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = new ArrayList();
    }

    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            return false;
        } else {
            currentCourses.add(course);
            return true;
        }
    }
}

