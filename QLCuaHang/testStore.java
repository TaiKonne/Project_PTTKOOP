package QLCuaHang;

import java.util.*;

public class testStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j=0;
        while (true) {
            System.out.println("Chon " + '\n' + '\t' + "1. Dang Nhap" + '\n' + '\t' + "2. Dang Ky" + '\n' + '\t' + "0. Thoat");
            System.out.print("--> ");
            int k = sc.nextInt();
            if (k == 1) {
                NGUOIDUNG a = new NGUOIDUNG();
                j = a.DangNHap();
                if (j != -1) {
                    System.out.print("Chao mung tro lai! ");
                    if (j == 1) System.out.println("Khach hang");
                    else if (j== 2) System.out.println("NV ban hang");
                    else if (j == 3) System.out.println("NV Thu ngan");
                    else if (j == 4) System.out.println("NV kho");
                    else System.out.println("NV cham soc khach hang");
                    break;
                } else System.out.println("Dang nhap that bai");
            } else if (k == 2) {
                NGUOIDUNG a = new NGUOIDUNG();
                int z = a.DangKy();
                if (z == 1) {
                    int m = a.DangNHap();
                    if (m != -1) {
                        System.out.print("Chao mung tro lai! ");
                        if (m == 1) System.out.println("Khach hang");
                        else if (m == 2) System.out.println("NV ban hang");
                        else if (m == 3) System.out.println("NV Thu ngan");
                        else if (m == 4) System.out.println("NV kho");
                        else System.out.println("NV cham soc khach hang");
                        j=m;
                        break;
                    } else System.out.println("Dang nhap that bai");
                }
            } else return;
        }
        System.out.println(j);
        if(j==1)
        {
            System.out.println("Chon: " + '\n' + '\t' + "1. A" + '\n' + '\t' + "2. B" + '\n' + '\t' + "0. Thoat");
            // while(true)
            // {
            //     System.out.println("Chon: " + '\n' + '\t' + "1. A" + '\n' + '\t' + "2. B" + '\n' + '\t' + "0. Thoat");
            // }
        }
    }
}
