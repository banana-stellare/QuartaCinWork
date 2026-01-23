
enum TipoBarca {
    VELA,
    MOTORE
}

public class Barca {

    private String nome, nazionalita, modello;
    private int lunghezza, stazza;
    private TipoBarca tb;

    public Barca(String nome, String nazionalità, String modello, int lunghezza, int stazza, TipoBarca tb) {
        this.nome = nome;
        this.nazionalita = nazionalità;
        this.modello = modello;
        this.lunghezza = lunghezza;
        this.stazza = stazza;
        this.tb = tb;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    public int getStazza() {
        return stazza;
    }

    public void setStazza(int stazza) {
        this.stazza = stazza;
    }

    public TipoBarca getTb() {
        return tb;
    }

    public void setTb(TipoBarca tb) {
        this.tb = tb;
    }

    public String toString() {
        return "Barca [modello=" + modello + ", nazionalita=" + nazionalita + ", nome=" + nome + ", lunghezza="
                + lunghezza + ", stazza=" + stazza + ", tb=" + tb + "]";
    }

}