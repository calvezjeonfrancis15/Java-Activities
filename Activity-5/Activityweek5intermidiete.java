class Main {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 90, 88, 76, 95, 82}; 

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        // Loop to compute sum, highest, and lowest
        for (int score : scores) {
            sum += score;
            if (score > highest) highest = score;
            if (score < lowest) lowest = score;
        }

        double average = (double) sum / scores.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
