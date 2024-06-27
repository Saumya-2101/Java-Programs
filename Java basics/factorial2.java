import java.util.Scanner;

class factorial2 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number :");
            int num = sc.nextInt();
            long fact = factorial(num);
            System.out.println("Factoral is: " + fact);
        }

    }

    public static long factorial(int num) {
        if (num < 2) {
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }
}