
package Creational_Pattern.Singleton;

public class BillPughSingleton {
    private String str;
    
    private BillPughSingleton(){
        this.str = "Thiet ke Bill Pugh Singleton thanh cong";
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
    
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    
    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}