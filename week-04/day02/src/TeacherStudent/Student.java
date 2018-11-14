package TeacherStudent;

public class Student {
    int knowledge = 1;


    public void learn () {
        knowledge++;

    }
    public void question (Teacher teacher) {
        teacher.answer();

    }
}
