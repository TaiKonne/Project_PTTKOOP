package QLCuaHang;

import QLCuaHang.TAIKHOAN;
import java.util.*;
public class NGUOIDUNG {
    private static int sl;
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
        // test
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
        TAIKHOAN xxx = new TAIKHOAN();
        int k=-1;
        for(int i=0;i<xxx.acc.size();i++){
            if(tk.compareTo(xxx.acc.get(i).getTaiKhoan())==0){
                k=i;
                break;
            }
        }
        if(k==-1){
            System.out.println("Tai khoan khong ton tai!");
            return -1;
        }else 
        {
            if(mk.compareTo(xxx.acc.get(k).getMatKhau())==0){
                System.out.println("Dang nhap thanh cong!");
                return xxx.acc.get(k).getMod();
            }else{
                System.out.println("Sai mat khau");
                return -1;
            }
        }
    }
    public String XuLyIdUser()
    {
        TAIKHOAN x = new TAIKHOAN();
        String s= x.acc.get(x.acc.size()-1).getIdUser();
        int newId=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) >='0' && s.charAt(i) <='9'){
                newId = newId*10 + (int)(s.charAt(i)-'0');
            }
        }
        String nw = "U";
        nw += Integer.toString(newId);
        return nw;
    }
    public int DangKy()
    {
        System.out.println("Nhap Tai Khoan Mat Khau:");
        System.out.print("Tai khoan: "); String tk = sc.nextLine();
        System.out.print("Mat khau: "); String mk = sc.nextLine();
        System.out.print("Nhap lai Mat khau: "); String nmk = sc.nextLine();
        TAIKHOAN xxx = new TAIKHOAN();
        int k=-1;
        for(int i=0;i<xxx.acc.size();i++){
            if(tk.compareTo(xxx.acc.get(i).getTaiKhoan())==0){
                k=i;
                break;
            }
        }
        //System.out.println(k); 
        for(int i=0;i<xxx.acc.size();i++) 
        {
            System.out.println(xxx.acc.get(i).getTaiKhoan());
        }
        if(k==-1){
            if(mk.compareTo(nmk)==0){
                System.out.println("Dang Ky Thanh Cong!");
                String Id = XuLyIdUser();
                xxx.acc.add(new TAIKHOAN(Id,tk,mk,1));
                return 1;
            }
            else {
                System.out.println("Mat khau khong khop!");
                return -1;
            }
        }else{
            System.out.println("Tai khoan da ton tai!");
            return -1;
        }
    }
}
