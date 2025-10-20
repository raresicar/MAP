public class Aufgabe1 {

    /**
     * Returns an array of failing grades (grades less than 40)
     * @param grades Array of grades
     * @return Array of failing grades
     */
    public static int[] getNichtAusreichendeNoten(int[] grades) {
        int count = 0;
        for (int grade : grades) {
            if (grade < 40) {
                count++;
            }
        }

        int[] failingGrades = new int[count];
        int index = 0;
        for (int grade : grades) {
            if (grade < 40) {
                failingGrades[index++] = grade;
            }
        }

        return failingGrades;
    }

    /**
     * Calculates the average of all grades
     * @param grades Array of grades
     * @return Average value rounded to 2 decimal places
     */
    public static double getDurchschnittswert(int[] grades) {
        if (grades.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        double average = (double) sum / grades.length;
        return Math.round(average * 100.0) / 100.0;
    }

    /**
     * Rounds grades according to university rules:
     * - If grade < 38, no rounding
     * - If difference to next multiple of 5 is less than 3, round up
     * @param grades Array of grades
     * @return Array of rounded grades
     */
    public static int[] getAbgerundeteNoten(int[] grades) {
        int[] roundedGrades = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            roundedGrades[i] = rundeNote(grades[i]);
        }

        return roundedGrades;
    }

    /**
     * Helper method to round a single grade
     * @param grade The grade to round
     * @return The rounded grade
     */
    private static int rundeNote(int grade) {
        if (grade < 38) {
            return grade;
        }

        int nextMultipleOfFive = ((grade / 5) + 1) * 5;
        int difference = nextMultipleOfFive - grade;

        if (difference < 3) {
            return nextMultipleOfFive;
        }

        return grade;
    }

    /**
     * Finds the maximum rounded grade
     * @param grades Array of grades
     * @return The maximum grade after rounding
     */
    public static int getMaximaleAbgerundeteNote(int[] grades) {
        if (grades.length == 0) {
            return 0;
        }

        int[] roundedGrades = getAbgerundeteNoten(grades);
        int max = roundedGrades[0];

        for (int grade : roundedGrades) {
            if (grade > max) {
                max = grade;
            }
        }

        return max;
    }
}