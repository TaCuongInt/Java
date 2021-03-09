
package Creational_Pattern.Singleton;

public class StaticBlockSingleton {
    private String str;
    private static final StaticBlockSingleton INSTANCE;
    
    private StaticBlockSingleton(){ //Dam bao rang khong the tap mot doi tuong bang toan tu new
        this.str = "Thiet ke Static Block Singleton thanh cong";
    }
    
    static{
        try{
            INSTANCE = new StaticBlockSingleton();
        }catch (Exception e){
            throw new RuntimeException ("Exception occured in creating static block singleton instance");
        }
    }
    
    public static StaticBlockSingleton getInstance(){
        return INSTANCE; //Tra ve doi tuong INSTANCE (Doi tuong chung cua lop - static)
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}