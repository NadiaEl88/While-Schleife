package course.loops.forLoop;

public class ForLoop {

    public static long summeRekursion(int n) {

        if (n <= 0) {
            return 0;
        } else {
            return n + summeRekursion(n - 1);
        }
    }

    public static int SummerForSchleife(int n) {
        int result = 0;
        for (int index = 0; index <= n; index++) {
            result += index;
    }
    return result;
}

    public static void main(String[] args) {

        /**
         *
         * for (3 Anweisungen) {
         *      Logik, die mehrfach ausgeführt wird
         * }
         *
         * Summe von Zahlen von 0 bis n
         *
         * for (int i = 0; i <= n; i++) {
         *      i auf das bestehende Teilergebnis addieren
         * }
         *
         * Quadrat von 0 bis n = 2
         *
         * for (i = 0; 0 <= 2; i =1) 1. Iteration
         * 0
         *
         * for (i = 1; 1 <= 2; i = 2) 2. Iteration
         * 1
         *
         * for (i = 2; 2 <= 2; i = 3) 3. Iteration
         * 4
         *
         * for (i = 3; 3 <= 2; ) 4. Iteration
         * Abbruch
         *
         *
         */
        int limit = 100000;
        System.out.println("Schleifen Summe von 0 bis " + limit + " ist: " + SummerForSchleife(limit));
        System.out.println("Rekursion Summe von 0 bis " + limit + " ist: " + summeRekursion(limit));
    }

}



