import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        double c = scanner.nextDouble();

        // Điều kiện để 3 số là 3 cạnh của 1 tam giác: Tổng 2 cạnh luôn lớn hơn cạnh còn lại
        if (a + b > c && a + c > b && b + c > a) {
            System.out.print("Đây là 3 cạnh của một tam giác ");
            
            if (a == b && b == c) {
                System.out.println("đều.");
            } else if (a == b || a == c || b == c) {
                // Kiểm tra tam giác vuông cân
                if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                    System.out.println("vuông cân.");
                } else {
                    System.out.println("cân.");
                }
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("vuông.");
            } else {
                System.out.println("thường.");
            }
        } else {
            System.out.println("Ba số này không thể tạo thành một tam giác.");
        }
        scanner.close();
    }
}