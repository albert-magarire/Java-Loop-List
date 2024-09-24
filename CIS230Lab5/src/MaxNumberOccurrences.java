import java.util.Scanner;

public class MaxNumberOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int count = 0;

        System.out.println("Enter integers (terminate with 0):");

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            if (count == 0) {
                max = num;
                count = 1;
            } else {
                if (num > max) {
                    max = num;
                    count = 1;
                } else if (num == max) {
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            System.out.println("The largest number is " + max + " and its occurrence count is " + count);
        }

        scanner.close();
    }
}
