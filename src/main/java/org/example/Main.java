package org.example;

import java.util.Comparator;
import java.util.function.BiFunction;

import static java.util.Arrays.stream;

public class Main {
    public static int add(int a, int b)
    {        return a+b;
    }

    public void displayMenu()
    {
        System.out.println("____________________");
        System.out.println("1-reserve");
        System.out.println("2-exit");
        System.out.println("_______________________");
    }
    public static void stringConcat(String s1, String s2)
    {
        var s = s1 + s2;
    }
    public static void main(String[] args) {
        //Lambda ()->
        BiFunction<Integer,Integer,Integer> additionLa=(a,b)-> Main.add(a,b);


        //Method reference ::
        BiFunction<Integer,Integer,Integer>additionMR=Main::add;


        //instance method invoking through method reference
         //step 1: create object of class.
        //step 2: call nonStatic method through class object

        Main mainClass=new Main();
        mainClass.displayMenu();
        
        //method reference step 1. create stream
        Runnable displayMenu = mainClass::displayMenu;

        BiFunction<String,String,String>concat=(s,m)->s.concat(m);
        BiFunction<String,String,String>concat1=String::concat;


    }

}