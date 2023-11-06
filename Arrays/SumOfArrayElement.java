/*
Consider the array: [1, 2, 3, 4]
Sum of array elements : 10
 */
public class SumOfArrayElement{
    public static void main(String[] strArr){
        //Define Array
        int[] arr = {1,2,3,4};

        int sum = 0;
        //Calculate Sum
        for (int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of array elements : "+ sum);
    }
}