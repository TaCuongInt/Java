
package Creational_Pattern.Singleton;

public class DoubleCheckLockingSingleton {
    private String str;
    private static volatile DoubleCheckLockingSingleton INSTANCE;
    
    private DoubleCheckLockingSingleton(){
        this.str = "Thiet ke Double Check Locking Singleton thanh cong";
    }

    public static DoubleCheckLockingSingleton getInstance(){
        if(INSTANCE == null){
            if(INSTANCE == null){
                INSTANCE = new DoubleCheckLockingSingleton();
            }
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