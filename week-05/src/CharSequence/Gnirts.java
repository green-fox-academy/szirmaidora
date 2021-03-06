package CharSequence;

public class Gnirts implements CharSequence {
    String toChange;
    public Gnirts (String toChange) {
        this.toChange = toChange;

    }
    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return toChange.charAt(toChange.length()-1-index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return toChange.subSequence(toChange.length()-1-end, toChange.length() - start);
    }
}
