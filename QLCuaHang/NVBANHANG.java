package QLCuaHang;
import java.util.Objects;

public class NVBANHANG extends NGUOIDUNG {
    String manv;

    public NVBANHANG() {
    }

    public NVBANHANG(String manv) {
        this.manv = manv;
    }

    public String getManv() {
        return this.manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }
    @Override
    public String toString() {
        return "{" +
            " manv='" + getManv() + "'" +
            "}";
    }
    
}
