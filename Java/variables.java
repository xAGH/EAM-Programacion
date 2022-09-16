import java.util.ArrayList;

public class variables {
    public static void main(String[] args) {

        // Operadores de asignacion
        String igual = "=";
        String resta = "-=";
        String suma = "+=";
        String multiplicacion = "*=";
        String division = "/=";

        // Tipos de variables numericas
        Byte numeroByrte = 1; // -128 to 127
        Short numeroShort = 2000; // -32768 to 32767
        Integer numeroInt = 2000000000; // -2147483648 to 2147483647
        Long numeroLong = 9000000000000000000L; // -9223372036854775808 to 9223372036854775807

        // Tipos de variables de texto
        Character letraB = 97; // Solo permite una letra encerrada en comillas simples o su respectivo codigo ASCII
        String cadenaTextp = "Hola mundo";

        // Variables booleanas
        Boolean booleana = true;

        // Listas estaticas
        String[] listaCadenaForma1 = {"Hola", "Mundo", "Desde", "Java"};
        String[] listaCadenaForma2 = new String[]{"Hola", "Mundo", "Desde", "Java"};
        String[] listaCadenaForma3 = new String[10];
        listaCadenaForma3[1] = "Mundo";

        // Listas Dinamicas
        ArrayList listaGeneral = new ArrayList<>();
        listaGeneral.add("Hola");
        listaGeneral.add(2);

        
        // CONSTANTES
        final Double PI = 3.1416; // Declaracion y definicion de contantes, estas no se pueden modificar;
    }
}
