import java.util.Scanner;

public class question {
    public static void main (String [] args){
        try (Scanner input = new Scanner(System.in)) {
            double mark_avg;
             int result;
             int i;
             int s;
     //define size of array
      s = input.nextInt();
    //The array is defined "arr" and inserted marks into it.
     int[] arr = new int[s];   
     for(i=0;i<arr.length;i++)
    {
            arr[i]=input.nextInt();
    }
            double t=0.0;
            result=0;
            for(int j=1;j<arr.length-1;j++)
            {
                if (arr[j]> arr[j+1])
                {
                    result=arr[j];
                }
            
                t+=arr[j];
            }
            mark_avg=t/arr.length;
            System.out.println(result);
            System.out.println(mark_avg);
        }
    }
}
