package XeMayMoc_ThucHanh;

import HoaDon_KhachHang_SVThucHanh.Hang;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DemoXe {
    static ArrayList<Xe> dsXe = new ArrayList<Xe>();
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;
        do{
            System.out.println("\t\t==============Quan ly xe==============");
            System.out.print("\t\t\t1. Nhap danh sach xe\n");
            System.out.print("\t\t\t2. In danh sach xe\n");
            System.out.print("\t\t\t3. Xe co trong tai max\n");
            System.out.print("\t\t\t4. Xoa xe theo stt\n");
            System.out.print("\t\t\t7. Thoat\n");
            System.out.print("Ban chon: ");
            
            chon = sc.nextInt();
            switch(chon){
                case 1: 
                    nhapXe();  break;
                case 2:
                    Xe.inTieuDe();
                    inDSXe(); break;
                case 3:                
                    System.out.println("Thong tin xe co trong tai max");
                    Xe.inTieuDe();
                    timXeTrongTaiMax().inDL();
                    break;
                case 4:   
                    System.out.print("Nhap so vi tri xe can xoa: ");
                    int vt = sc.nextInt();
                    xoaXe(vt);  break;
                default:
                    System.out.println("Ban nhap ngoai pham vi");
                    break;
            }
       }while(chon!=7);    
    }
    public static void nhapXe(){   
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap so luong xe: ");
       n = sc.nextInt();
       
       for(int i=0; i<n; i++){
           System.out.println("Nhap thong tin xe thu: " +(i+1));
           Xe XeM = new Xe(); 
           XeM.nhap();
           dsXe.add(XeM);
       }
    }
     
    public static void inDSXe(){           
        for(Xe a : dsXe){
            a.inDL();
        }
    }
    
    public static boolean xoaXe(int stt){   
        return dsXe.remove(dsXe.get(stt-1));
    }
    
    public static Xe timXeTrongTaiMax(){  
        Comparator<Xe> c = new Comparator<Xe>() {
            @Override
            public int compare(Xe o1, Xe o2) {
                if(o1.getTrongTai() > o2.getTrongTai()){
                     return 1;
                }
                else{
                    return 0;
                }
            }
        };
        return Collections.max(dsXe,c);
    }  
}