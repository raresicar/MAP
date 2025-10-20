public class Aufgabe2 {
    /**
     * Finds the maximum number in the array
     * @param numbers Array of positive numbers
     * @return The maximum number
     */
    public static int findeMaximaleZahl(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    /**
     * Finds the minimum number in the array
     * @param numbers Array of positive numbers
     * @return The minimum number
     */
    public static int findeMinimaleZahl(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        return min;
    }

    /**
     * Finds the maximum sum of n-1 numbers
     * (sum of all numbers except the minimum)
     * @param numbers Array of positive numbers
     * @return The maximum sum
     */
    public static int findeMaximaleSumme(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }

        int min = findeMinimaleZahl(numbers);
        return totalSum - min;
    }

    /**
     * Finds the minimum sum of n-1 numbers
     * (sum of all numbers except the maximum)
     * @param numbers Array of positive numbers
     * @return The minimum sum
     */
    public static int findeMinimaleSumme(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int totalSum = 0;
        for (int number : numbers) {
            totalSum += number;
        }

        int max = findeMaximaleZahl(numbers);
        return totalSum - max;
    }

    /**
     * Test method with the example from the assignment
     */
    public static void main(String[] args) {
        int[] numbers = {4, 8, 3, 10, 17};

        System.out.println("Array: ");
        printArray(numbers);

        System.out.println("\n1. Maximale Zahl:");
        System.out.println(findeMaximaleZahl(numbers));

        System.out.println("\n2. Minimale Zahl:");
        System.out.println(findeMinimaleZahl(numbers));

        System.out.println("\n3. Maximale Summe von n-1 Zahlen:");
        System.out.println(findeMaximaleSumme(numbers));
        System.out.println("   (4 + 8 + 10 + 17 = 39)");

        System.out.println("\n4. Minimale Summe von n-1 Zahlen:");
        System.out.println(findeMinimaleSumme(numbers));
        System.out.println("   (4 + 8 + 3 + 10 = 25)");
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
