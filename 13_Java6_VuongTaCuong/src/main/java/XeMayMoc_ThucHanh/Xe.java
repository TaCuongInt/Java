package XeMayMoc_ThucHanh;

import java.util.Scanner;

public class Xe implements MayMoc{
    private String tenXe;
    private String tenKH;
    private String NL;
    private DoanhNghiep dn = new DoanhNghiep();
    private float trongTai;
    private float tienDatCoc;
    private int namSX;

    public float getTrongTai() {
        return trongTai;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\tNhap ten xe: ");
        tenXe = sc.nextLine();
        
        System.out.print("\tNhap ten khach hang: ");
        tenKH = sc.nextLine();
        
        System.out.print("\tNhap nhien lieu: ");
        NL = sc.nextLine();
        
        dn.nhap();
        
        System.out.print("\tNhap trong tai: ");
        trongTai = sc.nextFloat();
        
        System.out.print("\tNhap tien dat coc: ");
        tienDatCoc = sc.nextFloat();
        
        System.out.print("\tNhap nam sx: ");
        namSX = sc.nextInt();
    }
    
    public static void inTieuDe(){
        System.out.printf("%15s %15s %15s %15s %15s %15s %15s %15s %15s %n","Ten xe", "Ten KH", "Nhien lieu", "Doanh nghiep", "SDT", "Dia chi", "Tai trong", "Tien DC", "Nam SX");
    }
    
    public void inDL(){
        System.out.printf("%15s %15s %15s %15s %15s %15s %15.2f %15.2f %15d %n", tenXe, tenKH, NL, dn.getTenDN(), dn.getSoDT(), dn.getDiaChi(), trongTai, tienDatCoc, namSX);
    }    
    
    @Override
    public void setNhienLieu(String NL){
        this.NL = NL;
    }
    
    @Override
    public void setNamsx(int namSX){
        this.namSX = namSX;
    }
}
