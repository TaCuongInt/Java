
package Bai_7_SGT140;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<ResizeableCircle> circle = new ArrayList<ResizeableCircle>();
        
        Random r = new Random();
        
        for(int i=0; i<5; i++){
            ResizeableCircle c = new ResizeableCircle(r.nextDouble(), r.nextDouble());
            circle.add(c);
        }
        ResizeableCircle.inTieuDe();
        for(ResizeableCircle c:circle){
            c.inDL();
        }
    }
}
