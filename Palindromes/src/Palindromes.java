public class Palindromes {
    public boolean checkPalindrome(String s) {
        char[] stringArray = s.toCharArray();
        for(int i = 0; i < stringArray.length; i++) {
            if(stringArray[i] != stringArray[stringArray.length - 1 - i]) return false;
        }
        return true;
    }
}