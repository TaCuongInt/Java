
package Creational_Pattern.Singleton;

public class EagerInitializedSingleton {
    private String str;
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();
    
    private EagerInitializedSingleton(){ //Dam bao rang khong the tap mot doi tuong bang toan tu new
        this.str = "Thiet ke Eager Initialized Singleton thanh cong";
    }
    
    public static EagerInitializedSingleton getInstance(){
        return INSTANCE; //Tra ve doi tuong INSTANCE (Doi tuong chung cua lop - static)
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    } 
}
