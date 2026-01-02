public class App {
	public static void main(String[] args) {

        Lista l = new Lista();
	    System.out.println("Aggiunta di: Mimmo");l.add( "Mimmo" );
	    System.out.println("Aggiunta di: Mario");l.addHead(new Nodo("Mario"));
	    System.out.println("Aggiunta di: Luigi");l.addTail(new Nodo("Luigi"));
        
		System.out.println("Lunghezza lista: " + l.getLength());

		System.out.println("'Mario' esiste? " + l.esiste("Mario"));
		System.out.println("'Luigi' esiste? " + l.esiste("Luigi"));
		System.out.println("'Mimmo' esiste? " + l.esiste("Mimmo"));
		System.out.println("'Matteo' esiste? " + l.esiste("Matteo"));

		System.out.println(l);
		System.out.println("Rimozione 'Mario': " + l.remove("Mario"));
		System.out.println("'Mario' esiste? " + l.esiste("Mario"));
		System.out.println(l);

		System.out.println("Aggiunta di: Matteo");l.addHead(new Nodo("Matteo"));
		System.out.println("'Matteo' esiste? " + l.esiste("Matteo"));
		System.out.println(l);

		System.out.println("Aggiunta di: Mario");l.addTail(new Nodo("Mario"));
		System.out.println("Rimozione 'Mario': " + l.remove("Mario"));
	}
}