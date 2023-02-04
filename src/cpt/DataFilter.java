package cpt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class DataFilter {

    private static ArrayList<CountryData> dataList = new ArrayList<CountryData>();

    /*public static void main(String[] args) throws IOException{
        DataFilter dataInteraction = new DataFilter();
         ArrayList <CountryData> dataList = new ArrayList <CountryData>();
         for(int i = 0; i< dataList.size(); i++){
             System.out.println(dataList.get(i).getRegion());
             System.out.println(dataList.get(i).getYear());
             System.out.println(dataList.get(i).getDeath());
            
        }
    }*/

    /**
     * collect data from csv file and converts it into an arraylist
     * @throws IOException used to read files and bufferedreader
     */
    public DataFilter() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("src/annual-number-of-deaths-by-world-region - annual-number-of-deaths-by-world-region.csv"));
        
        String str = br.readLine();

        while(str != null){
           String[] holder = str.split(",");
           CountryData region = new CountryData((holder[0]), Integer.parseInt(holder[1]), Double.parseDouble(holder[2]));
            
           dataList.add(region);
            System.out.println(str);
           str = br.readLine();
        }

        br.close();
    }

    //finds data relating to the region and generates a new list to hold the regions
    public static ArrayList<String> regionName(String place){

        ArrayList <String> newList = new ArrayList <String>();

        for(int i = 0; i < dataList.size(); i++){

            if(dataList.get(i).getRegion() == place){
                newList.add(dataList.get(i).getRegion());
            } 
        }

        return newList;
    }

    //finds data relating to the year and generates a new list to hold the years
    public ArrayList<CountryData> yearSel(int year){

        ArrayList <CountryData> theList = new ArrayList <CountryData>();

        for(int i = 0; i < dataList.size(); i++){
            if(dataList.get(i).getYear() == year){
                theList.add(dataList.get(i));
            }
        }

        return theList;
    }

    /**public double getDecade1(){
        
        for(int i = 0; i < dataList.size(); i++){
            if(dataList.get(i).getYear() == "2000"){
                return dataList.get(i).getDeath();
            }
        }
        return -1;
    }

    public double getDecade2(){

        for(int i = 0; i < dataList.size(); i++){
            if(dataList.get(i).getYear() == "2010"){

                return dataList.get(i).getDeath();
            }
        }
        return -1;
    }

    public double getDecade3(){
        
        for(int i = 0; i < dataList.size(); i++){
            if(dataList.get(i).getYear() == "2020"){

                return dataList.get(i).getDeath();
            }
        }
        return -1;
    }*/
}
