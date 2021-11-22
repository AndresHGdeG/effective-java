package chapter6.annotations.item39.annotation.repetable;


import java.lang.reflect.Method;

public class TestRepetableAnnotation {

    public static void main(String[] args) {
        Class<BadClassRepeatable> c = BadClassRepeatable.class;
        for(Method m: c.getDeclaredMethods()){
            if(m.isAnnotationPresent(ExceptionTest.class)
                    || m.isAnnotationPresent(ExceptionTestContainer.class)){
                try {
                    m.invoke(null);
                }
                catch (Throwable wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    ExceptionTest[] excTests = m.getAnnotationsByType(ExceptionTest.class);
                    for(ExceptionTest excTest: excTests){
                        if(excTest.value().isInstance(exc)){
                            System.out.println("Sucess in exception " + exc);
                            break;
                        }
                    }
                }

            }
        }
    }
}
