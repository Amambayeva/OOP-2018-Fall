import java.util.Scanner;

public class Problem_D {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x > 0){
            System.out.println("1");
        }else if(x < 0){
            System.out.println("-1");
        }else if (x == 0){
            System.out.println("0");
        }
    }
}
