package training.task02;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCounterTest {

    private final WordCounter wordCounter = new WordCounter();
    private final String sentence = "";

    @Test
    void countsSimpleSentence() {
        assertEquals(5, wordCounter.countWords(sentence));
    }
}
