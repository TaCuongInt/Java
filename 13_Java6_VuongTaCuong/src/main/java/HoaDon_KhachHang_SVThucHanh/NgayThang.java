package HoaDon_KhachHang_SVThucHanh;

public class NgayThang {
    private int  thang;
    private int  ngay;
    private int  nam;

    public NgayThang(int thang, int ngay, int nam) {
        this.thang = thang;
        this.ngay = ngay;
        this.nam = nam;
    }
    
    @Override
    public String toString() {
        return  ngay+"/"+thang+"/"+nam;
    }
  }