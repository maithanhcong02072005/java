import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        
        int sum = 0;
       
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        
        System.out.println("Tổng các số chẵn từ 2 đến " + n + " là: " + sum);
        scanner.close();
    }
}