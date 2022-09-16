import java.util.Scanner;

public class entradaTeclado{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Por favor introduzca una cadena por teclado: ");
        char cadenaIngresada = scanner.nextLine().charAt(0);
        System.out.println("La cadena ingresada es "  + cadenaIngresada);
        scanner.close();
    }
}