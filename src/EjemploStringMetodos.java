public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Dylan";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Dylan\") = " + nombre.equals("Dylan"));
        System.out.println("nombre.equals(\"dylan\") = " + nombre.equals("dylan"));
        System.out.println("nombre.equalsIgnoreCase(\"dylan\") = " + nombre.equalsIgnoreCase("dylan"));
        System.out.println("nombre.compareTo(\"Dylan\") = " + nombre.compareTo("Dylan"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.substring(2) = " + nombre.substring(2));
    }
}
