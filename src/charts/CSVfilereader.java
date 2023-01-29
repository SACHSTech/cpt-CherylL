package charts;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class CSVfilereader{
    
    ArrayList<CSVfilereader> fileArrayReturn; 
    List <Double> deathNum = new ArrayList<Double>(); 
    List <Integer> yearNum = new ArrayList<Integer>(); 
    public static void main(String args[]) throws IOException{

        String path = "C:/Users/Chery/Downloads/annual-number-of-deaths-by-world-region - annual-number-of-deaths-by-world-region.csv";
        String [][] data = csvArray(path, 3);
        String Data [] = ReadCol(2, path, ",");
        BufferedReader reader = new BufferedReader(new FileReader(path));
        List <Double> deathNum = new ArrayList<Double>(); 
        List <Integer> yearNum = new ArrayList<Integer>(); 



        for(int i = 0; i < data.length; i++){
           System.out.println(String.join(",", data[i]));
           System.out.println(Data[i]);
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

        String fileArrayReturn [][] = new String[deathCount][columnNum];
        String [] data;

        for(int i = 0; i < deathCount; i++){

            data = deathRecords.get(i).split(deLimiter);

            for(int j = 0; j < data.length; j++){

                fileArrayReturn[i][j] = data[j];
            }
            
        }
        reader.close();
        
        return fileArrayReturn;
    }

    public static String[] ReadCol(int col, String path, String delimiter){
        String dataCol [];
        String currentLine;
        ArrayList<String> colData = new ArrayList<String>();
        try {
            FileReader fr = new FileReader(path);
            BufferedReader reader = new BufferedReader(fr);

            while((currentLine = reader.readLine()) != null){
            dataCol = currentLine.split(delimiter);
            colData.add(dataCol[col]);
            }

            
        } 
        catch (Exception e) {
            
            System.out.println(e);
            return null;
        } 
        
        return colData.toArray(new String[0]);
    } 
    
}
