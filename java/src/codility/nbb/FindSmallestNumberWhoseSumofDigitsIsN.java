package codility.nbb;

/*
*
* Given a positive integer N, the task is to find the smallest number whose sum of digits is N
* https://www.geeksforgeeks.org/find-the-smallest-number-whose-sum-of-digits-is-n/
* */

public class FindSmallestNumberWhoseSumofDigitsIsN {

    public static int getSum(int n)
    {
        int sum = 0;
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }

    // Function to find the smallest
// number whose sum of digits is also N
    public static int solution(int N)
    {
        int i = 1;
        while (1 != 0)
        {
            // Checking if number has
            // sum of digits = N
            if (getSum(i) == N)
            {
                System.out.println(i);
                break;
            }
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(18));
    }

    public static int solution2(int N) {
        double d = (N % 9 + 1) * Math.pow(10, (N / 9)) - 1;
        System.out.println(d);
        return (int) d;
    }
}
