/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package txtIO;

import elman.rnn.Antarmuka;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAN
 */
public class txtReader {    
    
    public static void bacaTXT(String lokasiFile, int baris, int kolom){
        
        double[][] arrayHasilTXT = new double[baris][kolom]; //elemen yang dibaca dari .file .txt akan disimpan kedalam 2D array
        
        try {
            Scanner scan = new Scanner(new FileInputStream(lokasiFile));
            
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    if (scan.hasNextDouble()) {
                        arrayHasilTXT[i][j] = scan.nextDouble();
                    }
                    System.out.println(i+" "+j+" = "+arrayHasilTXT[i][j]);
                }                                
            }
            Antarmuka a = new Antarmuka();
            a.asd = arrayHasilTXT;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(txtReader.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
}
