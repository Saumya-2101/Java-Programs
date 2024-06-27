import java.util.Scanner;

public class conditionalOperators {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int value = sc.nextInt();
            
            // if (value%2==0  &&  value%3==0){
            //     System.out.println("found value" +value);

            // }
            if (value%3==0 || value%5==0){
                System.out.println("found value -"+value);
            }
        }
    }
}
