
package Creational_Pattern.Singleton;

public class LazyInitializedSingleton {
    private String str;
    private static LazyInitializedSingleton INSTANCE;

    private LazyInitializedSingleton() {
        this.str = "Thiet ke Lazy Initialized Singleton thanh cong";
    }
    
    public static LazyInitializedSingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new LazyInitializedSingleton();
        }
        return INSTANCE;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}