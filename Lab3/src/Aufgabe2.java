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

    
}
