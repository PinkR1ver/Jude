package com.pinkr1ver;

import com.pinkr1ver.Facade;

public class Client 
{
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hey, there's Jude, your nice friend to analyze your computer right now");
        }
        else{
            for(String arg : args) {
                Facade facade = new Facade(arg);
            }
        }
    }
}
