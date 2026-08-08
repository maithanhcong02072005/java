package com.example;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    // Kiểm tra điểm hợp lệ
    public static boolean kiemTraDiem(double diem) {
        return diem >= 0 && diem <= 10;
    }

    // Xếp loại
    public static String xepLoai(double diemTongKet) {
        if (diemTongKet >= 8.5) {
            return "A";
        } else if (diemTongKet >= 7.0) {
            return "B";
        } else if (diemTongKet >= 5.5) {
            return "C";
        } else if (diemTongKet >= 4.0) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Cho phép nhập số thực bằng dấu .
        sc.useLocale(Locale.US);

        // Nhập thông tin sinh viên
        System.out.print("Nhap ma sinh vien: "); 
        String maSV = sc.nextLine();

        System.out.print("Nhap ho ten sinh vien: ");
        String hoTen = sc.nextLine();

        double chuyenCan;
        double giuaKy;
        double cuoiKy;


        // Nhập điểm chuyên cần
        do {
            System.out.print("Nhap diem chuyen can: ");
            chuyenCan = sc.nextDouble();

            if (!kiemTraDiem(chuyenCan)) {
                System.out.println("Diem khong hop le! Nhap lai.");
            }

        } while (!kiemTraDiem(chuyenCan));


        // Nhập điểm giữa kỳ
        do {
            System.out.print("Nhap diem giua ky: ");
            giuaKy = sc.nextDouble();

            if (!kiemTraDiem(giuaKy)) {
                System.out.println("Diem khong hop le! Nhap lai.");
            }

        } while (!kiemTraDiem(giuaKy));


        // Nhập điểm cuối kỳ
        do {
            System.out.print("Nhap diem cuoi ky: ");
            cuoiKy = sc.nextDouble();

            if (!kiemTraDiem(cuoiKy)) {
                System.out.println("Diem khong hop le! Nhap lai.");
            }

        } while (!kiemTraDiem(cuoiKy));


        // Tính điểm tổng kết
        double diemTongKet = chuyenCan * 0.1 
                            + giuaKy * 0.3 
                            + cuoiKy * 0.6;


        // Hiển thị kết quả
        System.out.println("\n===== KET QUA =====");
        System.out.println("Ma sinh vien: " + maSV);
        System.out.println("Ho ten: " + hoTen);
        System.out.printf("Diem tong ket: %.2f\n", diemTongKet);
        System.out.println("Xep loai: " + xepLoai(diemTongKet));


        sc.close();
    }
}