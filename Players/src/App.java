public class App {
    public static void main(String[] args) throws Exception {
        Player p1= new Player("Mimmo");
        p1.setValore(5);
        p1.aggiorna();
        p1.load();

        Team t1= new Team("Frate");
        t1.add(p1);
        System.out.println(t1);
    }
}
