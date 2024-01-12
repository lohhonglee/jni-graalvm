package com.example;

public class App {

    static {
        System.loadLibrary("hello");
    }

    public static void main(String[] args) {

        String name;
        if (args.length == 0) {
            name = "world";
        } else {
            name = args[0];
        }

        Greetings.hello(name);
    }

}