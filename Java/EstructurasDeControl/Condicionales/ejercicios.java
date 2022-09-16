import java.util.Scanner;

public class ejercicios {
    public static void main(String[] args) {
        // Ejercicio 1: Realiza un programa que reciba dos números por
        // teclado e indique cuál es mayor o si son iguales.

        Double numero1, numero2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        numero1 = sc.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        numero2 = sc.nextDouble();

        sc.close();
        
        String resultado = 
            numero1 > numero2 ? "El numero 1 es mayor que el numero 2"
            : numero2 > numero1 ? "El numero 2 es mayor que el numero 1"
            : "Los numeros son iguales";

        System.out.println(resultado);
    }
}
