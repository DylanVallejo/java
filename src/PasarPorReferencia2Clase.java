class Persona {
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

public class PasarPorReferencia2Clase {
    public static void main(String[] args) {
        //       no todos los tipos pasan el valor algunos pasan por referencia como  CLASES y ARREGLOS

        Persona persona = new Persona();
        persona.modificarNombre("Dylan");

        System.out.println("iniciamos el método main");
        System.out.println("persona.getNombre() = " + persona.getNombre());
        System.out.println("antes de llamar al metodo test");
        test(persona);
        System.out.println(" despues de llamar la metodo test");
        System.out.println("persona.getNombre() = " + persona.getNombre());
        System.out.println("Finaliza el método main con los datos de la persona modificados ");
    }

    public static void test( Persona persona ){
        System.out.println("iniciamos el método test" );
        persona.modificarNombre("Joel");
        System.out.println("Finaliza el método test");
    }
}
