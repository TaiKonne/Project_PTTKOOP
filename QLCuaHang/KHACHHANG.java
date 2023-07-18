package QLCuaHang;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Objects;
import NGANHANG.BANKING;

public class KHACHHANG extends NGUOIDUNG {
    String makh;
    BANKING accountBanking;
    public KHACHHANG() {
    }

    public KHACHHANG(String makh) {
        this.makh = makh;
    }

    public KHACHHANG(String makh, BANKING aBanking)
    {
        this.makh = makh;
        this.accountBanking = aBanking;
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

    public BANKING getAccountBanking() {
        return this.accountBanking;
    }

    public void setAccountBanking(BANKING accountBanking) {
        this.accountBanking = accountBanking;
    }

    public void XemThongTinCaNHan()
    {
        NGUOIDUNG nd = new NGUOIDUNG();
        int pos=-1;
        for(int i=0;i<nd.users.size();i++)
        {
            if(this.getmakh().toLowerCase().compareTo(nd.users.get(i).getIdUser().toLowerCase())==0)
            {
                pos=i;
                System.out.println(nd.users.get(i));
                break;
            }
        }
        System.out.println(this.getAccountBanking());
        while(true)
        {
            System.out.println('\t'+"Chuc nang:" + '\n'+'\t'+'\t'+"1. Chinh sua thong tin" + '\n'+'\t'+'\t'+"0. Thoat");
            System.out.print('\t'+""+'\t'+"--> "); int lc = sc.nextInt();
            if(lc == 1)
            {
                String newname=nd.users.get(pos).getHoTen(), newaddr=nd.users.get(pos).getDiaChi(),newphone=nd.users.get(pos).getSoDienThoai();
                int  newsex=nd.users.get(pos).getGioiTinh();
                while(true)
                {
                    System.out.println('\t'+""+'\t'+ "Chuc nang:" + '\n'+'\t'+'\t'+'\t'+"1. Ho ten" + '\n'+'\t'+'\t'+'\t'+"2. Gioi tinh"+ '\n'+'\t'+'\t'+'\t'+"3. So dien thoai" + '\n'+'\t'+'\t'+'\t'+"4. Dia chi" + '\n'+'\t'+'\t'+'\t'+"0. Thoat");
                    System.out.print('\t'+""+'\t'+""+'\t'+"--> ");
                    int lc1 = sc.nextInt(); 
                    if(lc1==1)
                    {
                        sc.nextLine();
                        System.out.print('\t'+ "Ho Ten: "); newname  = sc.nextLine();
                    }
                    else if(lc1==2)
                    {
                        System.out.print('\t'+"Gioi tinh: "); newsex = sc.nextInt();
                    }
                    else if(lc1==3)
                    {
                        sc.nextLine();
                        System.out.print('\t'+"So dien thoai: "); newphone  = sc.nextLine();
                    }
                    else if(lc1==4)
                    {
                        sc.nextLine();
                        System.out.print('\t'+"Dia chi: "); newaddr  = sc.nextLine();
                    }
                    else
                    {
                        nd.users.add(new NGUOIDUNG(nd.users.get(pos).getIdUser(),newname , newphone , newsex , newaddr));
                        nd.users.remove(pos);

                        String filePath = "D:\\TDMU\\Nam2\\HK3\\PTTKDT\\Project\\code\\Project_PTTKOOP\\User.txt";
                        String tmp =""+ nd.users.get(0).getIdUser() +"|"+nd.users.get(0).getHoTen() + "|"+ nd.users.get(0).getSoDienThoai()+ "|"+ Integer.toString(nd.users.get(0).getGioiTinh()) + "|" + nd.users.get(0).getDiaChi();
                        // try {
                        //     PrintWriter writer = new PrintWriter(filePath);
                            
                        //     writer.close();
                        // } catch (FileNotFoundException e) {
                        //     e.printStackTrace();
                        // }
                        try (FileWriter myWriter = new FileWriter(filePath)) {
                            myWriter.write(tmp);
                            myWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        for(int i=1; i <nd.users.size();i++)
                        {
                            tmp =""+ nd.users.get(i).getIdUser() +"|"+nd.users.get(i).getHoTen() + "|"+ nd.users.get(i).getSoDienThoai()+ "|"+ Integer.toString(nd.users.get(i).getGioiTinh()) + "|" + nd.users.get(i).getDiaChi();
                            try (FileWriter myWriter = new FileWriter(filePath, true)) {
                                myWriter.write('\n'+tmp);
                                myWriter.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        break;
                    }
                }
            }
            else 
            {
                return;
            }
        }
    }
    public void XemSanPham()
    {
        SANPHAM x = new SANPHAM();
        System.out.println(" Ma SP" + '\t' + "Ma LSP"+ '\t' + "Ten SP" + '\t' + "Nha SX"+ '\t' + "Nam SX"+ '\t' + "So luong" + '\t' + "Gia ban");
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
        System.out.print('\t'+"Nhap ten san pham: "); String tensp = sc.nextLine();
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
            System.out.println("***Khong tim thay san pham!***");
            //return null;
        }
        else 
        {
            System.out.println("***Tim kiem thanh cong!***");
            while(true)
            {
                System.out.println('\t'+"Chuc nang:" + '\n'+'\t'+'\t'+"1. Xem chi tiet" +'\n'+'\t'+'\t'+"2. Them vao gio hang"+'\n'+'\t'+'\t'+"0. Thoat");
                System.out.print('\t'+""+'\t'+"--> "); int lc = sc.nextInt();
                if(lc==1)
                    System.out.println(x.product.get(k));
                else if(lc==2)
                {
                    System.out.print('\t'+""+'\t'+""+'\t'+"So luong: "); int slg = sc.nextInt();
                    System.out.println("***Da them thanh cong!***");
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
        System.out.println(" "+"MaGH" + '\t' + "MaKH" + '\t' + "MaSP" + '\t' + "So luong");
        for(int i=0;i<x.cart.size();i++)
        {
            if(this.getmakh().compareTo(x.cart.get(i).getMakh())==0)
            {
                System.out.println(x.cart.get(i));
            }
        }
        String tmp="";
        double tdh=0;
        while(true)
        {
            System.out.println('\t'+ "Chuc nang"+'\n'+'\t'+'\t'+"1. Chon san pham"+'\n'+'\t'+'\t'+"2. Dat hang"+'\n'+'\t'+'\t'+"0. Thoat");
            System.out.print('\t'+""+'\t'+"--> "); int lc = sc.nextInt();
            if(lc==1)
            {   System.out.println('\t'+"***** CHON SAN PHAM TU GIO HANG *****");
                System.out.print('\t'+""+'\t'+""+'\t'+"Nhap ma san pham: "); String masp = sc.next();
                SANPHAM k = new SANPHAM();
                for(int i=0;i<k.product.size();i++) 
                {
                    if(masp.toLowerCase().compareTo(k.product.get(i).getMasp().toLowerCase())==0)
                    {
                        System.out.println("***Chon thanh cong!***");
                        tdh = k.product.get(i).getGiaban();
                        break;
                    }
                }
                for(int i=0;i<x.cart.size();i++)
                {
                    if(this.getmakh().toLowerCase().compareTo(x.cart.get(i).getMakh().toLowerCase())==0)
                    {
                        if(masp.toLowerCase().compareTo(x.cart.get(i).getMasp().toLowerCase())==0)
                        {
                            tmp=tmp + x.cart.get(i).getMasp();
                            tmp=tmp+"|"+x.cart.get(i).getSl();
                            tdh*=x.cart.get(i).getSl();
                            break;
                        }
                    }
                }
            }
            else if(lc==2)
            {
                System.out.println('\t'+"***** DAT HANG *****");
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
                String t = id+"|"+this.getmakh()+"|"+ tmp+"|"+Double.toString(tdh)+"|"+hh.toString()+"|"+kk.toString();
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
        nw="DH"+nw;
        return nw;
    }
    public String XuLyMaHD()
    {
        THANHTOAN x = new THANHTOAN();
        String s= x.bill.get(x.bill.size()-1).getMaptt();
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
        nw="HD"+nw;
        return nw;
    }
    public void ThanhToan()
    {
        DONDATHANG x = new DONDATHANG();
        System.out.println(" " +   "MaDH" + '\t' + "MaKH" + '\t' + "MaSP" + '\t' + "SL" + '\t' + "Gia tien" + '\t' + "Ngay dat" + '\t'+"Ngay giao du kien");
        for(int i=0;i<x.order.size();i++)
        {
            if(this.getmakh().toLowerCase().compareTo(x.order.get(i).getMakh().toLowerCase())==0)
            {
                System.out.println(x.order.get(i));
            }
        }
        String madh1="";
        double t=0;
        while(true)
        {
            System.out.println('\t'+"Chuc nang"+'\n'+'\t'+"1. Chon san pham"+'\n'+'\t'+'\t'+"2. Thanh toan"+'\n'+'\t'+'\t'+"0. Thoat");
            System.out.print('\t'+""+'\t'+"--> "); int lc = sc.nextInt();
            if(lc==1)
            {
                System.out.println("***** CHON SAN PHAM DE THANH TOAN *****");
                System.out.print('\t'+""+'\t'+""+'\t'+"Nhap ma hoa don:"); String madh = sc.next();
                for(int i=0;i<x.order.size();i++)
                {
                    if(this.getmakh().toLowerCase().compareTo(x.order.get(i).getMakh().toLowerCase())==0)
                    {
                        if(madh.toLowerCase().compareTo(x.order.get(i).getMadh().toLowerCase())==0)
                        {
                            System.out.println("***Chon thanh cong!***");
                            madh1=x.order.get(i).getMadh();
                            t=x.order.get(i).getTonghoadon();
                            break;
                        }
                    }
                }
            }
            else if(lc==2)
            {
                System.out.println("***** THANH TOAN *****");
                System.out.println('\t'+"Hinh thuc Thanh Toan: " + '\n' +'\t' +'\t'+"0. COD"+ '\n'+ '\t' +'\t' + "1. BANKING");
                System.out.print('\t'+""+'\t'+"--> "); int ship = sc.nextInt();
                System.out.println('\t'+ "Su dung VIP: " + '\n' + '\t'+ '\t'+"0. Khong"+ '\n'+ '\t'+ '\t' + "1. Co");
                System.out.print('\t'+""+'\t'+"--> "); int isvip = sc.nextInt();
                if(isvip == 1)
                {
                    double z=t;
                    z=z*10/100;
                    t = t-z;
                }
                if(ship==0)
                {
                    System.out.println('\t'+""+'\t'+ "Xac Nhan Thanh Toan? " + '\n'+ '\t' + '\t'+ '\t' + "1. Thanh Toan"+ '\n'+ '\t' + '\t'+ '\t' + "2. Huy"); 
                    System.out.print('\t'+""+'\t'+""+'\t'+ "--> "); int lc1 = sc.nextInt();
                    if(lc1==1)
                    {
                        System.out.println("***Thanh toan thanh cong!***");
                        String zzz = XuLyMaHD();
                        LocalDate hh = LocalDate.now();
                        String tmp = zzz +"|"+madh1+"|"+this.getmakh()+"|"+" "+"|"+hh.toString()+"|"+Integer.toString(ship)+"|"+Integer.toString(isvip)+"|" +Integer.toString(0)+"|"+Double.toString(t);
                        System.out.println(tmp);
                        String filePath = "D:\\TDMU\\Nam2\\HK3\\PTTKDT\\Project\\code\\Project_PTTKOOP\\Bill.txt";
                        try (FileWriter myWriter = new FileWriter(filePath, true)) {
                            myWriter.write('\n' + tmp);
                            myWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    else 
                    {
                        System.out.println("***Huy thanh toan thanh cong!***");
                        return;
                    }
                }
                else 
                {
                    if(this.getAccountBanking().getSodu() < t)
                    {
                        System.out.println("***So du khong du de thanh toan!***");
                    }
                    else 
                    {
                        System.out.println('\t'+""+'\t'+ "Xac Nhan Thanh Toan? " + '\n'+ '\t' + '\t'+ '\t'+ "1. Thanh Toan"+ '\n'+ '\t' + '\t'+ '\t' + "2. Huy"); 
                        System.out.print('\t'+""+'\t'+""+'\t'+ "--> "); int lc1 = sc.nextInt();
                        if(lc1==1)
                        {
                            System.out.println("***Thanh toan thanh cong!***");
                            double k = this.getAccountBanking().getSodu();
                            this.getAccountBanking().setSodu(k-t);
                            String zzz = XuLyMaHD();
                            LocalDate hh = LocalDate.now();
                            String tmp = zzz +"|"+madh1+"|"+this.getmakh()+"|"+" "+"|"+hh.toString()+"|"+Integer.toString(ship)+"|"+Integer.toString(isvip)+"|" +Integer.toString(1)+"|"+Double.toString(t);
                            String filePath = "D:\\TDMU\\Nam2\\HK3\\PTTKDT\\Project\\code\\Project_PTTKOOP\\Bill.txt";
                            try (FileWriter myWriter = new FileWriter(filePath, true)) {
                                myWriter.write('\n' + tmp);
                                myWriter.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        else 
                        {
                            System.out.println("***Huy thanh toan thanh cong!***");
                            return;
                        }
                    }
                }
            }
            else return;
        }
    }
}
