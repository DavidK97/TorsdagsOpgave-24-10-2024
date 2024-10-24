package task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //ArrayList til student1 og kurser
        ArrayList<String> student1PassedCourses = new ArrayList<>();
        student1PassedCourses.add("Java 1.0");
        student1PassedCourses.add("Algebra");
        Person student1 = new Student("David", student1PassedCourses);

        //ArrayList til student2 og kurser
        ArrayList<String> student2PassedCourses = new ArrayList<>();
        student2PassedCourses.add("Dansk");
        student2PassedCourses.add("Algebra");
        Person student2 = new Student("Jens", student2PassedCourses);

        //ArrayList til teacher1 og kurser
        ArrayList<String> teacher1canTeach = new ArrayList<>();
        teacher1canTeach.add("Java 1.0");
        teacher1canTeach.add("Algebra");
        Person teacher1 = new Teacher("Emilie", teacher1canTeach);

        //ArrayList til teacher2 og kurser
        ArrayList<String> teacher2canTeach = new ArrayList<>();
        teacher2canTeach.add("Dansk");
        teacher2canTeach.add("Algebra");
        Person teacher2 = new Teacher("Bente", teacher2canTeach);

        //ArrayList til at holde Teacher og Student objekter i det samme ArrayList af Person's
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(student1);
        persons.add(student2);
        persons.add(teacher1);
        persons.add(teacher2);



        //For-each loop til at gennemløbe persons ArrayList'en
        for (Person person : persons) {
            if (!person.addCourse("Java 1.0")) {  //Vi kalder på vores addCourse metode og kigger på om de har det specificerede kursus eller ej
                if (person instanceof Student) {  //Vi kigger på om objektet i ArrayListen er af klassen Student eller Teacher
                    System.out.println(person.getName() + " har allerede bestået dette kursus.");
                } else if (person instanceof Teacher) {
                    System.out.println(person.getName() + " kan ikke undervise i dette fag");
                }
            }
        }
    }
}





