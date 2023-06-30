package QLCuaHang;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class GIOHANG {
    String magh,makh,masp;
    int sl;
    public static ArrayList<GIOHANG> cart = new ArrayList<GIOHANG>();
    public GIOHANG() {
        String filePath = "D:\\TDMU\\Nam2\\HK3\\PTTKDT\\Project\\code\\Project_PTTKOOP\\Cart.txt";
        try (FileReader fileReader = new FileReader(filePath); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String [] s = line.split("\\|");
                cart.add(new GIOHANG(s[0],s[1],s[2],Integer.parseInt(s[3])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public GIOHANG(String magh, String makh, String masp, int sl) {
        this.magh = magh;
        this.makh = makh;
        this.masp = masp;
        this.sl = sl;
    }

    public String getMagh() {
        return this.magh;
    }

    public void setMagh(String magh) {
        this.magh = magh;
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

    public int getSl() {
        return this.sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    @Override
    public String toString() {
        return " "+ getMagh() + " " + getMakh() + " "  + getMasp() + " " + getSl();
    }
    
}
