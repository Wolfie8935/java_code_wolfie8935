public class array {
    public static void main(String[] args){

        int arr_1d[] = new int [5];
        for (int i=0; i<5; i++){
            arr_1d[i] = 3*i;
        }
        System.out.print("The 1d array is: ");
        for (int i=0; i<5; i++){
            System.out.print(" " + arr_1d[i]);
        }

        int [][]arr_2d = new int [3][5];
        for(int i=0; i<3; i++){
            for (int j=0; j<5; j++){
                arr_2d[i][j] = 5*j;
            }
        }
        System.out.print("\n\nThe 2d array is: ");
        for(int i=0; i<3; i++){
            for (int j=0; j<5; j++){
                System.out.print(" " + arr_2d[i][j]);
            }
            System.out.print("\n");
        }
    }
}
