public class MaxProfit {

    /**
     * Hier wird der maximal mögliche Profit berechnet
     *
     * @param kursDifferenz Die Differenzen zum Vortag als Array
     */
    public static int maxProfit(int[] kursDifferenz) {

        // Array für die bestmöglichen Ergebnisse von einem Tag ausgehend
        int[] results = new int[kursDifferenz.length];

        // i ist hier der Tag ab dem gestartet werden soll.
        for (int i=0; i<kursDifferenz.length; i++) {

            // Hier wird der höchst mögliche Profit eines bestimmten Tages
            // in das Array gespeichert.
            results[i] = possibleProfitsFromStartDay(kursDifferenz, i);
        }

        // Hier wird die höchste Zahl des Arrays gesucht.
        return highestNumberinArray(results);
    }

    private static int possibleProfitsFromStartDay(int[] diffs, int startDay) {

        // In diesem Array werden später
        int[] results = new int[diffs.length];

        // Die Summe von Tag x ausgehend
        int sum = 0;

        // Hier wird ab einem bestimmten Tag im Array gestartet
        for (int i=startDay; i<diffs.length; i++) {

            // Die Differenz zum Vortag wird zur Summe addiert
            sum += diffs[i];

            // Der mögliche Ausgang wird in das Array gespeichert.
            results[i] = sum;
        }

        // Der höchste mögliche Ausgang für den Tag wird gesucht
        return highestNumberinArray(results);
    }

    private static int highestNumberinArray(int[] numbers) {
        int highest = 0;
        for (int i=0; i<numbers.length; i++) {
            if (highest < numbers[i]) {
                highest = numbers[i];
            }
        }
        return highest;
    }
}
