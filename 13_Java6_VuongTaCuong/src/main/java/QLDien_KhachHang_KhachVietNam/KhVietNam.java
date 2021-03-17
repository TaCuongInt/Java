package QLDien_KhachHang_KhachVietNam;

import java.util.Scanner;

public class KhVietNam extends KhachHang{
    private double soluong;
    private double dongia;
    private double dinhmuc;
    private double thanhtien;
    
    public void nhapThongTin(){
         super.nhapThongTin();
         Scanner sc = new Scanner(System.in);
         System.out.print("\tNhap so luong kw tieu thu: ");
         soluong = sc.nextDouble();
         sc.nextLine();
         
         System.out.print("\tNhap don gia: ");
         dongia = sc.nextDouble();
         sc.nextLine();
         
         System.out.print("\tNhap dinh muc tieu thu: ");
         dinhmuc = sc.nextDouble();
         sc.nextLine();
         
         thanhtien = tinhTien();
     }
    public double tinhTien(){
         double soKwvuotmuc = soluong-dinhmuc;
         if(soluong<=dinhmuc)
             return thanhtien = soluong*dongia;
         else
             return thanhtien = soluong*dongia*dinhmuc+soKwvuotmuc*dongia*2.5;
     }
    
    public void xuatThongTin(){
         super.xuatThongTin();
         System.out.printf("%10.0f %10.1f %10.2f %10.2f %n",soluong,dongia,dinhmuc,thanhtien);
     }
     
    public static void inTieuDe(){
        KhachHang.inTieudeCha();
        System.out.printf("%10s %10s %10s  %10s  %n","so luong","don gia","Dinh muc ","thanh tien");
    }
}