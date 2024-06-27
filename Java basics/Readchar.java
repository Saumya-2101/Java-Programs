import java.util.Scanner;



public class Readchar {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a character :");

            char ch = sc.next().charAt(0);

            System.out.println("Character is :"+ ch);

        }
    }
}
