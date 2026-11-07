package training.task01;

public class TextNormalizer {

    public String normalize(String text) {

        // 1. Odstranenie vonkajsich medzier
        String normalizedText = text.trim();

        // 2. Odstranenie dvojitych medzier
        normalizedText = normalizedText.replaceAll("\\s+", " ");


        // 3. Vratenie normalizovaneho textu
        return normalizedText;

    }

}
