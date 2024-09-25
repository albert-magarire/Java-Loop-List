import java.util.Scanner;

public class MaxNumberOccurrences {
    public static void main(String[] args) {
        //Create new scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        //initialize all variables to 0
        int max = 0;
        int count = 0;

        System.out.println("Enter integers (terminate with 0):");

        while (true) { //start of main program
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
        } //end of the main program

        if (count == 0) { //default data validations
            System.out.println("No numbers are entered except 0");
        } else {
            System.out.println("The largest number is " + max + " and its occurrence count is " + count);
        }

        scanner.close(); //important to close the object after use
    }
}
