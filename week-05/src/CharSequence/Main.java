package CharSequence;

public class Main {
    public static void main(String[] args) {
        String tester = "asdfghjk";
        Gnirts test = new Gnirts(tester);
        System.out.println(test.charAt(7));
        System.out.println(test.subSequence(1,3));
        Shifter shifted = new Shifter(tester, 2);
        System.out.println(shifted.charAt(4));
        System.out.println(shifted.subSequence(1,3));
    }


}
