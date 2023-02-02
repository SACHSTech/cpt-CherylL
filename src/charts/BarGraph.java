package charts;

import java.io.IOException;
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
    private XYChart.Series<String, Double> series1;
    private XYChart.Series<String, Double> series2;
    private XYChart.Series<String, Double> series3;

    public Parent createGraph() throws IOException {
       
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

        series2 = new XYChart.Series<>();
        series2.setName("2010");

        for(int i = 0; i< decade2.size(); i++){
            series1.getData().add(
            new XYChart.Data<String, Double>(decade2.get(i).getRegion(), decade2.get(i).getDeath()));    
            System.out.println(series2);            
        }


        barChart.getData().add(series1);
        barChart.getData().add(series2);
        return barChart;
        
    }   
    


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createGraph()));
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
    

    
}
