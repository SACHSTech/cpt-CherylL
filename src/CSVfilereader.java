import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVfilereader {
    
    public static void main(String args[]) throws IOException{

        String path = "C:/Users/Chery/Downloads/annual-number-of-deaths-by-world-region - annual-number-of-deaths-by-world-region.csv";
        String line = "";

        BufferedReader reader = new BufferedReader(new FileReader(path));
        
        while((line = reader.readLine()) != null){
            String [] values = line.split(",");
            System.out.println(values[0]);
        }
    }
}
