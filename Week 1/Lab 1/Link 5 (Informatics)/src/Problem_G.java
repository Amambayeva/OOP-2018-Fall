import java.util.*;

public class Problem_G {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
        }
        for(int i = n - 1; i >= 0; i--){
           System.out.print(a[i] + " ");
        }
    }
}
