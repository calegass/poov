import java.util.Scanner;

public class String1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String palavra = s.nextLine();

		StringBuilder inversa = new StringBuilder(palavra);
		inversa.reverse();

		if (palavra.equalsIgnoreCase(inversa.toString())) {
			System.out.println("É palíndromo");
		}		
		else {
			System.out.println("Não é palíndromo");
		}
	}
}
