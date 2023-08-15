import java.util.Scanner;

public class patterns {
    public static void main (String[] args){
        try (Scanner scan = new Scanner (System.in)) {
            int n;
            System.out.print("Enter any number: ");
            n = scan.nextInt();

            for (int i=1; i<=n; i++){
                for (int j=0; j<i; j++){
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
            for (int i=n; i>=1; i--){
                for (int j=0; j<i; j++){
                    System.out.print("* ");
                }
                System.out.print("\n");
            }
        }
    }
}
