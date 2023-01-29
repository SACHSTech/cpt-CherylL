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

    //Variables needed
    private NumberAxis xAxis;
    private CategoryAxis yAxis;
    BarChart<Number,String> barChart = new BarChart<Number,String>(xAxis,yAxis);
    private XYChart.Series<Number, String> series1;
    private XYChart.Series<Number, Number> series2;
    private XYChart.Series<Number, Number> series3;
    private ArrayList<CountryData> yearChoice;
    ArrayList<CountryData> listYear = new ArrayList<CountryData>();
    

    public Parent createContent() throws IOException{

        String[] country = {"Asia", "Africa", "Latin America", "Northern America and the Caribbean", "Oceana", "Europe"};

        DataFilter DataInteraction = new DataFilter();
        
        ChoiceBox<String> cb = new ChoiceBox<String>();

        cb.getItems().add("2000");
        cb.getItems().add("2010");
        cb.getItems().add("2020");

        listYear = DataInteraction.yearSel(Integer.valueOf(cb.getValue()));

        FXCollections.<String>observableArrayList(Arrays.asList(country));
        xAxis = new NumberAxis();
        yAxis = new CategoryAxis();
        
       
        yAxis.setLabel("Regions");
        xAxis.setLabel("Number of Deaths");
    
        series1 = new XYChart.Series<>();
        series1.setName("2000");

        for(int i = 0; i < listYear.size(); i++){
            series1.getData().add(
            new XYChart.Data<Number, String>(listYear.get(i).getDeath(), (listYear.get(i).getRegion())));
            
        }

        barChart.getData().add(series1);
        barChart.setTitle("Number of deaths in each region by decades");
        barChart = new BarChart(xAxis, yAxis);
        return barChart;
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    

    
}
