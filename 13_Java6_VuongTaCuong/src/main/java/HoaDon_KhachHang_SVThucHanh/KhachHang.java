package HoaDon_KhachHang_SVThucHanh;

import java.util.Scanner;

public class KhachHang {
    private  String maKH;
    private  String hoTen;
    private  String diaChi;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma khach hang: ");
        this.maKH = sc.nextLine();
        
        System.out.print("Nhap ho ten khach hang: ");
        this.hoTen = sc.nextLine();
        
        System.out.print("Nhap dia chi: ");
        this.diaChi = sc.nextLine();
    } 
    
    @Override
    public String toString() {
        return  "Ma KH: " +maKH+ "\t Ho ten: " +hoTen+ "\t Dia chi: " +diaChi;
    }    
}
