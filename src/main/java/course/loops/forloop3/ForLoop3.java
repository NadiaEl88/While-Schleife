package course.loops.forloop3;


public class ForLoop3{

    // Statische Methode zur Berechnung der Fibonacci-Zahl
    static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        long fibNMinus1 = 1;
        long fibNMinus2 = 0;
        long fibAktuell = 0;

        // For-Schleife zur Berechnung der Fibonacci-Zahl
        for (int i = 2; i <= n; i++) {
            fibAktuell = fibNMinus1 + fibNMinus2;
            fibNMinus2 = fibNMinus1;
            fibNMinus1 = fibAktuell;
        }

        // Rückgabe der Fibonacci-Zahl
        return fibAktuell;
    }

    public static void main(String[] args) {

        // Beispielaufruf
        int zahl = 8;
        long fibonacciErgebnis = fibonacci(zahl);
        System.out.println("Die Fibonacci-Zahl von " + zahl + " ist: " + fibonacciErgebnis);
    }
}