public class Porto {
    private Barca[] PORTO;

    public Porto() {
        PORTO = new Barca[100];
    }

    public boolean parkBarca(Barca b1){
        if(b1.getTb()== TipoBarca.VELA){
            for (int i=50; i< PORTO.length;i++){
                if( PORTO[i]==null){
                    PORTO[i]= b1;
                    return true;
                }
            }
            return false;
        }

        int inizio=(b1.getLunghezza()< 10 ? 0 : 21);
        for (int i=inizio; i<PORTO.length; i++){
             if( PORTO[i]==null){
                    PORTO[i]= b1;
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

    public String toStrin(){
        String s="";
        for (int i=0; i< PORTO.length;i++){
            if(PORTO[i]!=null){
                s+= "Posizione "+ i + ": " + PORTO[i].getNome() + "\n";
            }
        }
        return s;
    }
    public String toString(){
        String s="";
        for (int i=0; i< PORTO.length;i++){
            if(PORTO[i]!=null){
                s+= "Posizione "+ i + " " + PORTO[i] + "\n";
            }
        }
        return s;
    }

}

