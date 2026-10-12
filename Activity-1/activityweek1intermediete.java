class Main {
    public static void main(String[] args) {
       int quantity = 3;
        double unitPrice = 19.99;
        String storeName = "Tech Haven";

      
        double totalCost = quantity * unitPrice;

       
        System.out.println("--- Itemized Purchase Summary ---");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Total Cost: $" + totalCost);

 /* 
 * totalCost should NOT be an int because unitPrice has decimals. 
 * Assigning a double calculation to an int loses decimal precision 
 * (cents) and causes a Java compilation error without explicit casting.
 */
    }
}
