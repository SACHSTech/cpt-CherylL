package charts;

public class CountryData {
    
    //variables needed
    private int yearNum;
    private String regionName;
    private double deathsP;
    public double getDeath;

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


   
    
    public String toString(){
        return regionName + ", " + yearNum + ", " + deathsP; 
    }
}
