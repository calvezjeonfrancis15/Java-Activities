lass Main {
    public static void main(String[] args) {
        String inputUser = "admin";
        String inputPass = "secret123";
        boolean isLocked = false;

        // Stage 1: Username
        if (inputUser.equals("admin")) {
            // Stage 2: Password
            if (inputPass.equals("secret123")) {
                // Stage 3: Account lock status
                if (!isLocked) {
                    System.out.println("Login Successful!");
                } else {
                    System.out.println("Error: Account is locked.");
                }
            } else {
                System.out.println("Error: Incorrect password.");
            }
        } else {
            System.out.println("Error: Invalid username.");
        }
    }
}
