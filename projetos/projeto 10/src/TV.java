import java.security.InvalidParameterException;

public class TV {
    private int tamanho, canal, volume;
    private boolean ligada, smart;
    private String resolucao;
    public TV() {
        this(32, 9, 0,false, false, "FullHD");
    }
    public TV(int tamanho, int canal, int volume, boolean ligada, boolean smart, String resolucao) {
        setTamanho(tamanho);
        setCanal(canal);
        setVolume(volume);
        setLigada(ligada);
        setSmart(smart);
        setResolucao(resolucao);
    }
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        if(tamanho > 0) {
            this.tamanho = tamanho;
        }
        else {
            this.tamanho = 32;
            throw new InvalidParameterException("tamanho inválido");
        }
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        if(canal > 0) {
            this.canal = canal;
        } else {
            this.canal = 9;
            throw new InvalidParameterException("canal inválido");
        }
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        if ((volume >= 0) && (volume <= 100)) {
            this.volume = volume;
        }
        else {
            this.volume = 0;
            throw new InvalidParameterException("volume inválido");
        }
    }
    public boolean isLigada() {
        return ligada;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    public void ligar() {
        setLigada(true);
    }
    public boolean isSmart() {
        return smart;
    }
    public void setSmart(boolean smart) {
        this.smart = smart;
    }
    public String getResolucao() {
        return resolucao;
    }
    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }
    public void mostrar() {
        System.out.println(
                "TV {" +
                " tamanho = " + tamanho +
                ", canal = " + canal +
                ", volume = " + volume +
                ", está " + (ligada? "ligada": "desligada") +
                (smart? ", é smart": ", não é smart") +
                ", resolucao = '" + resolucao + '\'' +
                " }");
    }
}