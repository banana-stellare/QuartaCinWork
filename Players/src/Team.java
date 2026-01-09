import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Team {
    private String name;
    ArrayList<Player> players;

    public Team(String name){
        this.name=name;
        players= new ArrayList<>();
    }

    public void add(Player p){
        players.add(p);
    }

    public void salvaTeam(){
        try{
            ObjectOutputStream o= new ObjectOutputStream(new FileOutputStream("Data/"+name+".txt"));
            o.writeObject(players);
        }catch(Exception e){
            System.out.println("Rilevato errore");
        }
        
    }

    public void caricaTeam(){
        try{
            FileInputStream fi1 = new FileInputStream("data/"+name+".txt");
        }catch(Exception e){
            
        }
    }

    public String toString(){
        return "Team:"+" "+ name+" "+ players;
    }
}
