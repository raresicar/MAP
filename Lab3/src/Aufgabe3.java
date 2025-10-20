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

    /**
     * Subtracts two large numbers represented as arrays (zahl1 - zahl2)
     * Assumes zahl1 >= zahl2
     * @param zahl1 First number as array
     * @param zahl2 Second number as array
     * @return Difference as array
     */
    public static int[] subtrahiere(int[] zahl1, int[] zahl2) {
        int n = zahl1.length;
        int[] result = new int[n];
        int borrow = 0;

        // Subtract from right to left
        for (int i = n - 1; i >= 0; i--) {
            int diff = zahl1[i] - zahl2[i] - borrow;

            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result[i] = diff;
        }

        return result;
    }

    /**
     * Multiplies a large number by a single digit
     * @param zahl Large number as array
     * @param ziffer Single digit (0-9)
     * @return Product as array
     */
    public static int[] multipliziere(int[] zahl, int ziffer) {
        int n = zahl.length;
        int[] result = new int[n + 1];
        int carry = 0;

        // Multiply from right to left
        for (int i = n - 1; i >= 0; i--) {
            int product = zahl[i] * ziffer + carry;
            result[i + 1] = product % 10;
            carry = product / 10;
        }

        result[0] = carry;

        // Remove leading zero if present and not the only digit
        if (result[0] == 0 && n > 0) {
            int[] trimmed = new int[n];
            System.arraycopy(result, 1, trimmed, 0, n);
            return trimmed;
        }

        return result;
    }

    /**
     * Divides a large number by a single digit (integer division)
     * @param zahl Large number as array
     * @param ziffer Single digit (1-9)
     * @return Quotient as array
     */
    public static int[] dividiere(int[] zahl, int ziffer) {
        int n = zahl.length;
        int[] result = new int[n];
        int remainder = 0;

        // Divide from left to right
        for (int i = 0; i < n; i++) {
            int current = remainder * 10 + zahl[i];
            result[i] = current / ziffer;
            remainder = current % ziffer;
        }

        return result;
    }

    
}
