public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Perfect numbers less than 10,000:");
        for (int i = 2; i < 10000; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfect(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
}
