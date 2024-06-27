import java.util.Scanner;

public class oddsum{

    public static void main(String[]args){

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int sum = 0;

            int i = 1 ;

            while (i<=n){

                sum +=i;
                i+=2;
                // System.out.println(sum);
            }
            System.out.println(sum);
        }

        
        }


    }
