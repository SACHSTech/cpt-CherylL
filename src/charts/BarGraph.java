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
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
    private BarChart<String, Number> barChart;
    private XYChart.Series<String, Number> series1;
    private XYChart.Series<String, Number> series2;
    private XYChart.Series<String, Number> series3;
    private ArrayList<CountryData> listYear = new ArrayList<CountryData>();
    
    public Parent createContent() throws IOException{

        String[] country = {"Asia", "Africa", "Latin America", "Northern America and the Caribbean", "Oceana", "Europe"};
        DataFilter Datafiles = new DataFilter();
        //ArrayList<CountryData> listYear = new ArrayList<CountryData>();
        ChoiceBox<String> cb = new ChoiceBox<String>();

        cb.getItems().add("2000");
        cb.getItems().add("2010");
        cb.getItems().add("2020");

        listYear = DataFilter.yearSel(Integer.valueOf(cb.getValue()));

        FXCollections.<String>observableArrayList(Arrays.asList(country));
        yAxis = new NumberAxis();
        xAxis = new CategoryAxis();
        
       
        yAxis.setLabel("Regions");
        xAxis.setLabel("Number of Deaths");
    
        series1 = new XYChart.Series<>();
        series1.setName("2000");

        for(int i = 0; i < listYear.size(); i++){
    
            series1.getData().add(new XYChart.Data<String, Number>(listYear.get(i).getRegion() ,listYear.get(i).getDeath()));
            System.out.println(listYear);
        }

        barChart.getData().add(series1);
        barChart.setTitle("Number of deaths in each region by decades");
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
