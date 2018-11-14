package TeacherStudent;

public class Main {
    public static void main(String[] args) {


        Teacher teacher1 = new Teacher();
        Student student1 = new Student();
        student1.question(teacher1);
        student1.learn();
        teacher1.answer();
        teacher1.teach(student1);

    }
}
