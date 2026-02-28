package String;

public class Third {

    public static String toTitleCase(String input) {

        String[] words = input.toLowerCase().split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1)).append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "this is java lang";
        System.out.println(toTitleCase(input));
    }
}