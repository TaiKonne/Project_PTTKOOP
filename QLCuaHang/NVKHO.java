package QLCuaHang;

public class NVKHO extends NGUOIDUNG{
    String manv;
    
    public NVKHO() {
    }
    
    public NVKHO(String manv) {
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
