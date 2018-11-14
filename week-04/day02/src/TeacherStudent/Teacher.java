package TeacherStudent;


public class Teacher {
    String response = "Alright";

    public void teach (Student student) {
        student.learn();

    }
    public void answer () {
        System.out.println(response);
    }
}
