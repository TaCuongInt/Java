package HoaDon_KhachHang_SVThucHanh;

import java.util.Scanner;

public class Hang{
    private String tenHang;
    private float soLuong;
    private float donGia;

    public String gettenHang() {
        return tenHang;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhap ten hang: ");
        this.tenHang = sc.nextLine();
        
        System.out.print("\tNhap so luong: ");
        this.soLuong = sc.nextFloat();
        sc.nextLine();
        
        System.out.print("\tNhap don gia: ");
        this.donGia = sc.nextFloat();
        sc.nextLine();
    }
    
    public float tinhTongTien(){
        return soLuong*donGia;
    }
    
    static void inTieuDe(){
        System.out.printf("%15s %15s %15s %15s %n","Ten hang", "So luong", "Don gia", "Thanh tien");
    }
   
    public void inDL(){
        System.out.printf("%15s %15.1f %15.1f %15.1f %n",tenHang, soLuong, donGia, tinhTongTien());
    }    
}
