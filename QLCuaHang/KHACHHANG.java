package QLCuaHang;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
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
        while(nw.length() < s.length()-2)
        {
            nw="0"+nw;
        }
        nw="GH"+nw;
        return nw;
    }

    public void TimKiemSanPham()
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
            //return null;
        }
        else 
        {
            System.out.println("Tim kiem thanh cong!");
            // System.out.println(x.product.get(k));
            //return x.product.get(k);
            System.out.println("Chuc nang:" + '\n'+'\t'+"1. Xem chi tiet" +'\n'+'\t'+"2. Them vao gio hang"+'\n'+'\t'+"0. Thoat");
            while(true)
            {
                System.out.print("--> "); int lc = sc.nextInt();
                if(lc==1)
                    System.out.println(x.product.get(k));
                else if(lc==2)
                {
                    System.out.print("So luong: "); int slg = sc.nextInt();
                    System.out.println("Da them thanh cong");
                    String magh1 = XulyMaGH();
                    String tmp = magh1+"|"+this.getmakh()+"|"+x.product.get(k).getMasp()+"|"+Integer.toString(slg);
                    String filePath = "D:\\TDMU\\Nam2\\HK3\\PTTKDT\\Project\\code\\Project_PTTKOOP\\Cart.txt";
                    try (FileWriter myWriter = new FileWriter(filePath, true)) {
                        myWriter.write('\n' + tmp);
                        myWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else return;
            }
        }
    }

    public void XemGioHang()
    {
        GIOHANG x = new GIOHANG();
        for(int i=0;i<x.cart.size();i++)
        {
            //System.out.println(123);
            //System.out.println(x.cart.get(i));
            if(this.getmakh().compareTo(x.cart.get(i).getMakh())==0)
            {
                System.out.println(x.cart.get(i));
            }
        }
        String tmp="";
        while(true)
        {
            System.out.println("Chuc nang"+'\n'+'\t'+"1. Chon san pham"+'\n'+'\t'+"2. Dat hang"+'\n'+'\t'+"0. Thoat");
            System.out.print("--> "); int lc = sc.nextInt();
            if(lc==1)
            {   System.out.println('\t'+"CHON SAN PHAM TU GIO HANG");
                System.out.print("Nhap ma san pham: "); String masp = sc.next();
                for(int i=0;i<x.cart.size();i++)
                {
                    if(this.getmakh().toLowerCase().compareTo(x.cart.get(i).getMakh().toLowerCase())==0)
                    {
                        //System.out.println("aaaaa");
                        if(masp.toLowerCase().compareTo(x.cart.get(i).getMasp().toLowerCase())==0)
                        {
                            // System.out.println(x.cart.get(i).getMasp());
                            tmp=tmp + x.cart.get(i).getMasp();
                            tmp=tmp+"|"+x.cart.get(i).getSl();
                            // System.out.println(tmp);
                            break;
                        }
                    }
                }
            }
            else if(lc==2)
            {
                System.out.println('\t'+"DAT HANG ");
                String id = XuLyMaDH();
                LocalDate hh = LocalDate.now();
                LocalDate kk = hh;
                SANPHAM pro = new SANPHAM();
                for(int i=0;i<pro.product.size();i++)
                {
                    if(tmp.toLowerCase().compareTo(pro.product.get(i).getMasp().toLowerCase())==0)
                    {
                        if(pro.product.get(i).getMalsp().compareTo("LSP001")==0)
                            kk = hh.plusDays(0);
                        else 
                            kk = hh.plusDays(3);
                        break;
                    }
                }
                String t = id+"|"+this.getmakh()+"|"+ tmp +"|"+hh.toString()+"|"+kk.toString();
                String filePath = "D:\\TDMU\\Nam2\\HK3\\PTTKDT\\Project\\code\\Project_PTTKOOP\\Order.txt";
                try (FileWriter myWriter = new FileWriter(filePath, true)) {
                    myWriter.write('\n'+t);
                    myWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else return;
        }
    }

    public String XuLyMaDH()
    {
        DONDATHANG x = new DONDATHANG();
        String s= x.order.get(x.order.size()-1).getMadh();
        int newId=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >='0' && s.charAt(i) <='9'){
                newId = newId*10 + (int)(s.charAt(i)-'0');
            }
        }
        newId+=1;
        String nw = "";
        nw += Integer.toString(newId);
        while(nw.length() < s.length()-2)
        {
            nw="0"+nw;
        }
        nw="GH"+nw;
        return nw;
    }

}
