public class String3 {
    public static void main(String[] args) {
        String toChange = "Xenia xeroxed her Sphinx";
        System.out.println(noX(toChange));

    }
    /*public static String noX (String withY) {
        String y = "y";
        if (!withY.contains("x")) {
            return withY;
        } else {
            if (withY.substring()-1) {}

        }
    }*/

    public static String noX(String withY) {
        if (withY.length() <= 0) {
            return withY;
        }
        else {
            {
                return noX(withY.substring(0, withY.length()-1)) + withY.substring(withY.length()-1) + "*";
            }


        }
    }

}

