package charts;

abstract class CountryData {
    
    //variables needed
    private int yearNum;
    private String regionName;
    private double deathsP;

    public Region(String aRegion, int aYear, double aDeath){
        yearNum = aYear;
        regionName = aRegion;
        deathsP = aDeath;
    }

   
}
