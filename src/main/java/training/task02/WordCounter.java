package training.task02;

import training.task01.TextNormalizer;

public class WordCounter {

    private final TextNormalizer textNormalizer = new TextNormalizer();

    public int countWords(String text) {
        String normalizedText = textNormalizer.normalize(text);
        int wordCount = 0;
        int whiteSpaceIndex = 0;
        while(whiteSpaceIndex != 1) {
            if(normalizedText.isEmpty()) {
                return wordCount;
            }
            whiteSpaceIndex = normalizedText.indexOf(" ");
            wordCount++;
            normalizedText = normalizedText.substring(whiteSpaceIndex+1);
        }
        return wordCount;

    }
}
