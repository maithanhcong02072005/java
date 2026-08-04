import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i; // Sử dụng 1.0 để đảm bảo phép chia trả về kiểu số thực
        }
        
        System.out.println("Tổng nghịch đảo là: " + sum);
        scanner.close();
    }
}