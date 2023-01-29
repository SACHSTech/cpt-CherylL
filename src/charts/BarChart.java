package charts;

import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;

public class BarChart extends Application{

    //Variables needed
    private BarChart barChart;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
    private XYChart.Series<String, Number> series1;
    private XYChart.Series<String, Number> series2;
    private XYChart.Series<String, Number> series3;
    private ArrayList<CountryData> yearChoice;
    

    public Parent createContent() throws IOException{

        String[] country = {"Asia", "Africa", "Latin America", "Northern America and the Caribbean", "Oceana", "Europe"};
        CheckBox<String> cb = new CheckBox<String>();

        DataInteraction DataInteraction = new DataInteraction();

        // Testing ArrayList
        ArrayList<DataReader> listYear = new ArrayList<DataReader>();
        
        //Checkboxes
        CheckBox checkBox1 = new CheckBox("2000");
        CheckBox checkBox2 = new CheckBox("2010");
        CheckBox checkBox3 = new CheckBox("2020");

        yearChoice = DataFilter.regionName(String.valueOf(cb.getValue()));
    }
    

    
}
