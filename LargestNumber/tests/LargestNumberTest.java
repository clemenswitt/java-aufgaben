import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {
    int[] testArray = {2, 8, 59, 32, 10, 54};

    @Test
    void testFindLargestNumber() {
        LargestNumber ln = new LargestNumber();
        assertEquals(59, ln.findLargestNumber(testArray));
    }

    @Test
    void testFindSecondLargestNumber() {
        LargestNumber ln = new LargestNumber();
        assertEquals(54, ln.findSecondLargestNumber(testArray));
    }
}