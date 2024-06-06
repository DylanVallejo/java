import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola que tal!!";

        Class strClass = texto.getClass();

        System.out.println(" strClass.getName() = " + strClass.getName() );
        System.out.println(" strClass.getName() = " + strClass.getSimpleName() );
        System.out.println(" strClass.getName() = " + strClass.getPackageName() );
        System.out.println(" strClass.getName() = " + strClass);

        for (Method metodo: strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }
        
        Integer num = 34;
        Class intClass = num.getClass();
        Class objtClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass());
        System.out.println("intClass.getSuperclass().getSuperclass() = " + objtClass);

        for(Method metodo : objtClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }

//        profundizacion sobre la estructura interna de los objetos mediante el acceso a sus superclases y metodos
//        todas las clases hereddan de object Object => Number => Integer

    }
}
