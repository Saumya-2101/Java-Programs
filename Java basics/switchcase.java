import java.util.*;

public class switchcase {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int button = sc.nextInt();

            switch (button) {
                case 1:
                    System.out.println("namaste");
                    break;
                case 2:
                    System.out.println("hello");
                    break;
                case 3:
                    System.out.println("banjour");
                    break;
                default:
                    System.out.println("invalid button");

            }
        }

    }
}
