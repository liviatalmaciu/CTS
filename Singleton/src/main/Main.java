package main;

import singleton.Singleton;

public class Main {
    public static void main(String[]args){
        Singleton s1;
        s1=Singleton.getInstanta();
        System.out.println(s1);
    }
}
