import java.util.Scanner;

public class pyramid_patterns {
    public static void main(String[] args){
        try (Scanner scan = new Scanner (System.in)) {
            int rows;
            System.out.print("Enter the number of rows: ");
            rows = scan.nextInt();
            for(int i=1; i<=rows; i++){
                for(int j=1; j<=rows - i; j++){
                    System.out.print("  ");
                }
                for(int j=1; j<=((i*2)-1); j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }    
}
