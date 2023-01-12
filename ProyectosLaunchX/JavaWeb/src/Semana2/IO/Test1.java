package Semana2.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                try {
                    FileOutputStream fos = new FileOutputStream ( name:"C:\\magia.txt");
                }catch (IOException ioe) {
                    System.out.println(ioe);
                }
            }
        };

        Thread writeFile = new Thread(t1);
        writeFile.start();
    }
}
