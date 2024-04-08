public class Mehrfach {

    public static boolean hatMehrfachZeichen (String s) {
        char[] existing = new char[s.length()];
        int currentIndex = 0;

        for (int i=0; i<s.length(); i++) {
            if (arrayContains(existing, s.charAt(i))) {
                return true;
            }
            existing[currentIndex] = s.charAt(i);
            currentIndex += 1;
        }
        return false;
    }

    private static boolean arrayContains(char[] array, char element) {
        for (char c : array) {
            if (c == element) {
                return true;
            }
        }
        return false;
    }
}
