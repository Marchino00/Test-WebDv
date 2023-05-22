import java.util.ArrayList;

public class tabella {

    private ArrayList<Risposte> rispo = new ArrayList<>();

    public void mostraRisposta() {
        for (int i = 0; i < rispo.size(); i++) {
            System.out.println((1 + i) + " : " + rispo.get(i).getNome());
        }

    }// fine mostra risposta

    public void addR(Risposte risposta) {
        this.rispo.add(risposta);
    }

    public ArrayList<Risposte> getRispost() {
        return rispo;
    }
}
