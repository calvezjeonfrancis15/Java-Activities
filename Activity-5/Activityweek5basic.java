class Main {
    public static void main(String[] args) {
        String[] favorites = {"Coding", "Reading", "Gaming", "Hiking", "Music"}; // 5 favorites

        // Print each item numbered 1 through 5
        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("Total Length: " + favorites.length); // Print array length
    }
}
