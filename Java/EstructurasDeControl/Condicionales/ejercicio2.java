

// y = (8x+9)/x Dada la ecuación halle el resultado para cualquier valor de x ingresado (Si se 
// puede resolver)

public class ejercicio2 {
    public static void main(String[] args) {
        Integer x = 1;

        if (!(x == 0)){
            Integer resultado = (8 * x + 9) / x;
            System.out.println(resultado);
        }
        else{
            System.out.println("Esta ecuacion no se puede realizar porque x es 0;");
        }
    }
}
