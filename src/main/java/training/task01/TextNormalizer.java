package training.task01;

public class TextNormalizer {

    String normalize(String text) {

        String normalizedText = text;

        // 1. Prevedenie textu na pole znakov
        char[] textArray = text.toCharArray();
        int startingChar = (int)textArray[0];
        int endingChar = (int)textArray[text.length() - 1];

        // 2. Kontrola podmienky ak na zaciatku a na konci sa nachadza whitespace
        //    Potreba pretypovat char na int a kontrola ASCII hodnoty znaku
        if(startingChar == 32 && endingChar == 32) {
            normalizedText = text.substring(1, text.length() - 2);
        }
        else if(startingChar == 32) {
            normalizedText = text.substring(1);
        }
        else if(endingChar == 32) {
            normalizedText = text.substring(0, text.length() - 1);
        }

        // 3. Vratenie normalizovaneho textu
        return normalizedText;

    }

}
