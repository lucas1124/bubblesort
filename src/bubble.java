public class bubble {



    
    
    public static void swap(int[] array, int i, int j) {
     int temp = array[i] ;
     array[i] = array [j];
     array[j] = temp;    
}
    
public static void bubble_sort(int[] array) {
    for (int i = array.length - 1;; )
    {
        for(int j = 0 ; j < 1; j++) 
        {
            if( array[j] > array[j + 1])
            {
                swap(array, i, j);
            }

        }    
    }
}
public static void bubble_sort(int[] array, int n) {
    for (int i= 0; i < n; i ++) {
        if (array[i] > array[i+1]){
            swap(array, i, i+1);
        }
    }
}
  
  
}