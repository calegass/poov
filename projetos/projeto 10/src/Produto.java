import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Produto {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    Scanner s = new Scanner(System.in);
    private long codigo;
    private int situacao, quantMinima, quantAtual;
    private String nome, descricao, marca;
    private BigDecimal precoCompra;
    private LocalDate dataCompra, dataValidade;
    public long getCodigo() {
        return codigo;
    }
    public void setCodigo(long codigo) {
        if (codigo >= 0) this.codigo = codigo;
        else throw new IllegalArgumentException("codigo invalido");
    }
    public int getSituacao() {
        return situacao;
    }
    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }
    public int getQuantMinima() {
        return quantMinima;
    }
    public void setQuantMinima(int quantMinima) {
        if (quantMinima >= 0) this.quantMinima = quantMinima;
        else throw new IllegalArgumentException("quantidade minima invalida");
    }
    public int getQuantAtual() {
        return quantAtual;
    }
    public void setQuantAtual(int quantAtual) {
        if (quantAtual >= 0) this.quantAtual = quantAtual;
        else throw new IllegalArgumentException("quantidade atual invalida");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public BigDecimal getPrecoCompra() {
        return precoCompra;
    }
    public void setPrecoCompra(BigDecimal precoCompra) {
        if (precoCompra.compareTo(BigDecimal.ZERO) > 0) this.precoCompra = precoCompra;
        else throw new IllegalArgumentException("valor da compra invalido");
    }
    public LocalDate getDataCompra() {
        return dataCompra;
    }
    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }
    public LocalDate getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
    public Produto() {
        this(0,
                0,
                1,
                1,
                null,
                null,
                null,
                BigDecimal.ONE,
                null,
                null);
    }
    public Produto(long codigo, int situacao, int quantMinima, int quantAtual,
                   String nome, String descricao, String marca, BigDecimal precoCompra,
                   LocalDate dataCompra, LocalDate dataValidade) {
        setCodigo(codigo);
        this.situacao = situacao;
        setQuantMinima(quantMinima);
        setQuantAtual(quantAtual);
        this.nome = nome;
        this.descricao = descricao;
        this.marca = marca;
        setPrecoCompra(precoCompra);
        this.dataCompra = dataCompra;
        this.dataValidade = dataValidade;
    }
    public boolean isEmFalta() {
        return quantAtual < quantMinima;
    }
    public boolean isVencido() {
        return dataCompra.isAfter(dataValidade);
    }
    public Produto obterProduto() {
        long codigo = -1;
        int situacao = 0, quantMinima = -1, quantAtual = -1;
        String nome, descricao, marca;
        BigDecimal precoCompra = BigDecimal.ZERO;
        LocalDate dataCompra, dataValidade;

        while (codigo < 0) {
            System.out.print("codigo: ");
            codigo = Long.parseLong(s.nextLine());
        }

        System.out.print("situacao: ");
        situacao = Integer.parseInt(s.nextLine());

        while (quantMinima < 0) {
            System.out.print("quantMinima: ");
            quantMinima = Integer.parseInt(s.nextLine());
        }

        while (quantAtual < 0) {
            System.out.print("quantAtual: ");
            quantAtual = Integer.parseInt(s.nextLine());
        }

        System.out.print("nome: ");
        nome = s.nextLine();

        System.out.print("descricao: ");
        descricao = s.nextLine();

        System.out.print("marca: ");
        marca = s.nextLine();

        while (precoCompra.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.print("precoCompra: ");
            precoCompra = BigDecimal.valueOf(Integer.parseInt(s.nextLine()));
        }

        System.out.print("dataCompra (dd/MM/yyyy): ");
        dataCompra = LocalDate.parse(s.nextLine(), formatter);

        System.out.print("dataValidade (dd/MM/yyyy): ");
        dataValidade = LocalDate.parse(s.nextLine(), formatter);

        return new Produto(codigo, situacao, quantMinima, quantAtual, nome, descricao,
                marca, precoCompra, dataCompra, dataValidade);
    }
    public void mostrar() {
        System.out.println( "Produto {" +
                "\ncodigo = " + codigo +
                "\nsituacao = " + situacao +
                "\nquantMinima = " + quantMinima +
                "\nquantAtual = " + quantAtual +
                "\nnome = '" + nome + '\'' +
                "\ndescricao = '" + descricao + '\'' +
                "\nmarca = '" + marca + '\'' +
                "\nprecoCompra = " + precoCompra +
                "\ndataCompra = " + dataCompra.format(formatter) +
                "\ndataValidade = " + dataValidade.format(formatter) +
                "\n}");
    }
}
