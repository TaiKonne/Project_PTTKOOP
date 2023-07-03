package QLCuaHang;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class DONDATHANG {
    String madh,makh,masp,ngaydat,ngaydukiengiao;
    int Soluong;
    double tonghoadon;
    public static ArrayList<DONDATHANG> order = new ArrayList<DONDATHANG>();
    public DONDATHANG() {
        order.clear();
        String filePath = "D:\\TDMU\\Nam2\\HK3\\PTTKDT\\Project\\code\\Project_PTTKOOP\\Order.txt";
        try (FileReader fileReader = new FileReader(filePath); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String [] s = line.split("\\|");
                order.add(new DONDATHANG(s[0],s[1],s[2],Integer.parseInt(s[3]),Double.parseDouble(s[4]),s[5],s[6]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public DONDATHANG(String madh, String makh, String masp,int Sl,double tonghoadon,String ngaydat, String ngaydukiengiao) {
        this.madh = madh;
        this.makh = makh;
        this.masp = masp;
        this.Soluong = Sl;
        this.tonghoadon = tonghoadon;
        this.ngaydat = ngaydat;
        this.ngaydukiengiao = ngaydukiengiao;
    }

    public String getMadh() {
        return this.madh;
    }

    public void setMadh(String madh) {
        this.madh = madh;
    }

    public String getMakh() {
        return this.makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getMasp() {
        return this.masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public int getSoluong() {
        return this.Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public String getNgaydat() {
        return this.ngaydat;
    }

    public void setNgaydat(String ngaydat) {
        this.ngaydat = ngaydat;
    }

    public String getNgaydukiengiao() {
        return this.ngaydukiengiao;
    }

    public void setNgaydukiengiao(String ngaydukiengiao) {
        this.ngaydukiengiao = ngaydukiengiao;
    }

    public double getTonghoadon() {
        return this.tonghoadon;
    }

    public void setTonghoadon(double tonghoadon) {
        this.tonghoadon = tonghoadon;
    }

    @Override
    public String toString() {
        return getMadh() + " " + getMakh() + " " + getMasp()+ " " + getSoluong() + " " + getTonghoadon() + " "+ getNgaydat() + " "+ getNgaydukiengiao();
    }
    
}
