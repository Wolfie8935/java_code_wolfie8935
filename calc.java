import java.util.Scanner;

public class calc {
    public static void main (String[] args){
        try (Scanner scan = new Scanner (System.in)) {
            float a,b,c;
            System.out.print("Enter Number 1: ");
            a = scan.nextInt();
            System.out.print("Enter Number 2: ");
            b = scan.nextInt();
            System.out.print("\nEnter any option:\n1> Addition\n2> Substraction\n3> Multiplication\n4> Division\n5> Greater\n Enter your option: ");
            c = scan.nextInt();
            float result = 0;
            if(c==1){
                result = a + b;
            }
            else if(c==2){
                result = a-b;
            }
            else if(c==3){
                result = a*b;
            }
            else if(c==4){
                result = a/b;
            }
            else if (c==5){
                if(a>b){
                    result = a;
                }
                else{
                    result = b;
                }
            }
            else{
                System.out.println("ERROR... Contact the developer for resolution of this error... error 6969... code malfunctioned... MAYDAY MAYDAY!!!");
            }
            System.out.println("THE ANSWER IS: " + result);
        }
    }
}
