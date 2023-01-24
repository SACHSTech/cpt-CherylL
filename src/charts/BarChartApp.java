/* ....Show License.... */
package charts;
 
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

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
 
 
/**
 * A chart that displays rectangular bars with heights indicating data values
 * for categories. Used for displaying information when at least one axis has
 * discontinuous or discrete data.
 */
public class BarChartApp extends Application {
 
    private BarChart barChart;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
 
    public void barChart(String args[]) throws IOException{


      String path = "C:/Users/Chery/Downloads/annual-number-of-deaths-by-world-region - annual-number-of-deaths-by-world-region.csv";
      String line = "";
      BufferedReader reader = new BufferedReader(new FileReader(path));
      ArrayList <String> countries = new ArrayList<String>();
      ArrayList <Integer> deathNum = new ArrayList<Integer>();

      
      while((line = reader.readLine()) != null){
        countries.add(line.substring(0));
        System.out.println(countries);
        
      }


      xAxis = new CategoryAxis();
      xAxis.setLabel("World Region");
      yAxis = new NumberAxis();
      yAxis.setLabel("Number of Deaths");

      BarChart barChart = new BarChart(xAxis, yAxis);
      XYChart.Series dataOne = new XYChart.Series();
      dataOne.setName("Asia");

      //return barChart;
    }
 
    @Override public void start(Stage primaryStage) throws Exception {
        //primaryStage.setScene(new Scene(barChart()));
        primaryStage.show();
    }
 
    /**
     * Java main for when running without JavaFX launcher
     */
    public static void main(String[] args) {
        launch(args);
    }
}