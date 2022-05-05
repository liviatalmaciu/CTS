package main;

import factory.FactoryAutobuz;
import factory.FactoryTramvai;
import factory.FactoryTroleibuz;
import mijlocTransport.MijlocTransport;

public class Main {
    public static void main(String [] args){
        MijlocTransport autobuz =  new FactoryAutobuz().getMijlocTransport("B22KLM");
        MijlocTransport tramvai = new FactoryTramvai().getMijlocTransport("B78NMP");
        MijlocTransport troleibuz = new FactoryTroleibuz().getMijlocTransport("B49WXY");

        autobuz.afisareNrInmatriculare();
        tramvai.afisareNrInmatriculare();
        troleibuz.afisareNrInmatriculare();
    }
}
