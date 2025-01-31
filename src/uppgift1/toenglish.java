package uppgift1;

import java.util.HashMap;

public class toenglish {
    private HashMap<String, Character> morseToEnglish = new HashMap<>();

    public toenglish() {
        morseToEnglish.put(".-", 'A');
        morseToEnglish.put("-...", 'B');
        morseToEnglish.put("-.-.", 'C');
        morseToEnglish.put("-..", 'D');
        morseToEnglish.put(".", 'E');
        morseToEnglish.put("..-.", 'F');
        morseToEnglish.put("--.", 'G');
        morseToEnglish.put("....", 'H');
        morseToEnglish.put("..", 'I');
        morseToEnglish.put(".---", 'J');
        morseToEnglish.put("-.-", 'K');
        morseToEnglish.put(".-..", 'L');
        morseToEnglish.put("--", 'M');
        morseToEnglish.put("-.", 'N');
        morseToEnglish.put("---", 'O');
        morseToEnglish.put(".--.", 'P');
        morseToEnglish.put("--.-", 'Q');
        morseToEnglish.put(".-.", 'R');
        morseToEnglish.put("...", 'S');
        morseToEnglish.put("-", 'T');
        morseToEnglish.put("..-", 'U');
        morseToEnglish.put("...-", 'V');
        morseToEnglish.put(".--", 'W');
        morseToEnglish.put("-..-", 'X');
        morseToEnglish.put("-.--", 'Y');
        morseToEnglish.put("--..", 'Z');
        morseToEnglish.put(" ", ' ');
    }

    public String översättTillenglish(String morseCode) {
        StringBuilder englishText = new StringBuilder();
        String[] words = morseCode.split(" ");

        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                if (morseToEnglish.containsKey(letter)) {
                    englishText.append(morseToEnglish.get(letter));
                } else {
                    englishText.append("?");
                }
            }
        }
        System.out.println(englishText.toString().trim());
        return englishText.toString().trim();
    }
}