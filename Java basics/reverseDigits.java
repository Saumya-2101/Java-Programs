import java.util.Scanner;

public class reverseDigits {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            int n = sc.nextInt();

            int ans = 0 ; 

            int original_n = n;

            while(n>0){
                ans = ans*10+n%10;
                n = n/10;
            }
            System.out.println("Reverse digits of " + original_n + " = " + ans);
        }
        
    }
}
