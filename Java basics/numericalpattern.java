import java.util.Scanner;

public class numericalpattern {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){

            int r = sc.nextInt();

            int c = sc.nextInt();

            // Numbers 1to7 

            // for(int i = 1 ; i<=r ; i++){

            //     for(int j = i ; j<=r ; j++){
            //         System.out.print(j);
            //     }
            //     for(int k = 1 ; k<=i-1 ; k++){
            //         System.out.print(k);
            //     }
            //     System.out.println();
            // }


            //  Numbers only 1 and 2 

            for(int i=1 ; i<=r ; i++){
                for(int j=1 ; j<=c ; j++){
                    if( (i+j)%2 == 0){
                        System.out.print(1);
                    }
                    else{
                        System.out.print(2);
                    }

                }
                System.out.println();
            }

        }
    }
}
