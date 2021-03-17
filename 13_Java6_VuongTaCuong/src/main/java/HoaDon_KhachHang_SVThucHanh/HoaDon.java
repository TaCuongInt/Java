package HoaDon_KhachHang_SVThucHanh;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HoaDon {
    private String soHD;
    private int soMatHang;
    private KhachHang kh = new KhachHang();
    private Hang dsHang[];
    private NgayThang ngayHD = new NgayThang(3,10,2021);    
    
    public void nhap(){  
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hoa don: ");
        this.soHD = sc.nextLine();
        
        System.out.print("Nhap so mat hang: ");
        this.soMatHang = sc.nextInt();
        sc.nextLine();
        
        kh.nhap();
        
        dsHang = new Hang[soMatHang];
        for(int i=0; i<soMatHang; i++){
            dsHang[i] = new Hang();
        }
        for(int i=0; i<soMatHang; i++){
            System.out.println("Nhap thon tin hang thu: " + (i+1));
            dsHang[i].nhap();
        }
    }
    
    public double tinhTongTien(){
        double tongTien=0;
        for(int i=0; i<soMatHang; i++){
            tongTien +=  dsHang[i].tinhTongTien();
        }
        return tongTien;
    }
    
    public void inHD()   { 
        DecimalFormat df = new DecimalFormat("###,###.0#");        
        System.out.println("So HD: " +soHD+ "\t\t Ngay lap: " +ngayHD.toString());
        System.out.println(kh.toString());
        System.out.println("\t\t\t\tDanh sach hang hoa");
        Hang.inTieuDe();
        for(int i=0; i<soMatHang; i++){
            dsHang[i].inDL();
        }
    } 
    
    public void sapXep(){
        Comparator<Hang> c1 = new Comparator<Hang>() {
            @Override
            public int compare(Hang o1, Hang o2) {
                return o1.gettenHang().compareTo(o2.gettenHang());
            }
        };
        Collections.min(Arrays.asList(this.dsHang),c1);
    }
    
    public Hang timMin(){
         Comparator<Hang> c1 = new Comparator<Hang>() {
             @Override
             public int compare(Hang o1, Hang o2) {
                 if(o1.tinhTongTien() > o2.tinhTongTien()){
                     return 1;
                 }
                 else{
                    if(o1.tinhTongTien() == o2.tinhTongTien()){
                        return 0;
                    }else{
                        return -1;
                    }
                 }
             }
        };  
        return Collections.min(Arrays.asList(this.dsHang),c1);
    }   
}