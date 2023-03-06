import java.util.Arrays;

public class SelectionSort {
    
    public static void main(String[] args){
        int[] arr = {23,4 , 73, 10, 15, 28};
        
        for(int i = 0; i<arr.length; i++){

            int minIndex = i;
            for(int j=i;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
        // we found the minimum value and will place it at the start of iteration by swapping
        // swap
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
