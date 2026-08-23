import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Provide Value for row = " + i + " and column = " + j);
                arr[i][j] = sc.nextInt();
            }
        }
//
        int rowLength = arr.length;
        for (int rowIndex = 0; rowIndex < rowLength; rowIndex++) {
            //current row brr[i]
            int colLength = arr[rowIndex].length;
            for (int colIndex = 0; colIndex < colLength; colIndex++) {
                System.out.print(arr[rowIndex][colIndex]);
            }
            System.out.println();
        }
        }
    }
