package Bai5;

import java.util.Scanner;

public class student {

    Scanner sc = new Scanner(System.in);
    String masinhvien;
    String fullname;
    String lop;

    public void nhapthongtin() {
        System.out.print("ma sinh vien: ");
        masinhvien = sc.nextLine();
        System.out.print("fullname: ");
        fullname = sc.nextLine();
        System.out.print("lop: ");
        lop = sc.nextLine();
    }

    public void hienthi() {
        System.out.print("masinhvien : " + masinhvien);
        System.out.print("fullname : " + fullname);
        System.out.print("lop : " + lop);
    }
}
