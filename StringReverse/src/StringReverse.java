import java.text.*;

public class StringReverse {
    public String reverse(String string) {
        String reversedString = "";
        CharacterIterator iterator = new StringCharacterIterator(string);
        while(iterator.getIndex() != iterator.getEndIndex()) {
            reversedString = iterator.current() + reversedString;
            iterator.next();
        }
        return reversedString;
    }
}
