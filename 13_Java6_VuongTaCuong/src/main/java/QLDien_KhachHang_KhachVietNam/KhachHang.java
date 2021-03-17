package QLDien_KhachHang_KhachVietNam;

import java.util.Scanner;

public class KhachHang {
    private String ma;
    private String hoTen;
    private String ngayRaHD;
    
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhap ma khach hang: ");
        ma = sc.nextLine();
        
        System.out.print("\tNhap ho ten: ");
        hoTen = sc.nextLine();
        
        System.out.print("\tNgay ra hoa don: ");
        ngayRaHD = sc.nextLine();       
    }     
    public String getHoten() {
        return hoTen;
    }  
    
    @Override
    public String toString() {
        return "KhachHang{" + "ma=" + ma + ", hoten=" + hoTen + ", ngayrahoadon=" + ngayRaHD + '}';
    }
    
    public void xuatThongTin(){
        System.out.printf("%10s %10s %15s",ma,hoTen,ngayRaHD);        
    }
    
    public static void inTieudeCha(){
         System.out.printf("%10s %10s %15s","Ma","Ho ten","ngay ra HD");
    }
}
