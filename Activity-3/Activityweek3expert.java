class Main {
    public static void main(String[] args) {
        String savedUser = "user123";
        int savedPin = 1234;
        
        String inputUser = "user123";
        int inputPin = 1234;

        double balance = 500.0;
        double requestedWithdrawal = 200.0;

        // 1. Nested username & PIN check
        if (inputUser.equals(savedUser)) {
            if (inputPin == savedPin) {
                
                // 2. Determine account tier via else-if
                String tier = "";
                if (balance >= 1000.0) tier = "Platinum";
                else if (balance >= 500.0) tier = "Gold";
                else if (balance >= 200.0) tier = "Silver";
                else tier = "Bronze";

                // 3. Switch statement for fee percentage
                double feeRate = switch (tier) {
                    case "Platinum" -> 0.01;
                    case "Gold" -> 0.02;
                    case "Silver" -> 0.03;
                    default -> 0.05;
                };

                // 4. Nested withdrawal limit logic
                double dailyLimit = tier.equals("Platinum") ? 1000.0 : 300.0;
                double totalNeeded = requestedWithdrawal + (requestedWithdrawal * feeRate);

                if (requestedWithdrawal <= dailyLimit) {
                    if (balance >= totalNeeded) {
                        balance -= totalNeeded;
                        System.out.println("APPROVED. New Balance: $" + balance);
                    } else {
                        System.out.println("DENIED: Insufficient funds.");
                    }
                } else {
                    System.out.println("DENIED: Exceeds daily limit.");
                }

            } else {
                System.out.println("DENIED: Incorrect PIN.");
            }
        } else {
            System.out.println("DENIED: Unknown user.");
        }
    }
