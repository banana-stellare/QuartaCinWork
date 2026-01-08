import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class Player{
    String nome;

    public Player(String nome){
        this.nome=nome;
        creaFile();
    }

    public String toString(){
        return nome;
    }

    public void creaFile(){
        try{
           File f=new File("data/"+nome+".txt");
            PrintWriter print= new PrintWriter(f);
            print.println(nome);
            print.close(); 
        }catch(FileNotFoundException e){
            System.out.println("Errore nella creazione del file");
        }catch(Exception e){
            System.out.println("Errore");
        }
        
    }
}