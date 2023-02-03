package charts;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.Axis;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*public class LineGraph extends Application{
    
    private LineChart chart;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
    XYChart.Series series2Line = new XYChart.Series();
    XYChart.Series series3Line = new XYChart.Series();
    XYChart.Series series1Line = new XYChart.Series();
    XYChart.Series series6Line = new XYChart.Series();
    XYChart.Series series5Line = new XYChart.Series();
    XYChart.Series series4Line = new XYChart.Series();

    public Parent LineChart(){
        String[] years = {"2017", "2018", "2019", "2020", "2021",};
        FXCollections.<String>observableArrayList(years);

        final LineChart<Number,Number> chart = 
        chart.setTitle("Number of Deaths per Region in the past 5 years");
        xAxis = new CategoryAxis();
        yAxis = new NumberAxis();
        xAxis.setLabel("Years");
        yAxis.setLabel("number of deaths");



        series1Line.setName("Oceana");
        series1Line.getData().add(new XYChart.Data(years[0], 270970));
        series1Line.getData().add(new XYChart.Data(years[1], 271264));
        series1Line.getData().add(new XYChart.Data(years[2], 280924));
        series1Line.getData().add(new XYChart.Data(years[3], 278401));
        series1Line.getData().add(new XYChart.Data(years[4], 289468)); 

   
        series2Line.setName("Oceana");
        series2Line.getData().add(new XYChart.Data(years[0], 270970));
        series2Line.getData().add(new XYChart.Data(years[1], 271264));
        series2Line.getData().add(new XYChart.Data(years[2], 280924));
        series2Line.getData().add(new XYChart.Data(years[3], 278401));
        series2Line.getData().add(new XYChart.Data(years[4], 289468));


        series3Line.setName("Oceana");
        series3Line.getData().add(new XYChart.Data(years[0], 270970));
        series3Line.getData().add(new XYChart.Data(years[1], 271264));
        series3Line.getData().add(new XYChart.Data(years[2], 280924));
        series3Line.getData().add(new XYChart.Data(years[3], 278401));
        series3Line.getData().add(new XYChart.Data(years[4], 289468));


        series4Line.setName("Latin America and the Caribbean (UN)");
        series4Line.getData().add(new XYChart.Data(years[0], 270970));
        series4Line.getData().add(new XYChart.Data(years[1], 271264));
        series4Line.getData().add(new XYChart.Data(years[2], 280924));
        series4Line.getData().add(new XYChart.Data(years[3], 278401));
        series4Line.getData().add(new XYChart.Data(years[4], 289468));


        series5Line.setName("Latin America and the Caribbean (UN)");
        series5Line.getData().add(new XYChart.Data(years[0], 270970));
        series5Line.getData().add(new XYChart.Data(years[1], 271264));
        series5Line.getData().add(new XYChart.Data(years[2], 280924));
        series5Line.getData().add(new XYChart.Data(years[3], 278401));
        series5Line.getData().add(new XYChart.Data(years[4], 289468));


        series6Line.setName("Latin America and the Caribbean (UN)");
        series6Line.getData().add(new XYChart.Data(years[0], 270970));
        series6Line.getData().add(new XYChart.Data(years[1], 271264));
        series6Line.getData().add(new XYChart.Data(years[2], 280924));
        series6Line.getData().add(new XYChart.Data(years[3], 278401));
        series6Line.getData().add(new XYChart.Data(years[4], 289468));

        chart = new LineChart(xAxis,yAxis);
        chart.getData().add(series6Line);
        return chart;
    }*/


    @Override public void start(Stage stage) throws Exception{

        stage.setTitle("Line Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Month");
        final LineChart<String,Number> lineChart = 
        new LineChart<String,Number>(xAxis,yAxis);
       
        lineChart.setTitle("Stock Monitoring, 2010");
                          
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Portfolio 1");
        
        series1.getData().add(new XYChart.Data("Jan", 23));
        series1.getData().add(new XYChart.Data("Feb", 14));
        series1.getData().add(new XYChart.Data("Mar", 15));
        series1.getData().add(new XYChart.Data("Apr", 24));
        series1.getData().add(new XYChart.Data("May", 34));
        series1.getData().add(new XYChart.Data("Jun", 36));
        series1.getData().add(new XYChart.Data("Jul", 22));
        series1.getData().add(new XYChart.Data("Aug", 45));
        series1.getData().add(new XYChart.Data("Sep", 43));
        series1.getData().add(new XYChart.Data("Oct", 17));
        series1.getData().add(new XYChart.Data("Nov", 29));
        series1.getData().add(new XYChart.Data("Dec", 25));
        
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Portfolio 2");
        series2.getData().add(new XYChart.Data("Jan", 33));
        series2.getData().add(new XYChart.Data("Feb", 34));
        series2.getData().add(new XYChart.Data("Mar", 25));
        series2.getData().add(new XYChart.Data("Apr", 44));
        series2.getData().add(new XYChart.Data("May", 39));
        series2.getData().add(new XYChart.Data("Jun", 16));
        series2.getData().add(new XYChart.Data("Jul", 55));
        series2.getData().add(new XYChart.Data("Aug", 54));
        series2.getData().add(new XYChart.Data("Sep", 48));
        series2.getData().add(new XYChart.Data("Oct", 27));
        series2.getData().add(new XYChart.Data("Nov", 37));
        series2.getData().add(new XYChart.Data("Dec", 29));
        
        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Portfolio 3");
        series3.getData().add(new XYChart.Data("Jan", 44));
        series3.getData().add(new XYChart.Data("Feb", 35));
        series3.getData().add(new XYChart.Data("Mar", 36));
        series3.getData().add(new XYChart.Data("Apr", 33));
        series3.getData().add(new XYChart.Data("May", 31));
        series3.getData().add(new XYChart.Data("Jun", 26));
        series3.getData().add(new XYChart.Data("Jul", 22));
        series3.getData().add(new XYChart.Data("Aug", 25));
        series3.getData().add(new XYChart.Data("Sep", 43));
        series3.getData().add(new XYChart.Data("Oct", 44));
        series3.getData().add(new XYChart.Data("Nov", 45));
        series3.getData().add(new XYChart.Data("Dec", 44));
        
        Scene scene  = new Scene(lineChart,800,600);       
        lineChart.getData().addAll(series1, series2, series3);
        
       
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
