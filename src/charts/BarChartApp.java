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
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

 
 
/**
 * A chart that displays rectangular bars with heights indicating data values
 * for categories. Used for displaying information when at least one axis has
 * discontinuous or discrete data.
 */
public class BarChartApp extends Application {
 
    private BarChart barChart;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
 
    public Parent barChart(){

      String[] country = {"Asia", "Africa", "Latin America", "Northern America and the Caribbean", "Oceana", "Europe"};
      yAxis = new NumberAxis("number of deaths", 0, 25000000, 10000000);
      xAxis = new CategoryAxis();
      xAxis.setCategories(FXCollections.<String>observableArrayList(country));

     
    }
 
    @Override public void start(Stage primaryStage) throws Exception {
      Scene scene  = new Scene(barChart(),850,650);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    /**
     * Java main for when running without JavaFX launcher
     */
    public static void main(String[] args) {
        launch(args);
    }
}