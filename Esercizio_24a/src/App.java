public class App {
    public static void main(String[] args) throws Exception {
        Porto livorno= new Porto();

        livorno.parkBarca(new Barca("Poerio", "Italia", "boh", 12, 30, TipoBarca.MOTORE));
        livorno.parkBarca(new Barca("e", "Italia", "boh ", 8, 20, TipoBarca.VELA));
        System.out.println(livorno.toString());
    }
}
