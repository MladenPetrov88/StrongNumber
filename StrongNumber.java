import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int copyNumber = number;
        int factorialNumber = 0;
        int factorialSum = 0;

        while (copyNumber != 0) {
            factorialNumber = copyNumber % 10;
            copyNumber = copyNumber / 10;

            int factorial = 1;

            for (int i = 1 ; i <= factorialNumber ; i++) {
                factorial *= i;
            }

            factorialSum += factorial;
        }

        if (number == factorialSum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
