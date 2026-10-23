import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] originalScores = {85, 92, 78, 90, 88};
        int target = 90;

        // 1. Linear search
        int foundIndex = -1;
        for (int i = 0; i < originalScores.length; i++) {
            if (originalScores[i] == target) {
                foundIndex = i;
                break;
            }
        }
        System.out.println("Target " + target + " found at index: " + foundIndex);

        // 2. Sort a COPY of the array
        int[] sortedScores = Arrays.copyOf(originalScores, originalScores.length);
        Arrays.sort(sortedScores);

        System.out.println("Original: " + Arrays.toString(originalScores));
        System.out.println("Sorted:   " + Arrays.toString(sortedScores));

        // Explanation: Sorting a copy preserves original index order, 
        // which matters if linear search results depend on original positions
    }
}
