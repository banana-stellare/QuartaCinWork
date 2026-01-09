import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Player {
    String nome;
    int valore;

    public Player(String nome) {
        this.nome = nome;
        valore = 0;
        salva();
    }

    public String toString() {
        return nome;
    }

    private void salva() {
        try {
            File f = new File("data/" + nome + ".txt");
            PrintWriter print = new PrintWriter(f);
            print.print(nome + " " + valore);
            print.close();
        } catch (FileNotFoundException e) {
            System.out.println("Errore nella creazione del file");
        } catch (Exception e) {
            System.out.println("Errore");
        }

    }

    public void aggiorna() {
        try {
            PrintWriter print = new PrintWriter("data/" + nome + ".txt");
            print.print(nome + " " + valore);
            print.close();
        } catch (FileNotFoundException e) {
            System.out.println("Errore nella creazione del file");
        } catch (Exception e) {
            System.out.println("Errore");
        }
    }

    public void load(){
        try{
            File f = new File("data/" + nome + ".txt");
            Scanner leggi= new Scanner(f);
            while(leggi.hasNextLine()){
                String riga= leggi.nextLine();
                System.out.println(riga);
            }
        }catch(Exception e){
            
        }
        
    }

    public void setValore(int valore) {
        this.valore = valore;
    }
}