class Main {
    public static void main(String[] args) {
        int[] inputs = {10, 20, -5, 15, -1}; // Test sequence with negative number
        int total = 0;
        int index = 0;

        // Loop until -1
        while (index < inputs.length) {
            int current = inputs[index];
            if (current == -1) {
                break;
            }
            total += current;
            index++;
        }

        System.out.println("Final Total: " + total);
    }
}
