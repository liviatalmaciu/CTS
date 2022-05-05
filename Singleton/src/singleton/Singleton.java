package singleton;

public class Singleton {
    private Singleton(){
    //constructor privat fara parametrii
    }

    public static synchronized Singleton getInstanta() {
        if(instanta == null){
            instanta = new Singleton();
        }
        return instanta;
    }

    private static Singleton instanta = null; //instanta statica privata


}