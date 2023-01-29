package charts;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class DataFilter {
    
    private static ArrayList<CountryData> dataList = new ArrayList<CountryData>();

    public DataFilter() throws IOException{
        String path = "C:/Users/Chery/Downloads/annual-number-of-deaths-by-world-region - annual-number-of-deaths-by-world-region.csv";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String currentLine = reader.readLine();
        

        while(currentLine != null){
            String [] comma = currentLine.split(",");
            CountryData region = new CountryData((comma[0]), Integer.parseInt(comma[1]), Double.parseDouble(comma[2]));
            dataList.add(region);
        }  

        reader.close();
    }


    public double getDecade1(){
        double startNum = 0;
        for(int i = 0; i < dataList.size(); i++){
            if(dataList.get(i).getYear() == 2000){
                double totalNum = dataList.get(i).getDeath +=  startNum;
                return totalNum;
            }
        }
        return -1;
    }

    public double getDecade2(){
        double startNum = 0;
        for(int i = 0; i < dataList.size(); i++){
            if(dataList.get(i).getYear() == 2010){
                double totalNum = dataList.get(i).getDeath +=  startNum;
                return totalNum;
            }
        }
        return -1;
    }

    public double getDecade3(){
        double startNum = 0;
        for(int i = 0; i < dataList.size(); i++){
            if(dataList.get(i).getYear() == 2020){
                double totalNum = dataList.get(i).getDeath +=  startNum;
                return totalNum;
            }
        }
        return -1;
    }
   
    


    
}
