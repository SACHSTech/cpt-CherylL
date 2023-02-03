package cpt;

import java.util.*;
import java.io.*;

import java.util.Arrays;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Side;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Main extends Application{
   //variables for barchart
  private BarChart barChart;
  private CategoryAxis xAxis;
  private NumberAxis yAxis;
  XYChart.Series series2 = new XYChart.Series();
  XYChart.Series series3 = new XYChart.Series();
  XYChart.Series series1 = new XYChart.Series();

  //variables for linechart
  LineChart<String,Number> lineChart;
  XYChart.Series series2Line = new XYChart.Series();
  XYChart.Series series3Line = new XYChart.Series();
  XYChart.Series series1Line = new XYChart.Series();
  XYChart.Series series6Line = new XYChart.Series();
  XYChart.Series series5Line = new XYChart.Series();
  XYChart.Series series4Line = new XYChart.Series();


  public Parent barChart(){

        String[] country = {"Asia", "Africa", "Latin America", "Northern America and the Caribbean", "Oceana", "Europe"};
        FXCollections.<String>observableArrayList(country);
    
        yAxis = new NumberAxis();
        xAxis = new CategoryAxis();
        xAxis.setLabel("Regions");
        yAxis.setLabel("Number of Deaths");


        //series 1
        series1.setName("2000");
        series1.getData().add(new XYChart.Data(country[0], 23974630));
        series1.getData().add(new XYChart.Data(country[1], 10614270));
        series1.getData().add(new XYChart.Data(country[2], 3172244));
        series1.getData().add(new XYChart.Data(country[3], 2608888));
        series1.getData().add(new XYChart.Data(country[4], 211796));
        series1.getData().add(new XYChart.Data(country[5], 8401888));

        //series 2
        series2.setName("2010");
        series2.getData().add(new XYChart.Data(country[0], 22349539));
        series2.getData().add(new XYChart.Data(country[1], 10652256));
        series2.getData().add(new XYChart.Data(country[2], 3694621));
        series2.getData().add(new XYChart.Data(country[3], 2710578));
        series2.getData().add(new XYChart.Data(country[4], 243110));
        series2.getData().add(new XYChart.Data(country[5], 8128387));
        
        //series 3
        series3.setName("2020");
        series3.getData().add(new XYChart.Data(country[0], 20724448));
        series3.getData().add(new XYChart.Data(country[1], 11390416));
        series3.getData().add(new XYChart.Data(country[2], 5066101));
        series3.getData().add(new XYChart.Data(country[3], 3544380));
        series3.getData().add(new XYChart.Data(country[4], 278401));
        series3.getData().add(new XYChart.Data(country[5], 9119281));
        
        //display chart
        barChart = new BarChart(xAxis, yAxis);
        barChart.getData().add(series1);
        barChart.getData().add(series2);
        barChart.getData().add(series3);
        barChart.setTitle("Number of deaths in each region by decades");
        barChart.setAnimated(false);
        return barChart;
   
    }  
    
  /**
   * 
   * @param box1 first checkbox for year 2000
   * @param box2 second checkbox for year 2010
   * @param box3 third checkbox for year 2020
   */
  private void handleOptions(CheckBox box1, CheckBox box2, CheckBox box3){
        barChart.getData().clear();
        if(box1.isSelected() == true){ 

        barChart.getData().add(series1);
        
    
        }else if(box1.isSelected() == false){
        
        barChart.getData().remove(series1);
        }

        if(box2.isSelected()) {
        
            barChart.getData().add(series2);

        }
        else if(box2.isSelected() == false){
        barChart.getData().remove(series2);
        }

        if(box3.isSelected()) {
        barChart.getData().add(series3);
        }
        else if (box3.isSelected() == false) {
        barChart.getData().remove(series3);
        
        }
        return;
    }
  
  

    public Parent LineChart(){
            
        final CategoryAxis xAxisLine = new CategoryAxis();
        final NumberAxis yAxisLine = new NumberAxis();
        xAxis.setLabel("Years");
        lineChart = new LineChart<String,Number>(xAxisLine,yAxisLine);
        
        lineChart.setTitle("Number of Deaths in the Past 5 Years in each Region");
                        
        series1Line.setName("Asia");
        series1Line.getData().add(new XYChart.Data("2017", 21211975.55));
        series1Line.getData().add(new XYChart.Data("2018", 21049466.45));
        series1Line.getData().add(new XYChart.Data("2019", 20886957.35));
        series1Line.getData().add(new XYChart.Data("2020", 20724448.25));
        series1Line.getData().add(new XYChart.Data("2021", 20561939.16));

        series2Line.setName("Africa");
        series2Line.getData().add(new XYChart.Data("2017", 10694839));
        series2Line.getData().add(new XYChart.Data("2018", 10763424));
        series2Line.getData().add(new XYChart.Data("2019", 10840634));
        series2Line.getData().add(new XYChart.Data("2020", 11390416));
        series2Line.getData().add(new XYChart.Data("2021", 12038022));
    
        
        series3Line.setName("Oceana");
        series3Line.getData().add(new XYChart.Data("2017", 270970));
        series3Line.getData().add(new XYChart.Data("2018", 271264));
        series3Line.getData().add(new XYChart.Data("2019", 280924));
        series3Line.getData().add(new XYChart.Data("2020", 278401));
        series3Line.getData().add(new XYChart.Data("2021", 289468));
        

        series4Line.setName("Latin America and the Caribbean");
        series4Line.getData().add(new XYChart.Data("2017", 4104061));
        series4Line.getData().add(new XYChart.Data("2018", 4190846));
        series4Line.getData().add(new XYChart.Data("2019", 4257246));
        series4Line.getData().add(new XYChart.Data("2020", 5066101));
        series4Line.getData().add(new XYChart.Data("2021", 5534706));

        series5Line.setName("Northern America");
        series5Line.getData().add(new XYChart.Data("2017", 3049504));
        series5Line.getData().add(new XYChart.Data("2018", 3064891));
        series5Line.getData().add(new XYChart.Data("2019", 3063270));
        series5Line.getData().add(new XYChart.Data("2020", 3544380));
        series5Line.getData().add(new XYChart.Data("2021", 3579160));

        series6Line.setName("Europe");
        series6Line.getData().add(new XYChart.Data("2017", 8076159));
        series6Line.getData().add(new XYChart.Data("2018", 8112356));
        series6Line.getData().add(new XYChart.Data("2019", 8020246));
        series6Line.getData().add(new XYChart.Data("2020", 9119281));
        series6Line.getData().add(new XYChart.Data("2021", 9656398));

        lineChart.getData().addAll(series1Line, series2Line, series3Line, series4Line, series5Line, series6Line);
        lineChart.setAnimated(false);
        return lineChart;
    }
    /**
     * checkboxes for the line graph
     * @param box4 check box for Asia
     * @param box5 check box for Africa
     * @param box6 check box for Oceana
     * @param box7 check box for Latin America
     * @param box8 check box for Northern America
     * @param box9 check box for Europe
     */
    private void handleOptionsLine(CheckBox box4, CheckBox box5, CheckBox box6, CheckBox box7, CheckBox box8, CheckBox box9) {
        lineChart.getData().clear();
        if(box4.isSelected() == true){ 
            lineChart.getData().add(series1Line);
            
        
        } else if(box4.isSelected() == false){
                lineChart.getData().remove(series1Line);
    
            }
    
        if(box5.isSelected()) {
            lineChart.getData().add(series2Line);
    
        }else if(box5.isSelected() == false){
            lineChart.getData().remove(series2Line);
    
        }
        if(box6.isSelected()) {
            lineChart.getData().add(series3Line);
        }
        else if (box6.isSelected() == false) {
            lineChart.getData().remove(series3Line);
        
        }
        if(box7.isSelected()) {
            lineChart.getData().add(series4Line);
        }
        else if (box7.isSelected() == false) {
            lineChart.getData().remove(series4Line);
        
        }
        if(box8.isSelected()) {
            lineChart.getData().add(series5Line);
        }
        else if (box8.isSelected() == false) {
            lineChart.getData().remove(series5Line);
        
        }
        if(box9.isSelected()) {
            lineChart.getData().add(series6Line);
        }
        else if (box9.isSelected() == false) {
            lineChart.getData().remove(series6Line);
        
        }
        
        return;
    }

    //display a tab
    @Override 
    public void start(Stage primaryStage) throws Exception {
        
        //tab pane
        TabPane tabPane = new TabPane();
        tabPane.setSide(Side.TOP);
        BorderPane root = new BorderPane();

        //barchart checkboxes
        CheckBox box1 = new CheckBox("2000");
        CheckBox box2 = new CheckBox("2010");
        CheckBox box3 = new CheckBox("2020");

        
        //bargraph tab
        Tab tab1 = new Tab("Chart #1: Bar Chart");
        tab1.setClosable(false);
        Button checkButton = new Button("Load");
        checkButton.setOnAction(e -> handleOptions(box1,box2,box3));
        VBox layout1 = new VBox(5);
        layout1.setBackground(new Background(new BackgroundFill(Color.rgb(154, 218, 231),CornerRadii.EMPTY, Insets.EMPTY)));;
        layout1.setPadding(new Insets(20,20,20,20));
        layout1.getChildren().addAll(box1, box2, box3, barChart(), checkButton);
        tab1.setContent(layout1);
        tabPane.getTabs().add(tab1);

        //linechart checkboxes
        CheckBox box4 = new CheckBox("Asia");
        CheckBox box5 = new CheckBox("Africa");
        CheckBox box6 = new CheckBox("Oceana");
        CheckBox box7 = new CheckBox("Latin America and the Caribbean");
        CheckBox box8 = new CheckBox("Northern America");
        CheckBox box9 = new CheckBox("Europe");
            
        //linechart tab
        Tab tab2 = new Tab("Chart #2: Line Chart");
        tab2.setClosable(false);
        Button helpButton = new Button("Refresh");
        helpButton.setOnAction(e -> handleOptionsLine(box4,box5,box6, box7,box8,box9));
        VBox layout2 = new VBox(20);
        layout2.setPadding(new Insets(20,20,20,20));
        layout2.getChildren().addAll(box4, box5, box6, box7,box8,box9, LineChart(), helpButton);
        tab2.setContent(layout2);
        tab2.setContent(layout2);
        tabPane.getTabs().add(tab2);
        Scene scene2 = new Scene(layout1, 600, 600);

        root.setCenter(tabPane);
        //display
        primaryStage.setTitle("Data Visualization CPT - Cheryl Lee"); 
        primaryStage.setScene(new Scene(root));
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();

        
    
        
    }

  /**
   * Java main for when running without JavaFX launcher
   */
  public static void main(String[] args) {
        System.out.println("Hello! Welcome to the database");   
        launch(args);

    }
  
  
}

