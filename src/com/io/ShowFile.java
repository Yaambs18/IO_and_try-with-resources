package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
This program display a text file
which takes file name as command line argument
 */
public class ShowFile {
    public static void main(String[] args) {
        int data;
        FileInputStream file;

        if(args.length!=1){
            System.out.println("usage: ShohwFile filename");
            return;
        }

        try{
            file = new FileInputStream(args[0]);
        }
        catch (FileNotFoundException e){
            System.out.println("Cannot open file");
            return;
        }

        try{
            do{
                data = file.read();
                if(data!=-1) System.out.println((char)data);
            }while (data!=-1);
        }
        catch (IOException e){
            System.out.println("Error reading file");
        }

        try{
            file.close();
        }
        catch (IOException e){
            System.out.println("Error closing file");
        }

    }
}
