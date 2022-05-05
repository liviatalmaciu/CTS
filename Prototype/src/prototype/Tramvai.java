package prototype;

public class Tramvai implements MijlocTransport{
    String SoferTramvai;


    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }

    public String getSoferTramvai() {
        return SoferTramvai;
    }

    public void setSoferTramvai(String soferTramvai) {
        SoferTramvai = soferTramvai;
    }
}
