package main;

import builder.Autobuz;
import builder.AutobuzBuilder;

public class Main {
    public static void main(String[]args){
        Autobuz a1= new AutobuzBuilder().setDeshideUsi(true).build();
        System.out.println(a1.toString());
    }
}
