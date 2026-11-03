package training.task01;

public class TextNormalizer {

    String normalize(String text) {

        // Ak je retazec prazny rovno ho vrat
        if(text.isEmpty()) {
            return text;
        }

        String normalizedText = text;

        // 1. Prevedenie textu na pole znakov
        char[] textArray = text.toCharArray();
        int startingChar = textArray[0];
        int endingChar = textArray[text.length() - 1];

        // 2. Kontrola podmienky ak na zaciatku a na konci sa nachadza whitespace
        //    Potreba pretypovat char na int a kontrola ASCII hodnoty znaku
        if(startingChar == 32 && endingChar == 32) {
            normalizedText = text.substring(1, text.length() - 1);
        }
        else if(startingChar == 32) {
            normalizedText = text.substring(1);
        }
        else if(endingChar == 32) {
            normalizedText = text.substring(0, text.length() - 1);
        }

        // 3. Odstranenie dvojitych medzier
        normalizedText = normalizedText.replaceAll("\s+", " ");


        // 4. Vratenie normalizovaneho textu
        return normalizedText;

    }

}
