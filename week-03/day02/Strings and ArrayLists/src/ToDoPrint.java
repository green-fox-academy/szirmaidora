public class ToDoPrint implements Comparable{
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention
        String todo = "My todo:\n";
        String games = " - Download games\n";
        String diablo = "     - Diablo";
        StringBuilder sb = new StringBuilder(todoText);
        sb.insert(0, todo);

        todoText = sb.toString();
        sb.insert(todoText.length(), games + diablo);
        todoText = sb.toString();


        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        System.out.println(todoText);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
