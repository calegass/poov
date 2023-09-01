import java.util.Scanner;
import java.math.BigInteger;

public class Fatorial {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        //long numero, fatorial = 1L;
        BigInteger numero, fatorial = BigInteger.ONE;
        System.out.println("Digite o número: ");
        numero = new BigInteger(s.nextLine());

        for (BigInteger i = BigInteger.TWO; i.compareTo(numero) <= 0; i = i.add(BigInteger.ONE)) {
            fatorial = fatorial.multiply(i);
        }

        System.out.println("Fatorial de " + numero + " é: " + fatorial);
    }
}
