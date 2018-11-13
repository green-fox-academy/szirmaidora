package PostIt;

public class Main {
    public static void main(String[] args) {
        PostIt idea = new PostIt("orange", "Idea1", "blue");
        PostIt awesome = new PostIt("pink", "Awesome!", "black");
        PostIt superb = new PostIt("yellow", "Superb!", "green");
        System.out.println(superb.text);
    }

}
