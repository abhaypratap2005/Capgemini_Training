package string;

import java.util.*;

public class First {

    public static List<Integer> findPositions(String sentence, String word) {
        List<Integer> positions = new ArrayList<>();

        String lowerSentence = sentence.toLowerCase();
        String lowerWord = word.toLowerCase();

        int index = lowerSentence.indexOf(lowerWord);

        while (index != -1) {
            positions.add(index);
            index = lowerSentence.indexOf(lowerWord, index + 1);
        }

        return positions;
    }

    public static void main(String[] args) {
        String sentence = "this is line. Line contains few words. Line is in java";

        List<Integer> result = findPositions(sentence, "line");
        System.out.println(result);
    }
}