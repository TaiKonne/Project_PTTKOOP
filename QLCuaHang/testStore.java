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
                if (j.getMod() != -1) {
                    System.out.print("Chao mung tro lai! ");
                    if (j.getMod() == 1) System.out.println("Khach hang");
                    else if (j.getMod() == 2) System.out.println("NV ban hang");
                    else if (j.getMod() == 3) System.out.println("NV Thu ngan");
                    else if (j.getMod() == 4) System.out.println("NV kho");
                    else System.out.println("NV cham soc khach hang");
                    break;
                } else System.out.println("Dang nhap that bai");
            } else if (k == 2) {
                NGUOIDUNG a = new NGUOIDUNG();
                int z = a.DangKy();
                if (z == 1) {
                    TAIKHOAN m = a.DangNHap();
                    if (m.getMod() != -1) {
                        System.out.print("Chao mung tro lai! ");
                        if (m.getMod() == 1) System.out.println("Khach hang");
                        else if (m.getMod() == 2) System.out.println("NV ban hang");
                        else if (m.getMod() == 3) System.out.println("NV Thu ngan");
                        else if (m.getMod() == 4) System.out.println("NV kho");
                        else System.out.println("NV cham soc khach hang");
                        j=m;
                        break;
                    } else System.out.println("Dang nhap that bai");
                }
            } else return;
        }
        if(j.getMod()==1)
        {
            
            // while(true)
            // {
            //     System.out.println("Chon: " + '\n' + '\t' + "1. A" + '\n' + '\t' + "2. B" + '\n' + '\t' + "0. Thoat");
            // }
        }
    }
}
