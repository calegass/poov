import java.security.InvalidParameterException;

public class Lampada {
    private int tensao, potencia;
    private boolean acesa, quebrada, queimada;
    public void setTensao(int tensao) {
        if((tensao == 110) || (tensao == 220)) {
            this.tensao = tensao;
        } else {
            this.tensao = 220;
            throw new InvalidParameterException("Valor inválido de tensão");
        }
    }
    public int getTensao() {
        return tensao;
    }
    public void setPotencia(int potencia) {
        if ((potencia == 60) || (potencia == 100) || (potencia == 150)) {
            this.potencia = potencia;
        } else {
            this.potencia = 60;
            throw new InvalidParameterException("Valor inválido de potência");
        }
    }
    public int getPotencia() {
        return potencia;
    }
    public void setAcesa(boolean acesa) {
        if (!queimada && !quebrada) {
            this.acesa = acesa;
        } else {
            if(quebrada && acesa) {
                queimada = true;
            }
            this.acesa = false;
        }
    }
    public boolean isAcesa() {
        return acesa;
    }
    public void setQuebrada(boolean quebrada) {
        if(quebrada && acesa) {
            queimada = true;
            acesa = false;
        }
        this.quebrada = quebrada;
    }
    public boolean isQuebrada() {
        return quebrada;
    }
    public void setQueimada(boolean queimada) {
        if(queimada && acesa) {
            acesa = false;
        }
        this.queimada = queimada;
    }
    public boolean isQueimada() {
        return queimada;
    }
    public void acender() {
        setAcesa(true);
    }
    public void apagar() {
        setAcesa(false);
    }
    public void quebrar() {
        setQuebrada(true);
    }
    public void queimar() {
        setQueimada(true);
    }
    public Lampada() {
        this(220, 110);
        // construtor padrão
        System.out.println("construtor padrão executado!");
    }
    public Lampada(int tensao, int potencia) {
        this(tensao, potencia, false);
        // construtor inicialização
        System.out.println("construtor incialização (dois atributos) executado!");
    }
    public Lampada(int tensao, int potencia, boolean acesa) {
        // construtor inicialização
        System.out.println("construtor inicialização (três atributos) executado!");
        setTensao(tensao);
        setPotencia(potencia);
        this.acesa = acesa;
    }
    public void mostrar() {
        String texto = tensao + "V, "
                + potencia + "W, "
                + ((acesa) ? "acesa" : "apagada")
                + ((queimada) ? ", queimada" : "")
                + ((quebrada) ? ", quebrada" : "");
        System.out.println(texto);
    }
}
