package charts;

import java.io.*;

abstract class CountryData {
    
    //variables needed
    private int yearNum;
    private String regionName;
    private double deathsP;

    public CountryData(String aRegion, int aYear, double aDeath){
        yearNum = aYear;
        regionName = aRegion;
        deathsP = aDeath;
    }

    public String getRegion(){
        return regionName;
    }

    public void setRegion(String newRegion){
        regionName = newRegion;
    }

    public int getYear(){
        return yearNum;
    }
   
}
