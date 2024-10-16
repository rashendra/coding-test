package codility.nbb;
import java.util.Arrays;


public class TablePrintNAB {

    public static void solution(int[] A, int K){
        int maximumNoOfDigits = 0;
        for (int i = 0; i < A.length; i++)
        {
            int noOfDigitsInANumber = String.valueOf(A[i]).length();
            if (noOfDigitsInANumber > maximumNoOfDigits)
            {
                maximumNoOfDigits = noOfDigitsInANumber;
            }
        }

        // Print the top line of the table
        for (int i = 0; i < K; i++)
        {
            System.out.print("+" + "-".repeat(maximumNoOfDigits + 2));
        }
        System.out.println("+");

        // Print the rows of the table
        for (int i = 0; i < A.length; i += K)
        {
            // Print the left edge of the cell
            System.out.print("|");

            // print all numbers of array with pipeline separator.
            for (int j = 0; j < K; j++)
            {
                if (i + j < A.length)
                {
                    System.out.printf(" %" + maximumNoOfDigits + "d |", A[i + j]);
                }
                else
                {
                    System.out.printf(" %" + maximumNoOfDigits + "s |", " ");
                }
            }


            System.out.println();

            // After each row of the 2D array, write a line.

            if (i + K < A.length)
            {
                for (int j = 0; j < K; j++)
                {
                    System.out.print("+" + "-".repeat(maximumNoOfDigits + 2));
                }
                System.out.println("+");
            }
        }
        // Print the bottom edge of the table
        for (int i = 0; i < K; i++)
        {
            System.out.print("+" + "-".repeat(maximumNoOfDigits + 2));
        }
        System.out.println("+");

    }

    public static void main(String[] args) {
        int[] myArray = {4, 35, 80, 123, 12345, 44, 8, 5, 24, 3, 22, 35};
        int[] myArray3 = {4, 34, 345,3456 };
        int K = 2;
//        solution(myArray, 7);
        solution2(myArray, 7);
        solution2(myArray3, 3);
    }

    public static void solution2(int[] A, int K){
        int[] originalArray = Arrays.stream(A).toArray();
        Arrays.sort(A);
        int maxNumber = A[A.length-1];
//        System.out.println(maxNumber);
        int maxNumberDigit = String.valueOf(maxNumber).length();

        String[] newStringArray = new String[A.length];
        int lastRowCount = (newStringArray.length % K) == 0? K :(newStringArray.length % K) ;

        for (int i = 0; i< originalArray.length ; i++) {
            String ss = String.valueOf(originalArray[i]);
            int length = ss.length();
            newStringArray[i] = " ".repeat(maxNumberDigit - length+2)+ ss;
//            System.out.println("This is new string:["+ newStringArray[i]+"]");
        }
        System.out.println(newStringArray.length);
        // Print the top line
        for (int i = 0; i < K; i++)
        {
            System.out.print("+" + "-".repeat(maxNumberDigit + 2));
        }
        System.out.println("+");

        int secondaryIndex = 0;
        int complexity = 0 ;

        for (int i = 0 ; i < newStringArray.length && secondaryIndex < newStringArray.length  ; i++) {
            int localIndex = 0;
            complexity++;
            while (localIndex< K && secondaryIndex < newStringArray.length) {
                complexity++;
                System.out.print("|");
                System.out.print(newStringArray[secondaryIndex]);
                secondaryIndex++;
                localIndex++;
            }
            System.out.print("|");
            System.out.println("");
            for (int ii = 0; ii < K && ii < Math.max(lastRowCount,localIndex); ii++)
            {
                complexity++;
                System.out.print("+" + "-".repeat(maxNumberDigit + 2));
            }
            System.out.println("+");

        }
    }

}
