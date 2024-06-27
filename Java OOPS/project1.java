import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the age:");

            int age = sc.nextInt();

            if (age <= 12) {
                System.out.println("young child");
            } else if (age > 12 && age < 18) {
                System.out.println("teenager");
            } else {
                System.out.println("adult");
            }

        }
    }
}
