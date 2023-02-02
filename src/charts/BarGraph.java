package charts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

import cpt.CountryData;
import cpt.DataFilter;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;

public class BarGraph extends Application{

    //variables needed
    private BarChart<String, Double> barChart;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
    private ArrayList<CountryData> yearList;
    private XYChart.Series<String, Double> series1;
    private XYChart.Series<String, Double> series2;
    private XYChart.Series<String, Double> series3;

    public Parent createGraph() throws IOException{
       
        String[] region = {"Asia (UN)", "Africa (UN)", "Latin America (UN)", "Northern America and the Caribbean (UN)", "Oceana (UN)", "Europe (UN)"};
        DataFilter DataFilter = new DataFilter();
        
        yAxis.setLabel("Number of Deaths");
        xAxis.setLabel("Regions");
        

        ArrayList<CountryData> decade1 = DataFilter.yearSel(2000);
        ArrayList<CountryData> decade2 = DataFilter.yearSel(2010);
        ArrayList<CountryData> decade3 = DataFilter.yearSel(2020);

        FXCollections.<String>observableArrayList(region);
        
        FXCollections.observableArrayList(region);

       
        series1 = new XYChart.Series<>();
        series1.setName("2000");

        for(int i = 0; i< yearList.size(); i++){
            series1.getData().add(
            new XYChart.Data<String, Double>(decade1.get(i).getRegion(), decade1.get(i).getDeath()));    
            System.out.println(series1);            
        }

        barChart.setPrefHeight(600);
        barChart.setPrefWidth(500);
        return barChart;
        
    }   
    


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createGraph()));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    

    
}
