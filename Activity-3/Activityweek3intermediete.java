class Main {
    public static void main(String[] args) {
        double purchaseAmount = 150.00;
        double discountRate = 0.0;
        String tier = "";

        // Determine tier via else-if ladder
        if (purchaseAmount >= 200.0) {
            tier = "Platinum (15%)";
            discountRate = 0.15;
        } else if (purchaseAmount >= 100.0) {
            tier = "Gold (10%)";
            discountRate = 0.10;
        } else if (purchaseAmount >= 50.0) {
            tier = "Silver (5%)";
            discountRate = 0.05;
        } else {
            tier = "Standard (0%)";
            discountRate = 0.0;
        }

        double finalPrice = purchaseAmount * (1 - discountRate);

        System.out.println("Tier: " + tier);
        System.out.println("Final Price: $" + finalPrice);
    }
}
