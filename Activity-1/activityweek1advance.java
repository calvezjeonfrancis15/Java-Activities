class Main {
    public static void main(String[] args) {
        double centimeters = 375.25;
        int wholeMeters = (int) (centimeters / 100);
        double remainingCentimeters = centimeters % 100;

        System.out.println("--- Length Conversion ---");
        System.out.println("Total Centimeters: " + centimeters);
        System.out.println("Equivalent Whole Meters: " + wholeMeters + " m");
        System.out.println("Remaining Centimeters: " + remainingCentimeters + " cm\n");

        int stepscount = 1250;
// No cast is needed because double has a larger capacity than int. 
// Java automatically and safely widens/converts the int value into a double.
        
        double widenedSteps = stepscount;
        System.out.println("Implicit Widening (int to double): " + widenedSteps);

        double preciseTemperature = 38.95;
//Explicitly casting double to int forces Java to truncate the fractional part (.95). 
// The exact decimal data is completely lost, leaving only the whole number 38.        
        int truncatedTemperature = (int) preciseTemperature;
        System.out.println("Explicit Narrowing (double to int): " + truncatedTemperature);
    }
}
