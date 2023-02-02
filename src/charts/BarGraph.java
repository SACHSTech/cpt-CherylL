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
import javafx.scene.control.CheckBox;

public class BarGraph extends Application{

    //variables needed
    private BarChart<Number,String> bc;
    private CategoryAxis yAxis;
    private NumberAxis xAxis;
    private XYChart.Series<Number,String> series1 = new XYChart.Series<>();
    private XYChart.Series<Number,String> series2 = new XYChart.Series<>();
    private XYChart.Series<Number,String> series3 = new XYChart.Series<>();
    

    public Parent createGraph() throws IOException {
        
        String [] region = {"Asia (UN)", "Africa (UN)", "Latin America (UN)", "Northern America and the Caribbean (UN)", "Oceana (UN)", "Europe (UN)"};
        FXCollections.<String>observableArrayList(Arrays.asList(region));

        
        bc.setTitle("Number of deaths in each region by decades");
        
        DataFilter dataFilter = new DataFilter();
        xAxis = new NumberAxis();
        yAxis.setLabel("Number of Deaths");
        yAxis = new CategoryAxis();
        xAxis.setLabel("Regions");
        bc = new BarChart<>(xAxis, yAxis);
        

        ArrayList<CountryData> decade1 = dataFilter.yearSel(2000);
        ArrayList<CountryData> decade2 = dataFilter.yearSel(2010);
        ArrayList<CountryData> decade3 = dataFilter.yearSel(2020);

         
        series1.setName("2000");

        for(int i = 0; i< decade1.size(); i++){
            series1.getData().add(new XYChart.Data<Number,String>(decade1.get(i).getDeath(), decade1.get(i).getRegion()));    
                     
        }
        
        
        series2.setName("2010");

        for(int i = 0; i< decade2.size(); i++){
            series2.getData().add(new XYChart.Data<Number,String>(decade2.get(i).getDeath(), decade2.get(i).getRegion()));               
            
        }
        
        
        series3.setName("2010");

        for(int i = 0; i< decade2.size(); i++){
            series3.getData().add(new XYChart.Data<Number,String>(decade3.get(i).getDeath(), decade3.get(i).getRegion()));               
            System.out.println(series3);
        }

        bc.getData().add(series1); 
        bc.getData().add(series3);
        bc.getData().add(series2);
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
