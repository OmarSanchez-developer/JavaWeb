package Semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream(name:"C:\\magia.txt");
            String s = "Magia!!!";
            byte b[]=s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Magia!!!");
        } catch(IOException ioe){
            ioe.printStackTrace();


        }
    }
}
