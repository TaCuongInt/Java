
package Creational_Pattern.Singleton;

public class ThreadSafeLazyInitializedSingleton {
    private String str;
    private static volatile ThreadSafeLazyInitializedSingleton INSTANCE;

    private ThreadSafeLazyInitializedSingleton() {
        this.str = "Thiet ke Thread SafeLazy Initialized Singleton thanh cong";
    }
    
    public static synchronized ThreadSafeLazyInitializedSingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ThreadSafeLazyInitializedSingleton();
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