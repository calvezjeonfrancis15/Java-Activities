import java.util.Arrays;

class Student {
    String name;
    int[] quizzes;
    double average;

    Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
        int sum = 0;
        for (int q : quizzes) sum += q;
        this.average = (double) sum / quizzes.length;
    }
}

class Main {
    public static void main(String[] args) {
        // 2D raw quiz data
        String[] names = {"Alice", "Bob", "Charlie", "Diana"};
        int[][] rawData = {
            {90, 85, 92, 88},
            {75, 80, 70, 85},
            {90, 85, 92, 88}, // Tie with Alice
            {95, 90, 96, 92}
        };

        // Build Student array
        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], rawData[i]);
        }

        // Custom sort (Bubble Sort) descending by average, handling ties alphabetically
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].average < students[j + 1].average || 
                   (students[j].average == students[j + 1].average && students[j].name.compareTo(students[j + 1].name) > 0)) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // Print Leaderboard
        System.out.println("--- Class Leaderboard ---");
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + ". " + students[i].name + " - Avg: " + students[i].average);
        }

        // Custom linear search for rank/student
        String searchTarget = "Bob";
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equals(searchTarget)) {
                System.out.println("\n" + searchTarget + " is ranked #" + (i + 1));
                break;
            }
        }
    }
}
