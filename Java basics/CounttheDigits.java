import java.util.Scanner;

public class CounttheDigits {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            
            int numOfDigits = 0;

            int original_n = n;

            while(n > 0){
                n = n/10;
                numOfDigits++;
            }
            System.out.println("Number of digits in " + original_n + " = " + numOfDigits);

        }

        
        
    }
}