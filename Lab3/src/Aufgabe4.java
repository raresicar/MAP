public class Aufgabe4 {
    /**
     * Finds the cheapest keyboard
     * @param tastaturen Array of keyboard prices
     * @return The minimum price
     */
    public static int findeBilligsteTastatur(int[] tastaturen) {
        if (tastaturen.length == 0) {
            return 0;
        }

        int min = tastaturen[0];
        for (int preis : tastaturen) {
            if (preis < min) {
                min = preis;
            }
        }

        return min;
    }

    /**
     * Finds the most expensive item (either keyboard or USB drive)
     * @param tastaturen Array of keyboard prices
     * @param usbLaufwerke Array of USB drive prices
     * @return The maximum price
     */
    public static int findeTeuerstenGegenstand(int[] tastaturen, int[] usbLaufwerke) {
        int max = 0;

        for (int preis : tastaturen) {
            if (preis > max) {
                max = preis;
            }
        }

        for (int preis : usbLaufwerke) {
            if (preis > max) {
                max = preis;
            }
        }

        return max;
    }

    /**
     * Finds the most expensive USB drive that Markus can afford
     * @param usbLaufwerke Array of USB drive prices
     * @param budget Markus' budget
     * @return The maximum affordable price, or -1 if none affordable
     */
    public static int findeTeuerstesUsbLaufwerk(int[] usbLaufwerke, int budget) {
        int max = -1;

        for (int preis : usbLaufwerke) {
            if (preis <= budget && preis > max) {
                max = preis;
            }
        }

        return max;
    }
}
