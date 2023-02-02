package cpt;

public class CountryData {
    
    //variables needed
    private String yearNum;
    private String regionName;
    private double deathsP;

    public CountryData(String aRegion, String aYear, double aDeath){
        this.yearNum = aYear;
        this.regionName = aRegion;
        this.deathsP = aDeath;
    }

    public String getRegion(){
        return regionName;
    }



    public String getYear(){
        return yearNum;
    }

 

    public double getDeath(){
        return deathsP;
    }


   
    
    public String toString(){
        return regionName + ", " + yearNum + ", " + deathsP; 
    }
}
