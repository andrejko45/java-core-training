package training.task01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class TextNormalizerTest {

    private final TextNormalizer textNormalizer = new TextNormalizer();
    private String normText = "This string starts and ends with whitespace.";

    @Test
    void   trimsOuterWhitespace() {
        String startsEndsWithWhitespace = " This string starts and ends with whitespace. ";
        String normalizedText = textNormalizer.normalize(startsEndsWithWhitespace);
        assertEquals(normText, normalizedText);
    }

    @Test
    void collapsesRepeatedSpaces() {
        String collRepSpaces = "This  string starts  and  ends    with whitespace.";
        String normalizedText = textNormalizer.normalize(collRepSpaces);
        assertEquals(normText, normalizedText);
    }

    @Test
    void preservesCase() {
        String withoutPreservedCase = "This String Starts and Ends with whitespace.";
        String normalizedText = textNormalizer.normalize(withoutPreservedCase);
        assertEquals(withoutPreservedCase, normalizedText);
    }

}
