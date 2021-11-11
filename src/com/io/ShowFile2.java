package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
This program display a text file
which takes file name as command line argument
 */
public class ShowFile2 {
    public static void main(String[] args) {
        int data;
        FileInputStream file=null;

        if(args.length!=1){
            System.out.println("usage: ShohwFile filename");
            return;
        }

        try{
            file = new FileInputStream(args[0]);

            do{
                data = file.read();
                if(data!=-1) System.out.println((char)data);
            }
            while (data!=-1);
        }

        catch (FileNotFoundException e)
        {
            System.out.println("File Not Found.");
        }

        catch (IOException e)
        {
            System.out.println("An I/O error occured");
        }

        finally
        {
            try{
                if(file!=null) file.close();
            }
            catch (IOException e){
                System.out.println("Error closing file");
            }
        }


    }
}
