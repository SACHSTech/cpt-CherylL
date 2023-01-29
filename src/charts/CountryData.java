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

    public void setYear(int newYear){
        yearNum = newYear;
    }

    public double getDeath(){
        return deathsP;
    }

    public void setDeath(double newDeath){
        deathsP = newDeath;
    }
   
    
    public String toString(){
        return regionName + ", " + yearNum + ", " + deathsP; 
    }
}
