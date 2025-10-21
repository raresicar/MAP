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

    /**
     * Finds the maximum amount Markus can spend buying one keyboard and one USB drive
     * @param budget Markus' budget
     * @param tastaturen Array of keyboard prices
     * @param usbLaufwerke Array of USB drive prices
     * @return Maximum amount that can be spent, or -1 if cannot afford both items
     */
    public static int findeMaximalenGeldbetrag(int budget, int[] tastaturen, int[] usbLaufwerke) {
        int maxAusgabe = -1;

        for (int tastaturPreis : tastaturen) {
            for (int usbPreis : usbLaufwerke) {
                int gesamtPreis = tastaturPreis + usbPreis;

                if (gesamtPreis <= budget && gesamtPreis > maxAusgabe) {
                    maxAusgabe = gesamtPreis;
                }
            }
        }

        return maxAusgabe;
    }

    /**
     * Test method with the examples from the assignment
     */
    public static void main(String[] args) {
        // Test 1: Cheapest keyboard
        System.out.println("1. Billigste Tastatur:");
        int[] tastaturen1 = {40, 35, 70, 15, 45};
        System.out.print("   Tastaturen: ");
        printArray(tastaturen1);
        System.out.println("   => " + findeBilligsteTastatur(tastaturen1));

        // Test 2: Most expensive item
        System.out.println("\n2. Teuerster Gegenstand:");
        int[] tastaturen2 = {15, 20, 10, 35};
        int[] usb2 = {20, 15, 40, 15};
        System.out.print("   Tastaturen: ");
        printArray(tastaturen2);
        System.out.print("   USB: ");
        printArray(usb2);
        System.out.println("   => " + findeTeuerstenGegenstand(tastaturen2, usb2));

        // Test 3: Most expensive affordable USB drive
        System.out.println("\n3. Teuerstes USB-Laufwerk (innerhalb Budget):");
        int[] usb3 = {15, 45, 20};
        int budget3 = 30;
        System.out.print("   USB-Laufwerke: ");
        printArray(usb3);
        System.out.println("   Budget: " + budget3);
        System.out.println("   => " + findeTeuerstesUsbLaufwerk(usb3, budget3));

        // Test 4a: Maximum spending
        System.out.println("\n4a. Maximaler Geldbetrag:");
        int budget4a = 60;
        int[] tastaturen4a = {40, 50, 60};
        int[] usb4a = {8, 12};
        System.out.println("   Budget: " + budget4a);
        System.out.print("   Tastaturen: ");
        printArray(tastaturen4a);
        System.out.print("   USB-Laufwerke: ");
        printArray(usb4a);
        System.out.println("   => " + findeMaximalenGeldbetrag(budget4a, tastaturen4a, usb4a));
        System.out.println("   (50 + 8 = 58)");

        // Test 4b: Cannot afford both
        System.out.println("\n4b. Maximaler Geldbetrag (kann nicht beide kaufen):");
        int budget4b = 60;
        int[] tastaturen4b = {60};
        int[] usb4b = {8, 12};
        System.out.println("   Budget: " + budget4b);
        System.out.print("   Tastaturen: ");
        printArray(tastaturen4b);
        System.out.print("   USB-Laufwerke: ");
        printArray(usb4b);
        System.out.println("   => " + findeMaximalenGeldbetrag(budget4b, tastaturen4b, usb4b));

        // Test 4c: Another example
        System.out.println("\n4c. Maximaler Geldbetrag:");
        int budget4c = 60;
        int[] tastaturen4c = {40, 60};
        int[] usb4c = {8, 12};
        System.out.println("   Budget: " + budget4c);
        System.out.print("   Tastaturen: ");
        printArray(tastaturen4c);
        System.out.print("   USB-Laufwerke: ");
        printArray(usb4c);
        System.out.println("   => " + findeMaximalenGeldbetrag(budget4c, tastaturen4c, usb4c));
        System.out.println("   (40 + 12 = 52)");
    }

    /**
     * Helper method to print an array
     */
    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
