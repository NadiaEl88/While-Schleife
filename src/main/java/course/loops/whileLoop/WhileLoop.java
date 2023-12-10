package course.loops.whileLoop;

public class WhileLoop {

    public static long falkultaet(int n) {
        long result= 1;
        int a = 1;
        while (a <= n) {
             result *= a;
             a++;
        }
        for (int i = 0; i <= n; i++) {
            result *= i;
        }
        return result;
    }




    public static void main (String[] args) {
        /**
         *
         * while (eine Anweisung) {
         *
         * }
         *
         * Ausgabe von Quadratzahlen für alle Zahlen von 0 bis n
         *
         *while (a <= n) {
         * Ausgabe von a*a
         * a inkrementieren
         * }
         *
         * n = 3
         * a = 0
         *
         * while (0 <= 3) 1. Iteration
         * 0 (0 mal 0)
         * a = 1
         *
         * while (1 <= 3) 2. Iteration
         * 1
         * a = 2
         *
         * while (2 <= 3) 3. Iteration
         * 4
         * a = 3
         *
         * while (3 <= 3) 4. Iteration
         * 9
         * a = 3
         *
         * while (4 <= 3) 5. Iteration
         * Abbruch
         *
         *
         */
        int n = 9;
        System.out.println(n + "! = " + falkultaet(n));



    }

}

public static double aussenTemp() {
    return 30.0;
}
    public static boolean temp () {
        while (aussenTemp() <= 30.0) {
            System.out.println("Temperatur ist okay");
        }
        System.out.println("Achtung die aussenTemp ist größer 30´C");

        for (;aussenTemp() <=30.0);{
            System.out.println("Temperatur ist okay");
        }
        System.out.println("Achtung die aussenTemp ist größer 30´C");
    }