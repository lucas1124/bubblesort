import java.util.Arrays;

public class array {

 
    public static void main(String[] args) {
        int[] arr = new int[100];

        // Populate the array with random integers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        
      
        // Perform the bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;      
                }
            }
        }
    
    
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}