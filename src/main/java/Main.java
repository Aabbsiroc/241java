package main.java;

import main.java.lab1.SimpleUrl;

public class Main {
    public static void main(String[] args) {
        SimpleUrl simpleUrl = new SimpleUrl();
        simpleUrl.execute();
        simpleUrl.listContent();
        System.out.println(simpleUrl);
    }
}