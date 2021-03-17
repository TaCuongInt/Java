package QLDien_KhachHang_KhachVietNam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KhVietNam Nam[];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so khach hang: "); 
        n=sc.nextInt();
        sc.nextLine();
        
        Nam = new KhVietNam[n];
       
        for(int i=0; i<n; i++){
            Nam[i] = new KhVietNam();

            System.out.println("Nhap khach hang thu: " +(i+1));
            Nam[i].nhapThongTin();        
         }
         
        System.out.println("Danh sach khach hang Viet Nam sau khi nhap");
        KhVietNam.inTieuDe();
        for(int i=0; i<n; i++){
            Nam[i].xuatThongTin();
        }

        KhVietNam Tam = new KhVietNam();
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if ((Nam[i].getHoten().compareToIgnoreCase(Nam[j].getHoten())>0)){
                    Tam = Nam[i];
                    Nam[i] = Nam[j];
                    Nam[j] = Tam;
                }
            }
         }
             
        System.out.println("Danh sach khach hang Viet Nam sau khi sap theo ten");
        KhVietNam.inTieuDe();
        for(int i=0; i<n; i++){
            Nam[i].xuatThongTin();
        }
    }
}
 