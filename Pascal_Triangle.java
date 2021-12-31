/*
Example 1:

        Input Format: N = 5

        Result:
            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1

Explanation: There are 5 rows in the output matrix. Each row corresponds to each one of the rows in the image shown above.
Example 2:

        Input Format: N = 1

        Result: 
            1
*/

package Pattern;
import java.util.*;
public class Pascal_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int temp=1;
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(temp+" ");
                temp=temp*(i-j)/j;
            }
            System.out.println();
        }
    }
}
