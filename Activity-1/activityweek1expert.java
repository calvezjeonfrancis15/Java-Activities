class Main {
    public static void main(String[] args) {
      byte maxByte = 127;
        maxByte++; // Wraps around to -128 due to two's complement overflow
        System.out.println("--- 1. Primitive Overflow ---");
        System.out.println("Byte after overflowing 127: " + maxByte);

       
        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = "Java";

        System.out.println("\n--- 2 & 3. String Comparisons ---");
        // Compare str1 and str2
        System.out.println("str1 == str2: " + (str1 == str2)); 
        System.out.println("str1.equals(str2): " + str1.equals(str2)); 

        // Compare str1 and str3
        System.out.println("str1 == str3: " + (str1 == str3)); 
        System.out.println("str1.equals(str3): " + str1.equals(str3)); 

        // Compare str2 and str3
        System.out.println("str2 == str3: " + (str2 == str3)); 
        System.out.println("str2.equals(str3): " + str2.equals(str3)); 

        /* 
         * Explanation of WHY each == comparison produced its result:
         * - str1 == str2 is FALSE because 'new String()' explicitly forces the creation of 
         *   two distinct object instances in the heap, resulting in different memory addresses.
         * - str1 == str3 is FALSE because str1 points to a heap object created by 'new', 
         *   whereas str3 points to a cached instance residing in the internal String Pool.
         * - str2 == str3 is FALSE for the same reason (one is in the heap, one is in the pool).
         * - Note: .equals() evaluates to TRUE for all pairs because it compares the actual 
         *   character sequence rather than memory references.
         */

        // 4. Demonstrate array reference sharing
        System.out.println("\n--- 4. Array Reference Sharing ---");
        int[] originalArray = {10, 20, 30};
        int[] sharedArray = originalArray; // Both variables reference the exact same array in memory

        System.out.println("Before modification - originalArray[0]: " + originalArray[0]);
        
        // Modifying the array elements through one variable
        sharedArray[0] = 99; 

        // Showing that the change is visible through the other variable
        System.out.println("After modifying sharedArray, originalArray[0]: " + originalArray[0]);
    }
}
