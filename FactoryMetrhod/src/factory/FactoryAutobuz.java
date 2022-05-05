package factory;

import mijlocTransport.Autobuz;
import mijlocTransport.MijlocTransport;

public class FactoryAutobuz implements AbstractFactory {


    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
