import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class FrameTest {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setStreams() {
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    void restoreInitialStreams() {
        System.setOut(originalOut);
    }

    @Test
    void checkOutput() {
        Frame frame = new Frame();
        frame.textInFrame("Das ist ein Test");
        assertEquals("********\n" +  "* Das  *\n" +  "* ist  *\n" +  "* ein  *\n" +  "* Test *\n" + "********\n", out.toString());
    }
}