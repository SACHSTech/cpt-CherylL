package charts;
 
import java.io.IOException;
import java.util.ArrayList;

import cpt.CountryData;
import cpt.DataFilter;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

 
 
/**
 * A chart that displays rectangular bars with heights indicating data values
 * for categories. Used for displaying information when at least one axis has
 * discontinuous or discrete data.
 */
public class Graph1 extends Application {
 
    private BarChart<String, Double> barChart;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
    private XYChart.Series<String, Double> series1;
    private XYChart.Series<String, Double> series2;
    private XYChart.Series<String, Double> series3;

  /*
   * this creates a graph by placing information from the csv file to the bar chart
   * the x axis is for the countries
   * the y axis is for the number of deaths
   */
  public Parent barChart() throws IOException{

    String[] region = {"Asia (UN)", "Africa (UN)", "Latin America (UN)", "Northern America and the Caribbean (UN)", "Oceana (UN)", "Europe (UN)"};
    DataFilter DataFilter = new DataFilter();
    NumberAxis yAxis = new NumberAxis();
    yAxis.setLabel("Number of Deaths");
    CategoryAxis xAxis = new CategoryAxis();
    xAxis.setLabel("Regions");
    

    ArrayList<CountryData> decade1 = DataFilter.yearSel(2000);
    ArrayList<CountryData> decade2 = DataFilter.yearSel(2010);
    ArrayList<CountryData> decade3 = DataFilter.yearSel(2020);
   

    FXCollections.<String>observableArrayList(region);

   
    series1 = new XYChart.Series<>();
    series1.setName("2000");

    for(int i = 0; i< decade1.size(); i++){
        series1.getData().add(
        new XYChart.Data<String, Double>(decade1.get(i).getRegion(), decade1.get(i).getDeath()));    
        System.out.println(series1);            
    }

    barChart.setPrefHeight(600);
    barChart.setPrefWidth(500);
    System.out.println(decade1);
    barChart.getData().add(series1);
    barChart.setTitle("Number of deaths in each region by decades");
    return barChart;
   
  }  
    



  @Override public void start(Stage primaryStage) throws Exception {
    // Scene scene  = new Scene(barChart());
      primaryStage.setScene(new Scene(barChart()));
      primaryStage.show();
      
  }
  

  /**
   * Java main for when running without JavaFX launcher
   */
  public static void main(String[] args) {
      launch(args);
  }
    
}
