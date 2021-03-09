
package Creational_Pattern.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        EagerInitializedSingleton a = EagerInitializedSingleton.getInstance();
        System.out.println(a.getStr());
        a.setStr("Vuong Ta Cuong");
        
        EagerInitializedSingleton b = EagerInitializedSingleton.getInstance();
        System.out.println(b.getStr());
        
        /* out = Vuong Ta Cuong -> Ly do vi 2 bien tham chieu a va b cung chieu 
        toi 1 doi tuong tao bang phuong thuc getInstance()
        */
        
        BillPughSingleton c = BillPughSingleton.getInstance();
        System.out.println(c.getStr());
        c.setStr("Ta Cuong");
        
        BillPughSingleton d = BillPughSingleton.getInstance();
        System.out.println(d.getStr());
    }
}