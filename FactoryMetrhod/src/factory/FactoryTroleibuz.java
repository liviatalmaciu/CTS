package factory;

import mijlocTransport.MijlocTransport;
import mijlocTransport.Troleibuz;

public class FactoryTroleibuz  implements AbstractFactory{

    @Override
    public MijlocTransport getMijlocTransport(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
