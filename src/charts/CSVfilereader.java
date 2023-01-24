package charts;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVfilereader {
    
    public static void main(String args[]) throws IOException{

        String path = "C:/Users/Chery/Downloads/annual-number-of-deaths-by-world-region - annual-number-of-deaths-by-world-region.csv";
        String line = "";
        String [][] data = csvArray(path, 3);
        ArrayList<String> deathRecords = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader(path));
     
        for(int i = 0; i < data.length; i++){
            System.out.println(String.join(",", data[i]));
        }


    
    }

  
}
