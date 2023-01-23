import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CSVfilereader {
    
    public static void main(String args[]) throws FileNotFoundException{
        String path = "C:/Users/Chery/Downloads/annual-number-of-deaths-by-world-region - annual-number-of-deaths-by-world-region.csv";
        
        BufferedReader reader = new BufferedReader(new FileReader(path));
    }
}
