package factory;

import mijlocTransport.MijlocTransport;
import mijlocTransport.Tramvai;

public class FactoryTramvai implements AbstractFactory{


    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
