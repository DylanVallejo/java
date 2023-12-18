public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle1:
        for(int i = 0; i < 5 ; i++){
            System.out.println();
            int j = 0;
            while( j < 5 ) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.println("[i = " + i + " j= " + j + "],");
                j++;
            }
        }
        System.out.println("************************************************************************************************************************************************************************");
        etiqueta:
        for(int i = 0; i < 5 ; i++){
            System.out.println();
            for(int j = 0; j < 5 ; j++) {
                if (i == 2) {
                    break etiqueta;
                }
                System.out.println("[i = " + i + " j= " + j + "],");
            }
        }



        bucle:
        for(int i = 0; i <= 7 ; i++){

            int j = 0;
            while( j <= 8 ) {
                if (i == 6 || i ==7) {
                    System.out.println("dia  = " + i + "descanso de fin de semana");
                    continue bucle;
                }
                System.out.println("Dia " + i + " trabajando a las  " + j + " horas");
                j++;
            }
        }
        System.out.println("************************************************************************************************************************************************************************");
    }
}
