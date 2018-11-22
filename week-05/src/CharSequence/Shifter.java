package CharSequence;

public class Shifter implements CharSequence{
    String toChange;
    int shifter;
    public Shifter (String toChange, int shifter) {
        this.toChange = toChange;
        this.shifter = shifter;

    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return toChange.charAt(index + shifter);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return toChange.subSequence(start + shifter, end + shifter);
    }
}
