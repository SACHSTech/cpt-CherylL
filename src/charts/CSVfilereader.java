package charts;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVfilereader {
    
    public static void main(String args[]) throws IOException{

        String path = "C:/Users/Chery/Downloads/annual-number-of-deaths-by-world-region - annual-number-of-deaths-by-world-region.csv";
        String [][] data = csvArray(path, 3);
        BufferedReader reader = new BufferedReader(new FileReader(path));
     
        for(int i = 0; i < data.length; i++){
            System.out.println(String.join(",", data[i]));
        }
    
    }

    public static String [][] csvArray(String path, int columnNum) throws IOException{
        
        String currentLine;
        String deLimiter = ",";
        List <String> deathRecords = new ArrayList<String>();
        FileReader fr = new FileReader(path);
        BufferedReader reader = new BufferedReader(fr);

        while((currentLine = reader.readLine()) != null){
            deathRecords.add(currentLine);
        }
        
        int deathCount = deathRecords.size();

        return csvArray(path, columnNum);
    }
  
}
