package chapter6.annotations.item39.annotation.array;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestArrayAnotation {

    public static void main(String[] args) {
        Class<BadClass> c = BadClass.class;
        for(Method m: c.getDeclaredMethods()){
            if(m.isAnnotationPresent(ExceptionTest.class)){
                try {
                    m.invoke(null);
                }
                catch (Throwable wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    Class<? extends Throwable>[] excTypes = m.getAnnotation(ExceptionTest.class).value();
                    for(Class<? extends Throwable> excType: excTypes){
                        if(excType.isInstance(exc)){
                            System.out.println("Sucess in exception " + exc);
                            break;
                        }
                    }
                }

            }
        }
    }

    public void exceptionArray(){

    }
}
