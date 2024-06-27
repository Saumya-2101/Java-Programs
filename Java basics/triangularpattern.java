import java.util.Scanner;

public class triangularpattern {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int r = sc.nextInt();

            
            // Triangular pattern
            // for( int i=1 ; i<=r ; i++){

            //     for( int j=1 ; j<=i ; j++){

            //         System.out.print("*");
            //     }
            //     System.out.println();

            // }

            // Reverse triangle

            // for(int i = 1; i<=r ; i++){
            //     for(int j=1 ; j<=(r+1-i) ; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }

            // Pyramid Pattern  

            for(int i = 1 ; i<=r ; i++){

                for(int j=1 ; j<=r-i ; j++){
                    System.out.print(" ");
                }
                for(int k=1 ; k<=2*i-1 ; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}