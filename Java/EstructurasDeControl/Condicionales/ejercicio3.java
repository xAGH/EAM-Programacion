

// Una distribuidora de huevos vende la unidad a 450 pesos, sin embargo, si un cliente 
// compra  al  menos  75000  pesos  en  huevos,  la  distribuidora  le  otorga  un  10%  de 
// descuento al costo total de su compra. Calcule el valor por pagar. 
public class ejercicio3 {
    public static void main(String[] args) {
        final Short PRECIO_HUEVO = 450;
        Short huevosComprados = 200;
        Double compra = (double) (huevosComprados * PRECIO_HUEVO);

        if (compra >= 75000){
            compra -= (compra * 0.10);
        }

        System.out.println("Tiene que pagar $" + compra);
    }
}
