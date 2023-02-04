package cpt;

public class CountryData {
    
    //variables needed
    private int yearNum;
    private String regionName;
    private double deathsP;

    /**
     * defining the countrydata class
     * @param aRegion regions around the world
     * @param aYear  years
     * @param aDeath number of deaths
     */
    public CountryData(String aRegion, int aYear, double aDeath){
        yearNum = aYear;
        regionName = aRegion;
        deathsP = aDeath;
    }

    public String getRegion(){
        return regionName;
    }


    public int getYear(){
        return yearNum;
    }

 
    public double getDeath(){
        return deathsP;
    }


    //output
    public String toString(){
        return regionName + ", " + yearNum + ", " + deathsP; 
    }
}
