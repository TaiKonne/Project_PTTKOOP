package QLCuaHang;

import QLCuaHang.TAIKHOAN;
import java.util.*;
public class NGUOIDUNG {
    Scanner sc = new Scanner(System.in);
    protected String IdUser;
    protected String HoTen;
    protected String SoDienThoai;
    protected int GioiTinh;
    protected String DiaChi;

    ArrayList<NGUOIDUNG> users = new ArrayList<NGUOIDUNG>();
    public NGUOIDUNG() {
        users.add(new NGUOIDUNG("U0001", "Nguyen Quoc Dung", "0901291640", 1, "Binh Duong"));
        users.add(new NGUOIDUNG("U0002", "Nguyen Tan Tai", "0855708546", 1, "Binh Duong"));
        users.add(new NGUOIDUNG("U0003", "Nguyen Minh Thang", "0901222343", 1, "Binh Duong"));
        users.add(new NGUOIDUNG("U0004", "Nguyen Van Minh", "0900987654", 1, "Binh Duong"));
        users.add(new NGUOIDUNG("U0005", "Le Tuan Kiet", "0999999999", 1, "Binh Duong"));
    }

    public NGUOIDUNG(String IdUser, String HoTen, String SoDienThoai, int GioiTinh, String DiaChi) {
        this.IdUser = IdUser;
        this.HoTen = HoTen;
        this.SoDienThoai = SoDienThoai;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
    }
    
    public String getIdUser() {
        return this.IdUser;
    }

    public void setIdUser(String IdUser) {
        this.IdUser = IdUser;
    }

    public String getHoTen() {
        return this.HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getSoDienThoai() {
        return this.SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public int getGioiTinh() {
        return this.GioiTinh;
    }

    public void setGioiTinh(int GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return this.DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int DangNHap()  
    {
        System.out.println("Nhap Tai Khoan Mat Khau:");
        System.out.print("Tai khoan: "); String tk = sc.nextLine();
        System.out.print("Mat khau: "); String mk = sc.nextLine();
        TAIKHOAN tmp = new TAIKHOAN(tk,mk);
        TAIKHOAN xxx = new TAIKHOAN();
        for (TAIKHOAN x : xxx.acc) {
            if(tmp.equals(x)==true)
            {
                return x.getMod();
            }
        }
        return -1;
    }
    
}
