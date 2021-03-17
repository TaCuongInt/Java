
package Creational_Pattern.Abstract_Factory;

public class WoodChair implements Chair {
    @Override
    public void create () {
        System.out.println("Create wood chair");
    }

}
