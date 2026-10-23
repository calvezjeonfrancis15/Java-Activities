class Main {
    public static void main(String[] args) {
       
        int num1 = 20;
        int num2 = -6;

        System.out.println("--- Four-Function Calculator ---");
        System.out.println("Addition (+): " + (num1 + num2));
        System.out.println("Subtraction (-): " + (num1 - num2));
        System.out.println("Multiplication (*): " + (num1 * num2));
        System.out.println("Division (/): " + (num1 / num2));
        System.out.println("Modulus (%): " + (num1 % num2));

        // Note: Division (/) rounds toward zero, and Modulus (%) 
        // takes the sign of the left operand (dividend) with negative numbers
    }
}
