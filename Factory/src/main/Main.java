package main;

import factory.Factory;
import mijlocTransport.MijlocTransport;
import mijlocTransport.TipTransport;

public class Main {
    public static void main(String[]args){
        Factory factory = new Factory();

        MijlocTransport autobuz = factory.getMijlocTransport(TipTransport.Autobuz, "B23ABC");
        MijlocTransport tramvai = factory.getMijlocTransport(TipTransport.Tramvai, "B45CDE");
        MijlocTransport troleibuz = factory.getMijlocTransport(TipTransport.Troleibuz, "B56DEF");

        autobuz.afisareNrInmatriculare();
        tramvai.afisareNrInmatriculare();
        troleibuz.afisareNrInmatriculare();


    }
}
