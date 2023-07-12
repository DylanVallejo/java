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

        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length() - 1));


        System.out.println("nombre.substring(2) = " + nombre.substring(2));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));


//        metodos importantes parte 2
        String trabaLenguas = "trabalenguas";
        System.out.println("trabaLenguas.replace(\"a\",\".\") = " + trabaLenguas.replace("a", "."));
        System.out.println("trabaLenguas = " + trabaLenguas);
        System.out.println("trabaLenguas.indexOf(\"a\") = " + trabaLenguas.indexOf("a"));
        System.out.println("trabaLenguas.lastIndexOf(\"a\") = " + trabaLenguas.lastIndexOf("a"));
        System.out.println("trabaLenguas.indexOf(\"z\") = " + trabaLenguas.indexOf("z"));
        System.out.println("trabaLenguas.contains(\"t\") = " + trabaLenguas.contains("lenguas"));
        System.out.println("trabaLenguas.startsWith(\"t\") = " + trabaLenguas.startsWith("t"));
        System.out.println("trabaLenguas.endsWith(\"lenguas\") = " + trabaLenguas.endsWith("lenguas"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());


    }
}
