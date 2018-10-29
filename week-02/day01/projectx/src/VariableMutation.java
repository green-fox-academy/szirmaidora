public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;

        System.out.println(a+=10);

        int b = 100;
        System.out.println(b-=7);

        int c = 44;
        System.out.println(c*=2);

        int d = 125;
        System.out.println(d/=5);

        int e = 8;
        System.out.println(e*=e*=e);

        int f1 = 123;
        int f2 = 345;

        boolean bigger = f1 < f2;
        System.out.println(bigger);

        int g1 = 350;
        int g2 = 200;

        boolean biggerg = g2*2 >g1;
        System.out.println(biggerg);

        int h = 135798745;
        boolean divisor = h % 11 == 0;
        System.out.println(divisor);

        int i1 = 10;
        int i2 = 3;

        boolean cube = (i1 > (i2*i2)) && (i1  < i1 * i2 *i2);
        System.out.println(cube);

        int j = 1521;
        boolean or = j % 5 ==0 || j % 3 ==0 ;
        System.out.println(or);

        String k = "Apple";
        System.out.println(k+k+k+k);




    }
}
