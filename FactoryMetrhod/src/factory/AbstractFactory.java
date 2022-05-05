package factory;

import mijlocTransport.MijlocTransport;

public interface AbstractFactory {
    public MijlocTransport getMijlocTransport(String nrInmatriculare);
}
