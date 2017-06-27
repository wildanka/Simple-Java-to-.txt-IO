/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package txtIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author DAN
 */
public class txtWriter {
    public static void simpanTXT(String lokasiFile, double[][] tes, int baris, int kolom){
        try{
            
            BufferedWriter txtWriter = null;
            txtWriter = new BufferedWriter(new FileWriter(lokasiFile));
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    txtWriter.write(Double.toString(tes[i][j])+" ");
                }
                txtWriter.newLine();
            }
            txtWriter.flush();
            txtWriter.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
