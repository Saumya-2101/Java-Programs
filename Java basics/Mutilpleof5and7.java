import java.util.Scanner;

public class Mutilpleof5and7 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        }
        int num = 1;
        while(true){
            if((num%5==0) && (num%7==0)){
                System.out.println("found ans - " + num);
                break;

            }
            num++;
        }
    }
}
