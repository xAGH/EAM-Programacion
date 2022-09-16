public class refuerzo{
    public static void main(String[] args) {
        // Nosotros queremos que cuando el genero sea F (Femenino) el pronombre sea ella
        // Y que cuando el genero sea M (Masculino) el pronombre sea el
        // Y que cuando el genero sea X (Otro) el pronombre sea elle
        String generoPersonas = "U", pronombre;
        // if (generoPersonas == "F") pronombre = "Ella"; // Forma acortada de if-else cuando se ejecuta en su bloque solo una instruccion.
        // else pronombre = "El";

        pronombre = generoPersonas == "F" ? "Ella" : generoPersonas == "M" ? "El" : generoPersonas == "U" ? "Elle" : "No se que eres";

        if (generoPersonas == "F"){
            pronombre = "Ella";
        }
        else if (generoPersonas == "M"){
            pronombre = "El";
        }
        else if (generoPersonas == "U"){
            pronombre = "Elle";
        }
        else {
            pronombre =  "No se que eres";
        }

        System.out.println("Como el genero es " + generoPersonas + " el pronombre es " + pronombre);
    }
}