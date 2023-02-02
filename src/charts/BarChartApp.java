package charts;
 

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

 
 
/**
 * A chart that displays rectangular bars with heights indicating data values
 * for categories. Used for displaying information when at least one axis has
 * discontinuous or discrete data.
 */
public class BarChartApp extends Application {
 
  private BarChart barChart;
  private CategoryAxis xAxis;
  private NumberAxis yAxis;
  private boolean box1Graph1Option, box2Graph1Option, box3Graph1Option;
  XYChart.Series series2 = new XYChart.Series();
  XYChart.Series series3 = new XYChart.Series();
  XYChart.Series series1 = new XYChart.Series();
  /*
   * this creates a graph by placing information from the csv file to the bar chart
   * the x axis is for the countries
   * the y axis is for the number of deaths
   */
  public Parent barChart(){

    String[] country = {"Asia", "Africa", "Latin America", "Northern America and the Caribbean", "Oceana", "Europe"};
    FXCollections.<String>observableArrayList(country);
  
    yAxis = new NumberAxis();
    xAxis = new CategoryAxis();
    xAxis.setLabel("Regions");
    yAxis.setLabel("Number of Deaths");



    series1.setName("2000");
    series1.getData().add(new XYChart.Data(country[0], 23974630));
    series1.getData().add(new XYChart.Data(country[1], 10614270));
    series1.getData().add(new XYChart.Data(country[2], 3172244));
    series1.getData().add(new XYChart.Data(country[3], 2608888));
    series1.getData().add(new XYChart.Data(country[4], 211796));
    series1.getData().add(new XYChart.Data(country[5], 8401888));

    //XYChart.Series series2 = new XYChart.Series();
    series2.setName("2010");
    series2.getData().add(new XYChart.Data(country[0], 22349539));
    series2.getData().add(new XYChart.Data(country[1], 10652256));
    series2.getData().add(new XYChart.Data(country[2], 3694621));
    series2.getData().add(new XYChart.Data(country[3], 2710578));
    series2.getData().add(new XYChart.Data(country[4], 243110));
    series2.getData().add(new XYChart.Data(country[5], 8128387));
    
        
    series3.setName("2020");
    series3.getData().add(new XYChart.Data(country[0], 20724448));
    series3.getData().add(new XYChart.Data(country[1], 11390416));
    series3.getData().add(new XYChart.Data(country[2], 5066101));
    series3.getData().add(new XYChart.Data(country[3], 3544380));
    series3.getData().add(new XYChart.Data(country[4], 278401));
    series3.getData().add(new XYChart.Data(country[5], 9119281));
    
    barChart = new BarChart(xAxis, yAxis);
    barChart.getData().add(series1);
    barChart.getData().add(series2);
    barChart.getData().add(series3);
    barChart.setTitle("Number of deaths in each region by decades");
    return barChart;
   
  }  
    
  
  @Override public void start(Stage primaryStage) throws Exception {
    Scene scene  = new Scene(barChart(),850,650);
      CheckBox box1 = new CheckBox("2000");
      CheckBox box2 = new CheckBox("2010");
      CheckBox box3 = new CheckBox("2020");

      Button checkButton = new Button("Load");
      checkButton.setOnAction(e -> handleOptions(box1,box2,box3));
      VBox layout1 = new VBox(5);
      layout1.setBackground(new Background(new BackgroundFill(Color.rgb(154, 218, 231),CornerRadii.EMPTY, Insets.EMPTY)));;
      layout1.setPadding(new Insets(20,20,20,20));
      layout1.getChildren().addAll(box1, box2, box3, barChart(), checkButton);
      Scene scene1 = new Scene(layout1, 600, 600);
      primaryStage.setScene(scene1);
      primaryStage.show();
      
  }
  

  /**
   * Java main for when running without JavaFX launcher
   */
  public static void main(String[] args) {
      launch(args);
  }
    
}