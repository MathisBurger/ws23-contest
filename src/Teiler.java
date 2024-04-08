public class Teiler {

    public static int anzahlTeiler (int n) {
        int teilerCount = 0;
        for (int i=2; i<n; i++) {
            if (n % i == 0) {
                teilerCount += 1;
            }
        }
        return teilerCount;
    }
}
