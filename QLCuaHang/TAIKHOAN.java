package QLCuaHang;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TAIKHOAN {
    public String IdUser;
    public String TaiKhoan;
    public String MatKhau;
    public int mod;
    public static ArrayList<TAIKHOAN> acc = new ArrayList<TAIKHOAN>();
    public TAIKHOAN(){
        acc.clear();
        String filePath = "D:\\TDMU\\Nam2\\HK3\\PTTKDT\\Project\\code\\Project_PTTKOOP\\UserAcc.txt";
        try (
            FileReader fileReader = new FileReader(filePath); 
            BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String [] s = line.split("\\|");
                if(s != null) {
                    acc.add(new TAIKHOAN(s[0],s[1],s[2],Integer.parseInt(s[3])));
                //System.out.println(s[0]+ " " + s[1] + " " + s[2] + " "+s[3]);
                }
            }
            //System.out.println(123);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public TAIKHOAN(String Id, String Tk, String Mk, int mod) {
        this.IdUser = Id;
        this.TaiKhoan = Tk;
        this.MatKhau = Mk;
        this.mod = mod;
    }
    public TAIKHOAN(String Id, String Tk, String Mk) {
        this.IdUser = Id;
        this.TaiKhoan = Tk;
        this.MatKhau = Mk;
    }
    public TAIKHOAN(String Tk, String Mk) {
        this.TaiKhoan = Tk;
        this.MatKhau = Mk;
    }
    public TAIKHOAN(String Id, int mod) {
        this.IdUser = Id;
        this.mod = mod;
    }

    public String getIdUser() {
        return this.IdUser;
    }
    public void setIdUser(String IdUser) {
        this.IdUser = IdUser;
    }
    public String getTaiKhoan() {
        return this.TaiKhoan;
    }
    public void setTaiKhoan(String TAIKHOAN) {
        this.TaiKhoan = TAIKHOAN;
    }
    public String getMatKhau() {
        return this.MatKhau;
    }
    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    public int getMod(){
        return this.mod;
    }
    public void setMod(int mod){
        this.mod = mod;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TAIKHOAN)) {
            return false;
        }
        TAIKHOAN tAIKHOAN = (TAIKHOAN) o;
        // Objects.equals(IdUser, tAIKHOAN.IdUser) &&
        return  Objects.equals(TaiKhoan, tAIKHOAN.TaiKhoan) && Objects.equals(MatKhau, tAIKHOAN.MatKhau);
    }
}
