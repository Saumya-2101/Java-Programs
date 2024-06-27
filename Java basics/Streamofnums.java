import java.util.Scanner;

public class Streamofnums {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int num = sc.nextInt();
            int sum= 0;

            do{
                sum += num ;
                num = sc.nextInt();
            }while(num != -1 );

            // while (num!=-1){
            //     sum += num;
            //     num = sc.nextInt();

            // }
            System.out.println(sum);


        }

    }
}
