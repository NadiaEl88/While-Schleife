package course.loops.whileLoop.While;

public class arr {
    public static double array_summe(double[]arr){

            double summe = 0.0;  // Initialisierung der Summe auf 0

            int i = 0;  // Initialisierung des Index
            while (i < arr.length) {  // Solange der Index kleiner als die Array-Länge ist
                summe += arr[i];  // Addiere das aktuelle Element zum Summenwert
                i++;  // Inkrementiere den Index für das nächste Element im Array
            }

            return summe;  // Gib die berechnete Summe zurück
        }
            public static void main(String[] args){

            }
            }

    public static void main(String[] args) {
        // Beispielarray erstellen
        double[] beispielArray = {1.5, 2.0, 3.5, 4.0, 5.5};

        // Aufruf der Funktion und Ausgabe des Ergebnisses
        double summe = array_summe(beispielArray);
        System.out.println("Die Summe des Arrays beträgt: " + summe);
    }

    // Die zuvor gegebene Funktion array_summe hier einfügen
    public static double array_summe(double[] arr) {
        // Implementierung der Funktion
        double summe = 0.0;
        int i = 0;
        while (i < arr.length) {
            summe += arr[i];
            i++;
        }
        return summe;
    }
}


