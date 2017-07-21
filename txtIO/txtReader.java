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
    
   /**
     * @param lokasiFile
     * @param baris
     * @param kolom
     * @return 
     */
    public static double[][] bacaTXT(String lokasiFile, int baris, int kolom){
        System.out.println("============== TXT READER 2D ==============");
        double[][] arrayHasilTXT = new double[baris][kolom]; //elemen yang dibaca dari .file .txt akan disimpan kedalam 2D array
        
        try {
            Scanner scan = new Scanner(new FileInputStream(lokasiFile));
            
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    if (scan.hasNextDouble()) {
                        arrayHasilTXT[i][j] = scan.nextDouble();
                    }
                    //System.out.println(i+" "+j+" = "+arrayHasilTXT[i][j]);
                }                                
            }            
            //FeedForwardNN.Wih = arrayHasilTXT;
            return arrayHasilTXT;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(txtReader.class.getName()).log(Level.SEVERE, null, ex);
        }                
        return arrayHasilTXT;
    }
    
     /**
     * @param lokasiFile
     * @param baris
     * @param kolom
     * @return
     */
    public static double[] bacaTXT(String lokasiFile, int kolom){
        System.out.println("============== TXT READER 1D ==============");
        double[] arrayHasilTXT = new double[kolom]; //elemen yang dibaca dari .file .txt akan disimpan kedalam 2D array
        
        try {
            Scanner scan = new Scanner(new FileInputStream(lokasiFile));                        
                for (int j = 0; j < kolom; j++) {
                    if (scan.hasNextDouble()) {
                        arrayHasilTXT[j] = scan.nextDouble();
                    }
                    //System.out.println(j+" = "+arrayHasilTXT[j]);
                }                                                                   
            return arrayHasilTXT;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(txtReader.class.getName()).log(Level.SEVERE, null, ex);
        }                
        return arrayHasilTXT;
    }
}
