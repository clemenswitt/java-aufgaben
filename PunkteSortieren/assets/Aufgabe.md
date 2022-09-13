# Punkte sortieren

Analog zur dritten Aufgabe des Softwarepraktikums sollen im folgenden Beispiel Punkte innerhalb eines Arrays anhand ihres Abstands zueinander sortiert werden. Mithilfe des Konstruktors `Punkt(int x, int y)` der gegebenen Klasse `Punkt` können Punkte mit beliebigen ganzzahligen Koordinaten erzeugt werden. Vervollständigen Sie die Klasse `PunkteArray` in folgenden Schritten:

1. Initialisieren Sie die Instanzvariable `punkte` im Konstruktor der Klasse `PunkteArray` mit einem Array der Größe 5.
2. Der erste Punkt des Arrays wurde innerhalb der Methode `fuellePunkteAray()` bereits mit den Koordinaten `(0,0)` initialisiert. Belegen Sie die übrigen Elemente des Arrays mit Punkten zufälliger Koordinaten zwischen `0` und `10`. Verwenden Sie hierzu die gegebene Instanz `randomGenerator` der Klasse `Random`. 
3. Implementieren Sie innerhalb der geschachtelten Schleifen der Methode `punkteSortieren()` einen Algorithmus, welcher die Punkte des Arrays `punkte` mit aufsteigendem Abstand zueinander sortiert. Verwenden Sie die vorgegebenen Variablen und beachten Sie die untenstehenden Hinweise zum Sortierverfahren.

### Hinweise zum Sortierverfahren
- Das in dieser Aufgabe zu implementierende Sortierverfahren arbeitet mit zwei ineinander geschachtelten `for`-Schleifen. Der Startindex der inneren Schleife befindet sich im zu sortierenden Array stets einen Eintrag hinter der äußeren Schleife. Der Index der äußeren Schleife zeigt damit immer auf den letzten bereits sortierten Punkt, während innerhalb der inneren Schleife der Abstand zu allen verbleibenden Punkten berechnet wird. 
- Unterschreitet ein berechneter Abstand `aktuellerAbstand` den bisher kürzesten Abstand `amKuerzesten` zum letzten bereits sortierten Punkt, muss dieser durch den aktuellen Wert überschrieben werden. Weiterhin soll der Index des korrespondierenden Punktes in der Variable `position` gespeichert werden. Um das Überschreiben der Variable `amKuerzesten` mit dem jeweils ersten berechneten Abstand zu garantieren, wird sie mit dem innerhalb des Definitions- & Wertebereichs der Punkte nicht erreichbaren Abstandswert `1000` initialisiert.
- Nach jedem Durchlauf der inneren Schleife wird der ermittelte Punkt `position` mit dem kürzesten Abstand zum letzten bereits sortierten Punkt als dessen Nachfolger in das Punkte-Array einsortiert. Damit der an dieser Stelle bisher gespeicherte Punkt nicht verlorengeht, muss er zuvor in der Variable `tausch` zwischengespeichert werden, um anschließend an die ursprüngliche Position des umsortierten Punktes mit dem Index `position` einsortiert werden zu können.

### Entwicklungsziele
[task][Punkte-Array korrekt initialisiert](checkArraySize)
[task][Punkte-Array mit Punkten des gegebenen Definitions- & Wertebereichs gefüllt](checkGeneratedPoints)
