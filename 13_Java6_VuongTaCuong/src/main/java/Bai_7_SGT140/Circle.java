
package Bai_7_SGT140;

public class Circle implements GeometricObject {
    private double radious;

    public Circle(double radious) {
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }
    
    @Override
    public double getPerimeter(){
        return 2*Math.PI*radious;
    }
    
    @Override
    public double getArea(){
        return Math.PI*radious*radious;
    }
 
}
