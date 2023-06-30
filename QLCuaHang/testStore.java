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
            KHACHHANG a = new KHACHHANG(j.getIdUser());
            a.XemSanPham();
            while(true)
            {
                System.out.println("Chon " + '\n' + '\t' + "1. Tim kiem san pham" + '\n' + '\t' + "2. Vao gio hang"+ '\n' + '\t' + "0. Thoat");
                System.out.print("--> "); int k=sc.nextInt();
                if(k==1)
                {
                    a.TimKiemSanPham();
                }
                else if(k==2)
                {
                    a.XemGioHang();
                }
                else return;
            }
        }
    }
}
