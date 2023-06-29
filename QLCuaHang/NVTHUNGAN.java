package QLCuaHang;
import java.util.Objects;

public class NVTHUNGAN extends NGUOIDUNG {
    String manv;

    public NVTHUNGAN() {
    }

    public NVTHUNGAN(String manv) {
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
