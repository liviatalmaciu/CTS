package mijlocTransport;

public class Tramvai extends MijlocTransport {
    public Tramvai(String nrInmnariculare){
        super(nrInmnariculare);
    }

    @Override
    public void afisareNrInmatriculare() {
        System.out.println("Tramvaiul are nr de inmatriculare: ");
        System.out.println(super.getNrInmatriculare());
    }

}
