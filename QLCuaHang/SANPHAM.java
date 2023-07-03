package QLCuaHang;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class SANPHAM {
    String masp,malsp,tensp,nhasx;
    int namsx,slconlai;
    double giaban;

    public static ArrayList<SANPHAM> product = new ArrayList<SANPHAM>();
    public SANPHAM() {
        product.clear();
        String filePath = "D:\\TDMU\\Nam2\\HK3\\PTTKDT\\Project\\code\\Project_PTTKOOP\\Product.txt";
        try (FileReader fileReader = new FileReader(filePath); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String [] s = line.split("\\|");
                product.add(new SANPHAM(s[0],s[1],s[2],s[3],Integer.parseInt(s[4]),Integer.parseInt(s[4]), Double.parseDouble(s[5])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SANPHAM(String masp, String malsp, String tensp, String nhasx, int namsx, int slconlai,double GiaBan) {
        this.masp = masp;
        this.malsp = malsp;
        this.tensp = tensp;
        this.nhasx = nhasx;
        this.namsx = namsx;
        this.slconlai = slconlai;
        this.giaban = GiaBan;
    }

    public String getMasp() {
        return this.masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getMalsp() {
        return this.malsp;
    }

    public void setMalsp(String malsp) {
        this.malsp = malsp;
    }

    public String getTensp() {
        return this.tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getNhasx() {
        return this.nhasx;
    }

    public void setNhasx(String nhasx) {
        this.nhasx = nhasx;
    }

    public int getNamsx() {
        return this.namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public int getSlconlai() {
        return this.slconlai;
    }

    public void setSlconlai(int slconlai) {
        this.slconlai = slconlai;
    }

    public double getGiaban() {
        return this.giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    @Override
    public String toString() {
        return " "  + getMasp() + " " + getMalsp() + " " +
            getTensp() + " "  + getNhasx() + " " + 
            getNamsx() + " " + getSlconlai() + " " + getGiaban();
    }

}
