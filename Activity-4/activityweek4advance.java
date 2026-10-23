class Main {
    public static void main(String[] args) {
    
        for (int i = 1; i <= 5; i++) {
            // Skip row 3 using continue
            if (i == 3) {
                continue; 
            }
            
            // Inner loop for columns
            for (int j = 1; j <= 5; j++) {
                // Stop inner loop early when j reaches 4 using break
                if (j == 4) {
                    break; 
                }
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }
}
