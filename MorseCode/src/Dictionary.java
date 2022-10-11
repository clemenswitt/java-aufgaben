import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<Character, String> letters = new HashMap<>();
    
    public void initialize() {
        letters.put('a', ".-");
        letters.put('b', "-...");
        letters.put('c',  "-.-");
        letters.put('d',  "-..");
        letters.put('e',    ".");
        letters.put('f', "..-.");
        letters.put('g',  "--.");
        letters.put('h', "....");
        letters.put('i',   "..");
        letters.put('j', ".---");
        letters.put('k',   "-.");
        letters.put('l', ".-..");
        letters.put('m',   "--");
        letters.put('n',   "-.");
        letters.put('o',  "---");
        letters.put('p', ".--.");
        letters.put('q', "--.-");
        letters.put('r', ".-.");
        letters.put('s',  "...");
        letters.put('t',   "-");
        letters.put('u',  "..-");
        letters.put('v', "...-");
        letters.put('w',  ".--");
        letters.put('x', "-..-");
        letters.put('y', "-.--");
        letters.put('z', "--..");
        letters.put('1', ".----");
        letters.put('2',"..---");
        letters.put('3', "...--");
        letters.put('4', "....-");
        letters.put('5', ".....");
        letters.put('6', "-....");
        letters.put('7', "--...");
        letters.put('8', "---..");
        letters.put('9', "----.");
        letters.put('0', "-----");
    }

    public String get(Character letter) {
        return letters.get(letter);
    }
}
