import java.util.*;

public class Translator {
    private List<String> ingredients;

    // TODO: Konstruktor anlegen und Variable ingredients initialisieren


    public List<String> getIngredients() {
        return ingredients;
    }

    public void uebersetzeRezept(String rezept) {
        // Wörter des übergebenen Rezepts werden an Leerzeichen getrennt und einzeln der Liste rezeptWoerter hinzugefügt
        List<String> rezeptWoerter = Arrays.asList(rezept.split(" "));
        
        // TODO: Wörter des übergebenen Rezepts nach gültigen Zutaten filtern, entspr. Übersetzungen der Liste ingredients hinzufügen

    }
}
