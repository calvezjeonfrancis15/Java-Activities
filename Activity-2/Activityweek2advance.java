class Main {
    public static void main(String[] args) {
        // 1. assigned compound growth simulation
        double balance = 1000.0;
        System.out.println("--- Compound Growth Tracking ---");
        System.out.println("Initial Balance: $" + balance);

        balance += 250.0; // Add deposit
        System.out.println("After += 250.0: $" + balance);

        balance *= 1.05; // Apply 5% interest
        System.out.println("After *= 1.05 (Interest): $" + balance);

        balance += 500.0; // Add another deposit
        System.out.println("After += 500.0: $" + balance);

        // 2. Postfix vs Prefix Increment Tracker
        System.out.println("\n--- Postfix vs Prefix Increment ---");
        
        int count = 5;
        System.out.println("Initial count: " + count);
        
        // Postfix increment (count++)
        // Prints the current value FIRST, then increments count afterwards.
        System.out.println("Using count++ inside println: " + count++);
        System.out.println("Value of count immediately after print: " + count);

        int count2 = 5;
        // Prefix increment (++count2)
        // Increments the value FIRST, then prints the new updated value.
        System.out.println("Using ++count2 inside println: " + ++count2);
        System.out.println("Value of count2 immediately after print: " + count2);

        /* 
         * Explanation: 
         * The two printed values differ because postfix (count++) evaluates and yields the 
         * original value to the expression before updating memory, whereas prefix (++count2) 
         * updates memory first and yields the newly incremented value to the expression.
         */
    }
}
