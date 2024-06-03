public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "tres tristes tigres tragan trigo en un trigal";
        String palabra  = "trigo";

        int maxPalabra = palabra.length();
        int max = frase.length() - maxPalabra + 1;

        int cantidad = 0;
        char letra = 'g';
        buscar:
        for(int i =0; i < max;){
            int k = i;
            for (int j =0; j< maxPalabra; j++){
                if(frase.charAt(k++) != palabra.charAt(j)){
                    i++;
                    System.out.println("entra" + frase.charAt(k++));
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        System.out.println("Encontrado  = " + cantidad +" vez la palabra: " + palabra + "  en la frase");
    }



}
