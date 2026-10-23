class Main {
    public static void main(String[] args) {
        System.out.println("--- Precedence Puzzle Solver ---");

        // 1. Prediction: true (* runs before + and >: 5 + 6 > 10 -> true)
        boolean puzzle1 = 5 + 3 * 2 > 10;
        System.out.println("Puzzle 1 Result: " + puzzle1);

        // 2. Prediction: 9 (a starts at 4, ++a becomes 5, so 4 + 5 = 9)
        int a = 4;
        int puzzle2Result = a + ++a; 
        System.out.println("Puzzle 2 Result: " + puzzle2Result);

        // 3. Prediction: true (&& has higher precedence than ||: false || true -> true)
        boolean puzzle3 = false || true && true;
        System.out.println("Puzzle 3 Result: " + puzzle3);
    }
}
