import java.util.*;

public class twoDArrays {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          System.out.println("Enter the number of rows: ");
          int rows = sc.nextInt();
          System.out.println("Enter the number of columns: ");
          int cols = sc.nextInt();

          int [][] numbers = new int[rows][cols];

          //input
          for(int i = 0; i<rows; i++){
              for(int j =0; j <cols; j++){
                  numbers[i][j] = sc.nextInt();
              }
          }
          //output
          for (int i=0;i<rows;i++){
              for(int j=0;j<cols;j++){
                  System.out.print(numbers[i][j] + " ");
              }
              System.out.println();
          }
        }
    }
}
