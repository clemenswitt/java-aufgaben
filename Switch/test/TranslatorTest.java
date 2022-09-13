import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TranslatorTest {
    private String rezept = " Gurke, Tomaten, Kartoffeln, Honig";

    @Test
    void checkListType() {
        Translator translator = new Translator();
        assertTrue(translator.getIngredients() instanceof ArrayList<String>);
    }

    @Test
    void checkTranslation() {
        List<String> correctIngredients = new ArrayList<>(Arrays.asList("Cucumber", "Tomato", "Potato"));
        Translator translator = new Translator();
        translator.uebersetzeRezept(rezept);
        assertEquals(correctIngredients, translator.getIngredients());
    }
}