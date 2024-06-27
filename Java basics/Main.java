import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter your name:");
            String name = sc.next();
            System.out.println("Name is "+ name);
        }


    }
}