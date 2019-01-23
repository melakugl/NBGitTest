/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayproject;

import java.io.*;

/**
 *
 * @author Melaku
 */
public class FileExample {

    public void fileExample() {
        File inFile = new File("E:\\myfile.txt");
        FileOutputStream fileOutputStream = null;
        try {

            fileOutputStream = new FileOutputStream(inFile);
            int num = 10;
            byte byteArray[]={10,20,30,40,50};
            fileOutputStream.write(byteArray);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }

    }

}
