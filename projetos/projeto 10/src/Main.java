// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner s = new Scanner(System.in);

        //Produto produto = new Produto();
        //produto.mostrar();

        //System.out.print("dd/MM/yyyy: ");
        //produto.setDataCompra(LocalDate.parse(s.nextLine(), formatter));
        //produto.mostrar();

        long codigo;
        int situacao, quantMinima, quantAtual;
        String nome, descricao, marca;
        BigDecimal precoCompra;
        LocalDate dataCompra, dataValidade;

        Produto produto1 = new Produto();
        //produto1.mostrar();

        produto1 = produto1.obterProduto();

        produto1.mostrar();

//        TV tv = new TV();
//        tv.mostrar();
//
//        TV tv_quarto = new TV();
//
//        tv_quarto.ligar();
//        tv_quarto.setCanal(26);
//        tv_quarto.setResolucao("QuadHD");
//        tv_quarto.setSmart(true);
//        tv_quarto.mostrar();
//
//        TV tv_sala = new TV(
//                64,
//                12,
//                75,
//                true,
//                true,
//                "4K");
//
//        tv_sala.mostrar();
    }
}