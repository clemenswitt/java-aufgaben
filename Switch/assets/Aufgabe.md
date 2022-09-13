# Übersetzer
In der folgenden Aufgabe sollen Rezepttexte in deutscher Sprache nach vorgegebenen Zutaten gefiltert werden. Jede im Text gefundene Zutat soll anschließend ins Englische übersetzt und der Liste `ingredients` hinzugefügt werden. Befolgen Sie hierzu folgende Lösungsschritte und Hinweise:

1. Erstellen Sie einen Konstruktor für Objekte der Klasse `Translator` und initialisieren Sie die Liste `ingredients` dort als Array-Liste.
2. Die Methode `uebersetzeRezept()` erhält als Parameter ein Rezept in Textform. Anschließend werden die einzelnen Wörter des Rezeptes mittels der Methode `split()` extrahiert und der Liste `rezeptWoerter` hinzugefügt. Ergänzen Sie die Methode so, dass die im Enum `Zutaten` enthaltenen Zutaten in deutscher Sprache in den extrahierten Wörtern des Rezepts gesucht und ins Englische übersetzt werden. Fügen Sie die gefundenen und übersetzten Zutaten der Liste `ingredients` hinzu. Berücksichtigen Sie dabei ihre Auftretensreihenfolge im Rezept.

### Hinweise
- Verwenden Sie zum Iterieren über die extrahierten Rezeptwörter und deklarierten Zutaten zwei ineinander geschachtelte for-each-Schleifen. Erzeugen Sie hierfür mittels `Zutaten.values()` eine iterierbare Sammlung aus dem gegebenen Enum `Zutaten`.
- Vergleichen Sie die extrahierten Rezeptwörter und deklarierten Zutaten mittels der Methode `contains()`. Konvertieren Sie die jeweils betrachtete Zutat hierzu zunächst in eine Zeichenkette und vereinheitlichen Sie die zu vergleichenden Begriffe mit `toLowerCase()` bzw. `toUpperCase()`.
- Nutzen Sie zum Übersetzen der gefundenen Zutaten eine Switch-Case-Verzweigung. Fügen Sie die englische Übersetzung der gefunden Zutaten der Liste `ingredients` mithilfe der Methode `add()` hinzu. 


### Entwicklungsziele
[task][Liste ingredients als Array-Liste initialisiert](checkListType)
[task][Filterung und Übersetzung korrekt implementiert](checkTranslation)