package NGANHANG;
import java.util.Objects;

public class BANKING {
    String maso;
    double sodu;

    public BANKING() {
    }

    public BANKING(String maso, double sodu) {
        this.maso = maso;
        this.sodu = sodu;
    }

    public String getMaso() {
        return this.maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public double getSodu() {
        return this.sodu;
    }

    public void setSodu(double sodu) {
        this.sodu = sodu;
    }

    @Override
    public String toString() {
        return "[" + getMaso() + " | " + getSodu() + "]";
    }

}
