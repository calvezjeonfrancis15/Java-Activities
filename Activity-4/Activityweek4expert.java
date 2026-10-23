class Main {
    public static void main(String[] args) {
        // 2D array representation (-1 means damaged shelf)
        int[][] warehouse = {
            {15, 3, 20},
            {-1, 5, 8},
            {2, 35, 12}
        };

        // 1. Do-while driven menu simulation
        boolean running = true;
        int menuCycle = 0; 

        do {
            // 2. For loop with continue to total inventory, skipping damaged shelves (-1)
            int totalInventory = 0;
            for (int r = 0; r < warehouse.length; r++) {
                for (int c = 0; c < warehouse[r].length; c++) {
                    if (warehouse[r][c] == -1) {
                        continue; // Skip damaged shelf
                    }
                    totalInventory += warehouse[r][c];
                }
            }
            System.out.println("Total Valid Inventory: " + totalInventory);

            // 3. Nested loops with break to find first critically low shelf (< 4 items)
            boolean foundLow = false;
            for (int r = 0; r < warehouse.length; r++) {
                for (int c = 0; c < warehouse[r].length; c++) {
                    if (warehouse[r][c] >= 0 && warehouse[r][c] < 4) {
                        System.out.println("Critically low shelf found at: [" + r + "][" + c + "]");
                        foundLow = true;
                        break;
                    }
                }
                if (foundLow) break;
            }

            // 4. While loop simulation for input validation/restocking
            int stockToAdd = 5;
            while (stockToAdd < 10) {
                stockToAdd++; // Restock simulation
            }
            System.out.println("Restocked amount: " + stockToAdd);

            running = false; // Exit do-while loop after 1 cycle
        } while (running);
    }
}
