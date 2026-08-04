import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Vui lòng nhập n > 0.");
        } else {
            long first = 0, second = 1;
            System.out.print(n + " số Fibonacci đầu tiên: ");
            
            for (int i = 0; i < n; i++) {
                System.out.print(first + " ");
                long next = first + second;
                first = second;
                second = next;
            }
            System.out.println();
        }
        scanner.close();
    }
}