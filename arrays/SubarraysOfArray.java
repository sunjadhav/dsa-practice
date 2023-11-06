// A subarray is a contiguous (or continuous) part of an array. 
// In other words, a subarray is a portion of an array that consists of elements from the original array and maintains their relative ordering. 
/*
Consider the array: [1, 2, 3, 4]
Subarray with a single element:
[1]
[2]
[3]
[4]
Subarrays with multiple elements:
[1, 2]
[2, 3]
[3, 4]
[1, 2, 3]
[2, 3, 4]
[1, 2, 3, 4]
Empty subarray:
[]
 */
public class SubarraysOfArray{
    public static void main(String[] strArr){
        //Define Array
        int[] arr = {1,2,3,4};

        //Print Subarray
        for (int i = 0; i<arr.length; i++){
            for (int j = i; j<arr.length; j++){
                for (int k = i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println("");
            }
        }
    }
}