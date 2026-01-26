import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Porto {
    private Barca[] PORTO;
    File f;
    PrintWriter pw;

    public Porto() {
        PORTO = new Barca[100];
        f = new File("Data/porto.txt");
        try {
            pw = new PrintWriter(f);
        } catch (FileNotFoundException e) {
            System.out.println("Errore nella creazione del file");
        } catch (Exception e) {
            System.out.println("Errore");
        }
    }

    public boolean parkBarca(Barca b1) {
        if (b1.getTb() == TipoBarca.VELA) {
            for (int i = 50; i < PORTO.length; i++) {
                if (PORTO[i] == null) {
                    PORTO[i] = b1;
                    pw.println("Posizione barca: " + i + " " + b1.toString());
                    pw.close();
                    return true;
                }
            }
            return false;
        }
        int inizio = (b1.getLunghezza() < 10 ? 0 : 21);
        for (int i = inizio; i < PORTO.length; i++) {
            if (PORTO[i] == null) {
                PORTO[i] = b1;
                pw.println("Posizione barca: " + i + " " + b1.toString());
                pw.close();
                return true;
            }
        }
        return false;

    }

    public void findBarca(String nome) {
        for (int i = 0; i < PORTO.length; i++) {
            if ((PORTO[i].getNome()).equalsIgnoreCase(nome)) {
                System.out.println("La tua barca si trova nella posizione " + i);
                return;
            }
        }
        System.out.println("Non c'è");
        return;
    }

    public void checkPosizione(int posizione) {
        if (PORTO[posizione] != null) {
            System.out.println("La barca nella posizione numero " + posizione + " è: " + PORTO[posizione]);
        } else {
            System.out.println("La posizione è vuota");
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < PORTO.length; i++) {
            if (PORTO[i] != null) {
                s += "Posizione " + i + " " + PORTO[i] + "\n";
            }
        }
        return s;
    }

    public double affitto(int giorni, Barca b1) {
        double affitto = 0;
        if (b1.getTb() == TipoBarca.VELA) {
            affitto = b1.getLunghezza() * 10 * giorni;
            return affitto;
        } else if (b1.getTb() == TipoBarca.MOTORE) {
            affitto = b1.getStazza() * 20 * giorni;
            return affitto;
        }

        return 0;

    }

    public void removeBarca(String nome) {
        for (int i = 0; i < PORTO.length; i++) {
            if (PORTO[i] != null && (PORTO[i].getNome()).equalsIgnoreCase(nome)) {
                PORTO[i] = null;
                return;
            }
        }
    }

    public void removeBarca(Barca b1) {
        for (int i = 0; i < PORTO.length; i++) {
            if (PORTO[i] == b1) {
                PORTO[i] = null;
                return;
            }
        }
    }

    public void removeBarca(int posizione) {
        if (PORTO[posizione] != null) {
            PORTO[posizione] = null;
        }
    }

}
