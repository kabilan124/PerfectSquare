import java.util.Scanner;

public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if (num < 0)
            return false;

        if (num == 0 || num == 1)
            return true;

        long start = 1;
        long end = num;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;

            if (square == num)
                return true;
            else if (square < num)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
       int  num = sc.nextInt();

        boolean isPerfect = isPerfectSquare(num);
        System.out.println(num + " is a perfect square: " + isPerfect);
    }
}