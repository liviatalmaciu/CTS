package prototype;

public class Autobuz implements MijlocTransport{
    String SoferAutobuz;

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }

    public Autobuz(String soferAutobuz){
        super();
        SoferAutobuz=soferAutobuz;
    }

    public String getSoferAutobuz() {
        return SoferAutobuz;
    }

    public void setSoferAutobuz(String soferAutobuz) {
        SoferAutobuz = soferAutobuz;
    }
}
