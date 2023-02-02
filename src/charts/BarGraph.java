package charts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import charts.DataFilter;
import charts.CountryData;
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
    private BarChart barChart;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
    private ArrayList<CountryData> yearList;

    public Parent BarGraph() throws IOException{
       
        String[] region = {"Asia", "Africa", "Latin America", "Northern America and the Caribbean", "Oceana", "Europe"};
        DataFilter DataFilter = new DataFilter();
        
        ChoiceBox<String> cb = new ChoiceBox<String>();

        cb.getItems().add("2000");
        cb.getItems().add("2010");
        cb.getItems().add("2020");

        yearList = DataFilter.yearSel(String.valueOf(cb.getValue()));

        FXCollections.<String>observableArrayList(Arrays.asList(region));
        barChart.setTitle("Vaccine Preventable Diseases Deaths");
        yAxis.setLabel("Number of Deaths");
        xAxis.setLabel("Regions");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("2000");

        for(int i = 0; i< yearList.size(); i++){
            series1.getData().add(
            new XYChart.Data<String, Double>(yearList.get(i).getRegion(), yearList.get(i).getDeath()));                
        }

        barChart.getData().add(series1);

        return barChart;

        
    }
    

       
    


    @Override
    public void start(Stage primaryStage) throws Exception {
        //primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    

    
}
