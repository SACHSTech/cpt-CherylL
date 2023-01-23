/* ....Show License.... */
package charts;
 
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage;
import java.io.*;
 
 
/**
 * A chart that displays rectangular bars with heights indicating data values
 * for categories. Used for displaying information when at least one axis has
 * discontinuous or discrete data.
 */
public class BarChartApp extends Application {
 
    private BarChart barChart;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
 
    public void barChart(){

      xAxis = new CategoryAxis();
      xAxis.setLabel("Years");
      yAxis = new NumberAxis();
      yAxis.setLabel("Number of Deaths");

      BarChart barChart = new BarChart(xAxis, yAxis);


      return barChart;
    }
    public Parent createContent() {


    }
 
    @Override public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(barChart()));
        primaryStage.show();
    }
 
    /**
     * Java main for when running without JavaFX launcher
     */
    public static void main(String[] args) {
        launch(args);
    }
}