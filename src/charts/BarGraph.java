package charts;

import java.io.IOException;
import java.util.*;


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

import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;

public class BarGraph extends Application{

    //variables needed
    private BarChart<String,Number> bc;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
    private XYChart.Series series1;
    private XYChart.Series series2;
    private XYChart.Series series3;

    public Parent createGraph() throws IOException {
       
        String [] region = {"Asia (UN)", "Africa (UN)", "Latin America (UN)", "Northern America and the Caribbean (UN)", "Oceana (UN)", "Europe (UN)"};
        DataFilter dataFilter = new DataFilter();
        yAxis = new NumberAxis();
        yAxis.setLabel("Number of Deaths");
        xAxis = new CategoryAxis();
        xAxis.setCategories(FXCollections.<String>observableArrayList(region));
        xAxis.setLabel("Regions");
        

        ArrayList<CountryData> decade1 = dataFilter.yearSel(2000);
        ArrayList<CountryData> decade2 = dataFilter.yearSel(2010);
        ArrayList<CountryData> decade3 = dataFilter.yearSel(2020);
       

        FXCollections.<String>observableArrayList(Arrays.asList(region));

        series1 = new XYChart.Series();
        series1.setName("2000");

        for(int i = 0; i< decade1.size(); i++){
            series1.getData().add(new XYChart.Data(decade1.get(i).getRegion(), decade1.get(i).getDeath()));    
                      
        }
        
        series2 = new XYChart.Series();
        series2.setName("2010");

        for(int i = 0; i< decade2.size(); i++){
            series2.getData().add(new XYChart.Data(decade2.get(i).getRegion(), decade2.get(i).getDeath()));               
        }
        
        series3 = new XYChart.Series();
        series3.setName("2010");

        for(int i = 0; i< decade2.size(); i++){
            series3.getData().add(new XYChart.Data(decade3.get(i).getRegion(), decade3.get(i).getDeath()));               
        }

        bc.getData().addAll(series1, series2, series3);
        //bc.getData().add(series2);
        //bc.getData().add(series3);
        System.out.println(decade2);
        bc.setTitle("Number of deaths in each region by decades");
        bc = new BarChart<String,Number>(xAxis,yAxis);
        return bc;
        
    }   
    


    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene  = new Scene(bc,800,600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
    

    
}
