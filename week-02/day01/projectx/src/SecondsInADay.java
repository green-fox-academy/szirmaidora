public class SecondsInADay {
    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int seconds = 24*360 - (currentHours * 360 + currentMinutes * 60 + currentSeconds);
        System.out.println(seconds);

    }
}
