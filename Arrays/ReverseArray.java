/*
Consider the array: [1, 2, 3, 4]
Reverse array : [4, 3, 2, 1]
 */
public class ReverseArray{
    public static void main(String[] strArr){
        //Define Array
        int[] arr = {1,2,3,4,5};

        System.out.print("Array Before Reversal : ");
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        
        //Print Reverse
        for (int i = 0, j = arr.length-1; j>i; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;
        }

        System.out.print("\nArray After Reversal : ");
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }
}