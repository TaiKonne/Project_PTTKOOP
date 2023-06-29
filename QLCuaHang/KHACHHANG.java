package QLCuaHang;
import java.util.Objects;

public class KHACHHANG extends NGUOIDUNG {
    String makh;

    public KHACHHANG() {
    }

    public KHACHHANG(String makh) {
        this.makh = makh;
    }

    public String getmakh() {
        return this.makh;
    }

    public void setmakh(String makh) {
        this.makh = makh;
    }

    public KHACHHANG makh(String makh) {
        setmakh(makh);
        return this;
    }
    @Override
    public String toString() {
        return "{" +
            " makh='" + getmakh() + "'" +
            "}";
    }
    
}
