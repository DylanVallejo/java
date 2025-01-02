package bases;

public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 500; i++){
//            c = c.concat(a).concat(b).concat("\n"); // 500 =>2ms
//            c += a + b + "\n"; 500 => 19 , 10000 => 68 => 100000 => 1976ms
            sb.append(a).append(b).append("\n"); // 500 => 0  , 100000 =>8ms usar sb

        }

//        podemos usar el garbage collector si usamos mcuhas instancias
//        es opcional ya que es automatico

        long fin = System.currentTimeMillis();
        System.out.println(fin- inicio);
        System.out.println("c = " + c);
        System.out.println(" sb = " +sb.toString());
        System.exit(0);
    }

}
