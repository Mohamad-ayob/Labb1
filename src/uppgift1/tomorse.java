package uppgift1;

import java.util.HashMap;
import java.util.Map;


public class tomorse {
    private HashMap<Character,String> englishToMorse = new HashMap<Character,String>();

    public tomorse(){
        englishToMorse.put('A', ".-");
        englishToMorse.put('B', "-...");
        englishToMorse.put('C', "-.-.");
        englishToMorse.put('D', "-..");
        englishToMorse.put('E', ".");
        englishToMorse.put('F', "..-.");
        englishToMorse.put('G', "--.");
        englishToMorse.put('H', "....");
        englishToMorse.put('I', "..");
        englishToMorse.put('J', ".---");
        englishToMorse.put('K', "-.-");
        englishToMorse.put('L', ".-..");
        englishToMorse.put('M', "--");
        englishToMorse.put('N', "-.");
        englishToMorse.put('O', "---");
        englishToMorse.put('P', ".--.");
        englishToMorse.put('Q', "--.-");
        englishToMorse.put('R', ".-.");
        englishToMorse.put('S', "...");
        englishToMorse.put('T', "-");
        englishToMorse.put('U', "..-");
        englishToMorse.put('V', "...-");
        englishToMorse.put('W', ".--");
        englishToMorse.put('X', "-..-");
        englishToMorse.put('Y', "-.--");
        englishToMorse.put('Z', "--..");
        englishToMorse.put(' ', " ");
    }

    public String översättTillMorse(String text) {
        StringBuilder morseText = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray()) {
            String morseKod = englishToMorse.get(c);
            if (morseKod != null) {
                morseText.append(morseKod).append(" ");
            } else {
                morseText.append("?");
            }

        }
        System.out.println(morseText);
        return morseText.toString().trim();
    }
}