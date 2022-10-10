import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {
    @Test
    void testStringReverse() {
        StringReverse s = new StringReverse();
        assertEquals("TXETTSET", s.reverse("TESTTEXT"));
    }
}