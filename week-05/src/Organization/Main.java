package Organization;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Mentor> mentors = new ArrayList<>();
        ArrayList<Sponsor> sponsors = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        students.add(john);
        Student student = new Student();
        students.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        mentors.add(gandhi);
        Mentor mentor = new Mentor();
        mentors.add(mentor);
        Sponsor sponsor = new Sponsor();
        sponsors.add(sponsor);
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
        sponsors.add(elon);
        Student johny = new Student("John", 20,"male","BME");

        Student johnTheClone = john.clone();
        System.out.println(johnTheClone.toString());
        System.out.println("***************");
       /* new Student try {
            Student johnTheClone = johny.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(john);*/


        student.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }

        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for (Person person : people) {
            person.introduce();
            person.getGoal();
        }

        for (Student person : students) {
            person.introduce();
            person.getGoal();
        }

        for (Mentor person : mentors) {
            person.introduce();
            person.getGoal();
        }

        for (Sponsor person : sponsors) {
            person.introduce();
            person.getGoal();
        }
    }
}
