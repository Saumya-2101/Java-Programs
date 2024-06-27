import java.util.Scanner;


public class SimpleIntrest {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the pricipal :");
            float p = sc.nextFloat();
            System.out.println("enter rate of intrest:");
            float r = sc.nextFloat();
            System.out.println("Enter time:");
            float t = sc.nextFloat();

            float si = (p*r*t )/100 ;

            System.out.println("Simple intrest :" + si);

        }
    }
    
}
