public class ToUpperCase {
    public static void main(String[] args) {
        String string = "kjhlHUnedcjiID";
        String isUp = string.chars().filter((c) -> Character.isUpperCase(c))
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append).toString();
        System.out.println(isUp);
    }
}
