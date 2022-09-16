

// Un  sistema  quiere  ingresar  la  información  de  jóvenes  para  definir  si  debe  o  no 
// presentarse al servicio militar obligatorio. Al sistema se ingresan los datos principales 
// del joven y nos indica si se debe presentar únicamente si es hombre, tiene al menos 18 
// años y no se encuentra estudiando.
public class ejercicio4 {
    public static void main(String[] args) {
        Boolean esHombre = true;
        Boolean tiene18 = true;
        Boolean estaEstudiando = false;

        if (esHombre && tiene18 && estaEstudiando){
            System.out.println("Tiene que presentar servicio");
        }
        else{
            System.out.println("No tiene que presentar servicio");
        }
        
    }
}
