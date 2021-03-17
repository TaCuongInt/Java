
package Creational_Pattern.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionBreakSingleton {
    public static void main(String[] args)throws InstantiationException, IllegalAccessException, InvocationTargetException{
        
            EagerInitializedSingleton INSTANCE1 = EagerInitializedSingleton.getInstance();
            EagerInitializedSingleton INSTANCE2 = null;
            
            Constructor<?> [] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            
            for(Constructor<?> constructor : constructors){
                constructor.setAccessible(true);
                INSTANCE2 = (EagerInitializedSingleton) constructor.newInstance(args);
            }
            
            System.out.println(INSTANCE1.hashCode());
            System.out.println(INSTANCE2.hashCode());
        }
}