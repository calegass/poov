// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);

        Lampada l1 = new Lampada(),
                l2 = new Lampada(220,60),
                l3 = new Lampada(220,60, true);

        l1.mostrar();
        l2.mostrar();
        l3.mostrar();

        l1.setTensao(110); // l1.tensao = 110;
        l1.setPotencia(60); // l1.potencia = 5;
        l1.setAcesa(true); // l1.acesa = true;

        l1.quebrar();
        l1.queimar();
        l1.acender();

        l1.mostrar();

        // total de potencias
        System.out.println(l1.getPotencia() + l2.getPotencia() + l3.getPotencia());
    }
}