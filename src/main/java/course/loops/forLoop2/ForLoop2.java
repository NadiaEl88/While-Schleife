package course.loops.forLoop2;

public class ForLoop2 {

    public static void main(String[] args) {
        // Beispielaufruf
        int zahl = 5;
        long fakultaetErgebnis = fakultaet(zahl);
        System.out.println("Die Fakultät von " + zahl + " ist: " + fakultaetErgebnis);
    }

    // Statische Methode zur Berechnung der Fakultät
    static long fakultaet(int n) {
        // Initialisierung der Fakultät auf 1
        long fakultaetErgebnis = 1;

        // For-Schleife zur Berechnung der Fakultät
        for (int i = 1; i <= n; i++) {
            fakultaetErgebnis *= i;
        }

        // Rückgabe des Fakultätsergebnisses
        return fakultaetErgebnis;
    }
}

