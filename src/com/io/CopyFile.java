package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int data;
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        if(args.length!=2){
            System.out.println("Require source and destination file.");
            return;
        }

        try{
            fileInputStream = new FileInputStream(args[0]);
            fileOutputStream = new FileOutputStream(args[1]);


            do{
                data = fileInputStream.read();
                if(data!=-1) fileOutputStream.write(data);
            }while (data!=-1);
        }
        catch (IOException e){
            System.out.println("I/O error : "+e);
        }
        finally {
            try{
                if(fileInputStream!=null) fileInputStream.close();
            }
            catch (IOException e){
                System.out.println("Error closing input file");
            }
            try{
                if(fileOutputStream!=null) fileOutputStream.close();
            }
            catch (IOException e){
                System.out.println("Error closing output file");
            }
        }
    }
}
