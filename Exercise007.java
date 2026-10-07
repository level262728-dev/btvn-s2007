package exercise007;

import java.util.Scanner;

public class Exercise007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập ba cạnh của tam giác từ bàn phím
        System.out.print("Nhập cạnh a: ");
        int a = scanner.nextInt();
        System.out.print("Nhập cạnh b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập cạnh c: ");
        int c = scanner.nextInt();

        // Kiểm tra điều kiện hợp lệ của tam giác
        if ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0)) {
            // Phân loại tam giác theo đúng thứ tự yêu cầu
            if (a == b && b == c) {
                System.out.println("Tam giác đều.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Tam giác cân.");
            } else if ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (a * a + c * c == b * b)) {
                System.out.println("Tam giác vuông.");
            } else {
                System.out.println("Tam giác thường.");
            }
        } else {
            System.out.println("Ba cạnh không tạo thành tam giác.");
        }

        scanner.close();
    }
}