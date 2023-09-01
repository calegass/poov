import java.math.BigDecimal;

public class Conta {
    public static void main (String[] args) {
        
	BigDecimal numero1 = new BigDecimal("1.03"), numero2 = new BigDecimal("0.42"), resultado = BigDecimal.ZERO;

	resultado = numero1.subtract(numero2);

        System.out.println("Resultado: " + resultado);
	System.out.println("Resultado: " + new BigDecimal("1.03").subtract(new BigDecimal("0.42")));
    }
}