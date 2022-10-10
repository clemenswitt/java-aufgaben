# Strings umkehren

Ergänzen Sie die gegebene Klasse `StringReverse` um eine Methode zur Umkehrung von Zeichenketten. Gehen Sie dabei wie folgt vor:

1. Legen Sie die Methode `reverse()` mit dem Rückgabetyp `String` an. Die Methode eine Zeichenkette als Parameter erhalten.
2. Die Umkehrung der Buchstabenreihenfolge soll mithilfe einer `while`-Schleife mit Iterator erfolgen. Instanziieren Sie für den `String`-Parameter der Methode einen `StringCharacterIterator`. Konstruieren Sie anschließend die Abbruchbedingung der `while`-Schleife unter Verwendung der Methoden `getIndex()` und `getEndIndex()` des Iterators. 
3. Deklarieren und initialisieren Sie zur Umkehrung des Eingabestrings eine Hilfsvariable. Ergänzen Sie diese Zeichenkette anschließend innerhalb der `while`-Schleife so, dass der eingegebene `String`-Parameter umgekehrt wird. Verwenden Sie hierzu die Methode `current()` des Iterators. 

### Hinweise
- Informieren Sie sich über die Klasse `StringCharacterIterator` in der offiziellen [Java-Dokumentation](https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/text/StringCharacterIterator.html).
- Beachten Sie, dass Sie die Position des Iterators manuell inkrementieren müssen. Informieren Sie sich über hierfür verwendbare Methoden in der Dokumentation der Klasse `StringCharacterIterator`.

### Entwicklungsziele
[task][Methode reverse() korrekt implementiert](testStringReverse)