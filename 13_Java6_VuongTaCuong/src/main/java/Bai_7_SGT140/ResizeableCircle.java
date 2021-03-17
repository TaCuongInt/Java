
package Bai_7_SGT140;

public class ResizeableCircle extends Circle implements Resizeable, GeometricObject {
    private double percent;
    private double radious;
    
    public ResizeableCircle(double radious, double percent) {
        super(radious);
        this.radious = radious*percent;
        this.percent = percent;
    }
       
    @Override
    public double resize() {
        return this.radious*percent;   
    }
    
    @Override
    public double getPerimeter(){
        return 2*Math.PI*this.radious;
    }
    
    @Override
    public double getArea(){
        return 2*Math.PI*this.radious;
    }
    
    public void inDL(){
        System.out.printf("%10.2f %10.2f %10.2f %10.2f %10.2f %10.2f %n" , super.getRadious(), percent, super.getPerimeter(), super.getArea(), this.getPerimeter(), this.getArea());
    }
    
    public static void inTieuDe(){
        System.out.printf("%10s %10s %10s %10s %10s %10s %n" ,"Radious", "Percent", "Chu vi 1", "Dien tich 1", "Chu vi 2", "Dien tich 2");
    }
}
