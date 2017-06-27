import txtIO.txtReader;
import txtIO.txtWriter;

public class Main {
  public static void main(String[] args){
    
    /*if you want to write to your .txt file    */
    String lokasiFile = "yourFileLocation"; // change yourFileLocation to your .txt file location such as : "D:\\DAN\\tes.txt"
    
    //create an array for the data you want to write to your txt file. (you can change the size, banyakFrame is row, ukuran frame is column of your array)
    int banyakFrame = 5;
    int ukuranFrame = 2;    
    double data[][] = new double[banyakFrame][ukuranFrame];
    data[0][0] = 0.0035452;
    data[0][1] = 0.85452;
    data[1][0] = 0.75452;
    data[1][1] = 0.65452;
    data[2][0] = 0.55452;
    data[2][1] = 0.45452;
    data[3][0] = 0.35452;
    data[3][1] = 0.25452;
    data[4][0] = 0.15452;
    data[4][1] = 0.05452;
    
    //then write the data to your .txt file
    txtWriter.simpanTXT(lokasiFile, data, banyakFrame, ukuranFrame);
    
    /*if you only want to read the .txt file
    txtReader.bacaTXT(lokasiFile,banyakFrame,ukuranFrame);        
  }
}
