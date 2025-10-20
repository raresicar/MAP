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


}
