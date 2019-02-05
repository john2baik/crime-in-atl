package com;

import parser.DataParser;

import java.io.IOException;

public class Main {
    private static DataParser dataParser = null;
    public static void main(String[] args) {
        try{
            dataParser = new DataParser();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
