

public class condiciones {

    public static void main(String[] args) {
        
        String operadoresLogicos = "< > == != <= >="; // Devuelve un valor booleano
        String conectoresLogicos = "&& || !"; // Devuelve un valor booleano

        Boolean esMayor = 12 > 0; // Devuelve true
        Boolean esIgual = 23 == 12; // Devuelve false
        Boolean esDiferente = 23 != 12; // Devuelve true

        Boolean y = esMayor && esIgual; // Devuelve false
        Boolean o = esMayor || esIgual; // Devuelve true
        Boolean not = !esIgual; // Devuelve true
        Boolean all = esMayor && esDiferente && esIgual || esDiferente; 

        // Climas:
        // 1: Lluvia
        // 2: Sol
        // 3: Despejado
        Byte clima = 1;

        if (clima == 1) { // Si
            //System.out.println("Lleva sombrilla");
        }
        
        else if(clima == 2){ // Sino si
            //System.out.println("Lleva bloqueador");
        }

        else{ // Sino
            System.out.println("No lleves nada");
        }

        switch (clima){
            case 1:
                //System.out.println("Lleva sombrilla");
                break;
            case 2:
                //System.out.println("Lleva bloqueador");
                break;
            case 3:
                //System.out.println("No lleves nada");
                break;
        }

        // Condicionales con cadenas.
        String cadena = "Hola mundo";
        String cadena2 = "hOlA Mundo";

        if (cadena.equalsIgnoreCase(cadena2)){
            //System.out.println("las cadenas son iguales");
        }
        else{
            //System.out.println("las cadenas no son iguales");
        }

        String clima2 = "Bochorno";

        switch (clima2){
            case "Calor":
                System.out.println("Esta haciendo calor");
                break;
            case "Frio":
                System.out.println("Esta haciendo frio");
                break;
            default:
                System.out.println("No esta haciendo ni frio ni calor");

        }

    }
    
}
