import java.util.Scanner;

public class number_pattern {
    public static void main(String[] args){
        try (Scanner scan = new Scanner (System.in)) {
            int rows;
            System.out.print("Enter no of rows: ");
            rows = scan.nextInt();
            int counter = 1;
            for (int i=rows; i>0; i--){
                for(int j=1; j<=i; j++){
                    System.out.print(" ");
                }
                for (int j=1; j<=counter; j++){
                    System.out.print(counter + " ");
                }
                System.out.println();
                counter++;
            }
        }
    }    
}