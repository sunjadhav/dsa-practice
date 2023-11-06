/*
Consider the array: [1, -2, 30, -4]
Max Element : 30
 */
public class MaxOfArrayElements{
    public static void main(String[] strArr){
        //Define Array
        int[] arr = {1,-2,30,4};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length; i++){
            max = max < arr[i] ? arr[i] : max;
        }
        System.out.println("Max Element : "+max);
    }
}