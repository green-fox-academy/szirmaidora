package Organization;

public class Sponsor extends Person {
    String company;
    int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }

    public Sponsor() {
        super ( "Jane Doe", 30, "female");
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + " a " + age + " year old" + gender + " who represents " + company + " and hired " + hiredStudents + " so far.");
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

    public void hire() {
        hiredStudents++;
    }
}
