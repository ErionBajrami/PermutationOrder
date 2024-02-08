import java.util.Arrays;

public class PermutationsOrderProjekt {
    
    // Function to generate permutations in lexicographic order
    public static void permutationsOrder(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        
        // Print the initial permutation
        System.out.println(Arrays.toString(arr));
        
        // Generate next permutations until it's not possible
        while (true) {
            int i = n - 2;
            
            // Find the largest index i such that arr[i] < arr[i+1]
            while (i >= 0 && arr[i] >= arr[i + 1]) {
                i--;
            }
            
            // If no such index exists, then we have reached the last permutation
            if (i == -1) {
                break;
            }
            
            // Find the largest index j such that arr[j] > arr[i]
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            
            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            // Reverse the suffix starting at index i+1
            reverse(arr, i + 1, n - 1);
            
            // Print the next permutation
            System.out.println(Arrays.toString(arr));
        }
    }
    
    // Function to reverse an array from start to end indices
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int n = 5; // Change the value of n as needed
        permutationsOrder(n);
    }
}
