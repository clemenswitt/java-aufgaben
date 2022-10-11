public class MorseCode {
    private Dictionary dict;

    public MorseCode() {
        dict = new Dictionary();
        dict.initialize();
    }

    public String translate(String text) {
        String translation = "";
        for(char character : text.toLowerCase().toCharArray()) {
            translation += dict.get(character) + " ";
        }
        translation = translation.trim();
        return translation;
    }

}