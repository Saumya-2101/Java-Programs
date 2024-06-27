import java.util.Scanner;


public class addingtwonumbers{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("enter number 1:");
            int num_1 = sc.nextInt();
            System.out.println("enter number 2:");
            int num_2 = sc.nextInt();
            int sum = num_1 + num_2 ;
            System.out.println("Sum is :" + sum);



        
        }

    }
}
