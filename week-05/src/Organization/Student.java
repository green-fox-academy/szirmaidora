package Organization;

public class Student extends Person {
    String previousOrganization;
    int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        skippedDays = 0;
        this.previousOrganization = previousOrganization;
    }

    public Student() {
        super("Jane Doe", 30, "female");
        skippedDays = 0;
        this.previousOrganization = "The School of Life";
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + " a " + age + " year old" + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
    }

}
