package QLCuaHang;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class THANHTOAN {
    String maptt,madh, makh,manv,thoigiantt;
    int hinhthucthanhtoan,isvip,tinhtrang;
    double thd;
    public static ArrayList<THANHTOAN> bill = new ArrayList<THANHTOAN>();
    public THANHTOAN() {
        bill.clear();
        String filePath = "D:\\TDMU\\Nam2\\HK3\\PTTKDT\\Project\\code\\Project_PTTKOOP\\Bill.txt";
        try (FileReader fileReader = new FileReader(filePath); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String [] s = line.split("\\|");
                bill.add(new THANHTOAN(s[0],s[1],s[2],s[3],s[4],Integer.parseInt(s[5]),Integer.parseInt(s[6]),Integer.parseInt(s[7]),Double.parseDouble(s[8])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public THANHTOAN(String maptt, String madh, String makh, String manv, String thoigiantt, int hinhthucthanhtoan, int isvip, int tinhtrang, double thd) {
        this.maptt = maptt;
        this.madh = madh;
        this.makh = makh;
        this.manv = manv;
        this.thoigiantt = thoigiantt;
        this.hinhthucthanhtoan = hinhthucthanhtoan;
        this.isvip = isvip;
        this.tinhtrang = tinhtrang;
        this.thd = thd;
    }

    public String getMaptt() {
        return this.maptt;
    }

    public void setMaptt(String maptt) {
        this.maptt = maptt;
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

    public String getManv() {
        return this.manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getThoigiantt() {
        return this.thoigiantt;
    }

    public void setThoigiantt(String thoigiantt) {
        this.thoigiantt = thoigiantt;
    }

    public int getHinhthucthanhtoan() {
        return this.hinhthucthanhtoan;
    }

    public void setHinhthucthanhtoan(int hinhthucthanhtoan) {
        this.hinhthucthanhtoan = hinhthucthanhtoan;
    }

    public int getIsvip() {
        return this.isvip;
    }

    public void setIsvip(int isvip) {
        this.isvip = isvip;
    }

    public int getTinhtrang() {
        return this.tinhtrang;
    }

    public void setTinhtrang(int tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public double getThd() {
        return this.thd;
    }

    public void setThd(double thd) {
        this.thd = thd;
    }

    @Override
    public String toString() {
        return "{" +
            " maptt='" + getMaptt() + "'" +
            ", madh='" + getMadh() + "'" +
            ", makh='" + getMakh() + "'" +
            ", manv='" + getManv() + "'" +
            ", thoigiantt='" + getThoigiantt() + "'" +
            ", hinhthucthanhtoan='" + getHinhthucthanhtoan() + "'" +
            ", isvip='" + getIsvip() + "'" +
            ", tinhtrang='" + getTinhtrang() + "'" +
            "}";
    }
    
}
