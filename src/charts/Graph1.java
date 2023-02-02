package charts;
 
import java.io.IOException;
import java.util.ArrayList;

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
 
  private BarChart barChart;
  private CategoryAxis xAxis;
  private NumberAxis yAxis;

  /*
   * this creates a graph by placing information from the csv file to the bar chart
   * the x axis is for the countries
   * the y axis is for the number of deaths
   */
  public Parent barChart(){

    String[] country = {"Asia", "Africa", "Latin America", "Northern America and the Caribbean", "Oceana", "Europe"};
    yAxis = new NumberAxis("number of deaths", 0, 25000000, 10000000);
    xAxis = new CategoryAxis();
    xAxis.setCategories(FXCollections.<String>observableArrayList(country));

    ObservableList<BarChart.Series> barChartData =
    FXCollections.observableArrayList(
      new BarChart.Series("2000", FXCollections.observableArrayList(
        new BarChart.Data(country[0], 23974630),
        new BarChart.Data(country[1], 10614270),
        new BarChart.Data(country[2], 3172244),
        new BarChart.Data(country[3], 2608888),
        new BarChart.Data(country[4], 211796),
        new BarChart.Data(country[5], 8401888))),  
      new BarChart.Series("2010",FXCollections.observableArrayList(   
        new BarChart.Data(country[0], 22349539),
        new BarChart.Data(country[1], 10652256),
        new BarChart.Data(country[2], 3694621),
        new BarChart.Data(country[3], 2710578),
        new BarChart.Data(country[4], 243110),
        new BarChart.Data(country[5], 8128387))),
      new BarChart.Series("2020",FXCollections.observableArrayList(   
        new BarChart.Data(country[0], 20724448),
        new BarChart.Data(country[1], 11390416),
        new BarChart.Data(country[2], 5066101),
        new BarChart.Data(country[3], 3544380),
        new BarChart.Data(country[4], 278401),
        new BarChart.Data(country[5], 9119281)))
    );
        
    //display bar chart
    barChart = new BarChart(xAxis, yAxis, barChartData, 15);
    barChart.setTitle("Number of deaths in each region by decades");
    return barChart;
   
  }  
    



  @Override public void start(Stage primaryStage) throws Exception {
    Scene scene  = new Scene(barChart(),850,650);
      primaryStage.setScene(scene);
      primaryStage.setScene(scene);
      primaryStage.show();
      
  }
  

  /**
   * Java main for when running without JavaFX launcher
   */
  public static void main(String[] args) {
      launch(args);
  }
    
}
