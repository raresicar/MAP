public class Aufgabe3 {
    /**
     * Adds two large numbers represented as arrays
     * @param zahl1 First number as array
     * @param zahl2 Second number as array
     * @return Sum as array
     */
    public static int[] addiere(int[] zahl1, int[] zahl2) {
        int n = zahl1.length;
        int[] result = new int[n + 1];
        int carry = 0;

        // Add from right to left
        for (int i = n - 1; i >= 0; i--) {
            int sum = zahl1[i] + zahl2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;
        return result;
    }
}
