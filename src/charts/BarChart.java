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
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;

public class BarChart extends Application{

    //Variables needed
    private BarChart barChart;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
    private XYChart.Series<String, Number> series1;
    private XYChart.Series<String, Number> series2;
    private XYChart.Series<String, Number> series3;

    //Checkboxes
    CheckBox checkBox1 = new CheckBox("2000");
    CheckBox checkBox2 = new CheckBox("Hindi");
    CheckBox checkBox3 = new CheckBox("Telugu");

    
}
