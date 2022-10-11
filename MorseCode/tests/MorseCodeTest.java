import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {
    @Test
    void testTranslation() {
        MorseCode translator = new MorseCode();
        assertEquals(".... . .-.. .-.. --- .-- --- .-. .-.. -..", translator.translate("HELLOWORLD"));
    }
}