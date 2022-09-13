# Bankkonto

Ergänzen Sie die im Dateibrowser gegebene Datei `BankAccount.java` um folgende Funktionalitäten:

1. Legen Sie eine Instanzvariable zur Speicherung des Kontostandes an. Initialisieren Sie den Kontostand im Konstruktor der Klasse mit dem Wert `0.0`.
2. Erstellen Sie die Methode `getBalance()` zur Ausgabe des aktuellen Kontostands.
3. Erstellen Sie die Methode `payIn()`, um Einzahlungen auf das Bankkonto entgegenzunehmen. Der jeweils übergebene Parameterwert soll zum aktuellen Kontostand addiert werden. 
4. Realisieren Sie die Auszahlung von Geldbeträgen `payOff()`. Beachten Sie, dass das hier betrachtete Kontomodell keine Überziehungen erlaubt.
5. Die Methoden `payIn()` und `payOff()` sollen nach der Ausführung der Ein- bzw. Auszahlung den aktualisierten Kontostand zurückgeben.

### Entwicklungsziele
[task][Konstruktor korrekt implementiert](checkInitialization)
[task][Methode payIn() erhöht Kontostand](checkPayIn)
[task][Methode payOff() reduziert Kontostand](checkPayOff)
[task][Konto akzeptiert keine Überziehung des Kontostands](CheckNoNegativeBalance)
[task][Methoden payIn() und payOff() geben aktualisierten Kontostand zurück.](checkReturnValues)