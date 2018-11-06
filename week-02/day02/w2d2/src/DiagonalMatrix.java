public class DiagonalMatrix {
    public static void main(String[] args) {
        int d = 4;


        int[][] multD = new int[d][d];

        for (int i= 0; i < d; i++) {
            for (int e = 0; e <d; e++) {
                if (i == e) {

                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
        }
        }

