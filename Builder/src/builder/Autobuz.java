package builder;

import java.nio.MappedByteBuffer;

public class Autobuz {
    private String model;
    private String numeSofer;
    private boolean oprireCapat;
    private boolean deshideUsi;
    private String textDerulat;
    private String nrInmatriculare;

    public Autobuz(){
        super();
        this.model="BMW";
        this.numeSofer="Marcel";
        this.oprireCapat=true;
        this.deshideUsi=true;
        this.textDerulat="Urmeaza statia Piata Domenii";
        this.nrInmatriculare="B27SRC";
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setOprireCapat(boolean oprireCapat) {
        this.oprireCapat = oprireCapat;
    }

    public void setDeshideUsi(boolean deshideUsi) {
        this.deshideUsi = deshideUsi;
    }

    public void setTextDerulat(String textDerulat) {
        this.textDerulat = textDerulat;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("Autobuz [model =");
        build.append(model);
        build.append(", Nume sofer=");
        build.append(numeSofer);
        build.append(", oprire capat=");
        build.append(oprireCapat);
        build.append(", deschide usi=");
        build.append(deshideUsi);
        build.append(", text derulat=");
        build.append(textDerulat);
        build.append(", numar inmatriculare=");
        build.append(nrInmatriculare);
        build.append("]");

        return build.toString();
    }
}
