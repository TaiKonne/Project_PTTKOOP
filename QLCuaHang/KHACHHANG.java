package QLCuaHang;
import java.io.FileWriter;
import java.io.IOException;
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

    public void XemSanPham()
    {
        SANPHAM x = new SANPHAM();
        for(int i=0;i<x.product.size();i++)
        {
            System.out.println(x.product.get(i));
        }
    }
    public SANPHAM TimKiem_Chon_SanPham()
    {
        SANPHAM x = new SANPHAM();
        System.out.print("Nhap ten san pham: "); String tensp = sc.nextLine();
        int k=-1;
        for(int i=0;i<x.product.size();i++)
        {
            if(tensp.toLowerCase().compareTo(x.product.get(i).getTensp().toLowerCase())==0)
            {
                k=i;
                break;
            }
        }
        if(k==-1) 
        {
            System.out.println("Khong tim thay san pham!");
            return null;
        }
        else 
        {
            System.out.println("Tim kiem thanh cong!");
            return x.product.get(k);
        }
    }

    public String XulyMaGH()
    {
        GIOHANG x = new GIOHANG();
        String s= x.cart.get(x.cart.size()-1).getMagh();
        int newId=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >='0' && s.charAt(i) <='9'){
                newId = newId*10 + (int)(s.charAt(i)-'0');
            }
        }
        newId+=1;
        String nw = "";
        nw += Integer.toString(newId);
        while(nw.length() < s.length()-1)
        {
            nw="0"+nw;
        }
        nw="U"+nw;
        return nw;
    }

    public void ThemSPvaoGioHang()
    {
        String magh1 = XulyMaGH();
        SANPHAM sp = TimKiem_Chon_SanPham();
        String tmp = magh1+"|"+this.getmakh()+"|"+sp.getMasp()+"|"+Integer.toString(sp.slconlai);
        String filePath = "D:\\TDMU\\Nam2\\HK3\\PTTKDT\\Project\\code\\Project_PTTKOOP\\Cart.txt";
        try (FileWriter myWriter = new FileWriter(filePath, true)) {
            myWriter.write('\n' + tmp);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
