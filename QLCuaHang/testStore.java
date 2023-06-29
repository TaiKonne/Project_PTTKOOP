package QLCuaHang;

import java.util.*;

public class testStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TAIKHOAN j;
        while (true) {
            System.out.println("Chon " + '\n' + '\t' + "1. Dang Nhap" + '\n' + '\t' + "2. Dang Ky" + '\n' + '\t' + "0. Thoat");
            System.out.print("--> ");
            int k = sc.nextInt();
            if (k == 1) {
                NGUOIDUNG a = new NGUOIDUNG();
                j = a.DangNHap();
                if (j!=null) break;
                else System.out.println("Dang nhap that bai");
            } else if (k == 2) {
                NGUOIDUNG a = new NGUOIDUNG();
                int z = a.DangKy();
                if (z == 1) {
                    TAIKHOAN m = a.DangNHap();
                    if (m!=null) {
                        j=m;
                        break;
                    } else System.out.println("Dang nhap that bai");
                } else System.out.println("Dang ky that bai!");
            } else return;
        }
        if(j.getMod()==1)
        {
            SANPHAM x = new SANPHAM();
            for(int i=0;i<x.product.size();i++)
            {
                System.out.println(x.product.get(i));
            }
        }
    }
}
