import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromesTest {
    @Test
    void testPalindromeCheck() {
        String[] palindromes = {"ANNA", "RELIEFPFEILER", "REGALLAGER", "X", "", "010"};
        String[] noPalindromes = {"HALLO", "TEST", "123", "XYZ", "ABC", "INFORMATIK"};
        Palindromes palCheck = new Palindromes();
        for(String p : palindromes) {
            assertTrue(palCheck.checkPalindrome(p));
        }
        for(String p : noPalindromes) {
            assertFalse(palCheck.checkPalindrome(p));
        }
    }
}