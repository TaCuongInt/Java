package XeMayMoc_ThucHanh;

import java.util.Scanner;

public class DoanhNghiep {
    private String tenDN;
    private String soDT;
    private String diaChi;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\tNhap ten DN: ");
        tenDN = sc.nextLine();
        
        System.out.print("\tNhap SDT: ");
        soDT = sc.nextLine();
        
        System.out.print("\tNhap dia chi: ");
        diaChi = sc.nextLine();
    }

    public String getTenDN() {
        return tenDN;
    }

    public String getSoDT() {
        return soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }
    
    @Override    
    public String toString() {
        return "Doanh nghiep {Ten DN: " +tenDN+ "; So DT: " +soDT+ "; Dia chi: " +diaChi+ "}";
    }    
}
