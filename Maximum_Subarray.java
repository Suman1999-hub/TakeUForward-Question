/*
53. Maximum Subarray
                                                
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.

 

Example 1:

    Input: 
        arr[] = {-2,1,-3,4,-1,2,1,-5,4}
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.
Example 2:

    Input: nums = [1]
    Output: 1
Example 3:

    Input: nums = [5,4,-1,7,8]
    Output: 23
*/
package Array;
import java.util.*;
public class Maximum_Subarray {
    static int maximumSubarray(int[] arr,int n){
        int sum=0;
        int max=arr[0];
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(maximumSubarray(arr,n));
    }
}
