class Main {
    public static void main(String[] args) {
        // Declare student grade and absence variables
        double averageGrade = 88.5;
        int absences = 2;

        // Eligibility rule: average >= 75 AND absences <= 3, OR average >= 90 regardless of absences
        boolean hasPassed = (averageGrade >= 75 && absences <= 3) || (averageGrade >= 90);

        System.out.println("--- Grade Threshold Checker ---");
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Absences: " + absences);

        if (hasPassed) {
            System.out.println("Status: PASS");
            System.out.println("Reasoning: The student met the passing criteria (either passed standard threshold with low absences or achieved an exceptional grade >= 90).");
        } else {
            System.out.println("Status: FAIL");
            System.out.println("Reasoning: The student did not meet the minimum grade threshold or exceeded the allowed absences.");
        }
    }
}
