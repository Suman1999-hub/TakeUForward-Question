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
