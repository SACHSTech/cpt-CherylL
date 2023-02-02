package charts;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class LineGraph extends Application{
    
    private LineChart chart;
    static boolean PCselectedAsia = false;
    static boolean PCselectedOceana = false;
    static boolean PCselectedEurope = false;
    static boolean PCselectedLatin = false;
    static boolean PCselectedNorth = false;
    static boolean PCselectedAfrica = false;

    

    @Override public void start(Stage stage) {


        stage.setTitle("Line Graph");
        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Years");
        yAxis.setLabel("number of deaths");
       
        /*public static ObservableList<LineChart.Data> generateData(){

            if(PCselectedAsia = true){
                final LineChart<Number,Number> lineChart = 
                new LineChart<Number,Number>(xAxis,yAxis);
        
                lineChart.setTitle("Number of Deaths per Region in the past 5 years");
                XYChart.Series series1 = new XYChart.Series();
                series1.setName("Asia (UN)");
                series1.getData().add(new XYChart.Data(1, 23));
                series1.getData().add(new XYChart.Data(2, 14));
                series1.getData().add(new XYChart.Data(3, 15));
                series1.getData().add(new XYChart.Data(4, 24));
                series1.getData().add(new XYChart.Data(5, 34));
            }

            if(PCselectedOceana = true){
                final LineChart<Number,Number> lineChart = 
                new LineChart<Number,Number>(xAxis,yAxis);
        
                lineChart.setTitle("Number of Deaths per Region in the past 5 years");
        
                XYChart.Series series2 = new XYChart.Series();
                series2.setName("My portfolio");
                series2.getData().add(new XYChart.Data(1, 23));
                series2.getData().add(new XYChart.Data(2, 14));
                series2.getData().add(new XYChart.Data(3, 15));
                series2.getData().add(new XYChart.Data(4, 24));
                series2.getData().add(new XYChart.Data(5, 34));
            }

            if(PCselectedEurope = true){
                final LineChart<Number,Number> lineChart = 
                new LineChart<Number,Number>(xAxis,yAxis);
        
                lineChart.setTitle("Number of Deaths per Region in the past 5 years");
        
                XYChart.Series series3 = new XYChart.Series();
                series3.setName("My portfolio");
                series3.getData().add(new XYChart.Data(1, 23));
                series3.getData().add(new XYChart.Data(2, 14));
                series3.getData().add(new XYChart.Data(3, 15));
                series3.getData().add(new XYChart.Data(4, 24));
                series3.getData().add(new XYChart.Data(5, 34));
            }

            if(PCselectedLatin = true){
                final LineChart<Number,Number> lineChart = 
                new LineChart<Number,Number>(xAxis,yAxis);
        
                lineChart.setTitle("Number of Deaths per Region in the past 5 years");
        
                XYChart.Series series = new XYChart.Series();
                series.setName("Latin America (UN)");
                series.getData().add(new XYChart.Data(1, 23));
                series.getData().add(new XYChart.Data(2, 14));
                series.getData().add(new XYChart.Data(3, 15));
                series.getData().add(new XYChart.Data(4, 24));
                series.getData().add(new XYChart.Data(5, 34));
            }
        }*/

        //creating the chart
        final LineChart<Number,Number> lineChart = 
        new LineChart<Number,Number>(xAxis,yAxis);
        
        lineChart.setTitle("Number of Deaths per Region in the past 5 years");
        
        XYChart.Series series = new XYChart.Series();
        series.setName("My portfolio");

        //populating the series with data
    
        series.getData().add(new XYChart.Data(1, 23));
        series.getData().add(new XYChart.Data(2, 14));
        series.getData().add(new XYChart.Data(3, 15));
        series.getData().add(new XYChart.Data(4, 24));
        series.getData().add(new XYChart.Data(5, 34));
        series.getData().add(new XYChart.Data(6, 36));
        series.getData().add(new XYChart.Data(7, 22));
        series.getData().add(new XYChart.Data(8, 45));
        series.getData().add(new XYChart.Data(9, 43));
        series.getData().add(new XYChart.Data(10, 17));
        series.getData().add(new XYChart.Data(11, 29));
        series.getData().add(new XYChart.Data(12, 25));

        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(series);
       
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
