import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Translator {
    private List<String> ingredients;

    public Translator() {
        ingredients = new ArrayList<>();
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void uebersetzeRezept(String rezept) {
        String gefunden = "";
        List<String> rezeptWoerter = Arrays.asList(rezept.split(" "));
        for(String wort : rezeptWoerter) {
            for(Zutaten zutat : Zutaten.values()) {
                if(wort.toLowerCase().contains(zutat.toString().toLowerCase())) {
                    gefunden = zutat.toString().toLowerCase();

                    switch(gefunden) {
                        case "tomate": ingredients.add("Tomato");
                            break;
                        case "kartoffel": ingredients.add("Potato");
                            break;
                        case "gurke": ingredients.add("Cucumber");
                            break;
                    }

                }
            }
        }
    }
}
