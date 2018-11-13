package Counter;

public class Counter {
    int original;
    int resat;

    public Counter () {
        this.resat = 0;
        this.original = 0;
    }
    public Counter (int num) {
        this.resat = num;
        this.original = num;
    }
    public void add (int number) {
        original = original + number;
    }
    public void add () {
        original++;
    }
    public int get () {
        return original;
    }
    public void reset () {
        original = resat;

    }
}
