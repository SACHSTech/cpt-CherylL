package cpt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class DataFilter {

    private static ArrayList<CountryData> dataList = new ArrayList<CountryData>();

    public static void main(String[] args) throws IOException{
        //DataFilter dataInteraction = new DataFilter();
         //ArrayList <CountryData> dataList = new ArrayList <CountryData>();
         for(int i = 0; i< dataList.size(); i++){
             System.out.println(dataList.get(i).getRegion());
             System.out.println(dataList.get(i).getYear());
             System.out.println(dataList.get(i).getDeath());
            
        }
    }

    public DataFilter() throws IOException{
        BufferedReader key = new BufferedReader(new FileReader("/Users/Chery/cpt-CherylL/annual-number-of-deaths-by-world-region - annual-number-of-deaths-by-world-region.csv"));
        
        String str = key.readLine();

        while(str != null){
            String[] holder = str.split(",");
            CountryData country = new CountryData((holder[0]), (holder[1]), Double.parseDouble(holder[2]));
            
            
            str = key.readLine();
            System.out.print(dataList);
            dataList.add(country);
        }
        key.close();
    }

    public ArrayList<CountryData> regionName(String region){

        ArrayList <CountryData> newList = new ArrayList <CountryData>();

        for(int i = 0; i < dataList.size(); i++){

            if(dataList.get(i).getRegion().equals(region)){
                newList.add(dataList.get(i));
            } 
        }

        return newList;
    }

    public ArrayList<CountryData> yearSel(String year){

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
