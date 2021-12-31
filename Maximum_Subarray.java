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
