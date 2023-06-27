package QLCuaHang;

import java.util.*;

public class testStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon");
        System.out.println("1. Dang Nhap");
        System.out.print("-->"); int k = sc.nextInt();
        if(k==1)
        {
            NGUOIDUNG a = new NGUOIDUNG();
            int z=a.DangNHap();
            if(z!=-1)
            {
                System.out.println("Chao mung tro lai! ");
                if(z==1) System.out.println("khach hang");
                else if(z==2) System.out.println("NV ban hang");
                else if(z==2) System.out.println("NV Thu ngan");
                else if(z==2) System.out.println("NV kho");
                else System.out.println("NV cham soc khach hang");
            }
            else System.out.println("Dang nhap khong thanh cong");
        }
        else return;
    }
}
