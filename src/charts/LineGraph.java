package charts;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LineGraph extends Application{
    
    LineChart<String,Number> lineChart;
    private CategoryAxis xAxis;
    private NumberAxis yAxis;
    XYChart.Series series2Line = new XYChart.Series();
    XYChart.Series series3Line = new XYChart.Series();
    XYChart.Series series1Line = new XYChart.Series();
    XYChart.Series series6Line = new XYChart.Series();
    XYChart.Series series5Line = new XYChart.Series();
    XYChart.Series series4Line = new XYChart.Series();

    public Parent LineChart(){
        
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Years");
        lineChart = new LineChart<String,Number>(xAxis,yAxis);
        
        lineChart.setTitle("Number of Deaths in the Past 5 Years in each Region");
                          
        series1Line.setName("Asia");
        series1Line.getData().add(new XYChart.Data("2017", 21211975.55));
        series1Line.getData().add(new XYChart.Data("2018", 21049466.45));
        series1Line.getData().add(new XYChart.Data("2019", 20886957.35));
        series1Line.getData().add(new XYChart.Data("2020", 20724448.25));
        series1Line.getData().add(new XYChart.Data("2021", 20561939.16));

        series2Line.setName("Africa");
        series2Line.getData().add(new XYChart.Data("2017", 10694839));
        series2Line.getData().add(new XYChart.Data("2018", 10763424));
        series2Line.getData().add(new XYChart.Data("2019", 10840634));
        series2Line.getData().add(new XYChart.Data("2020", 11390416));
        series2Line.getData().add(new XYChart.Data("2021", 12038022));
      
        
        series3Line.setName("Oceana");
        series3Line.getData().add(new XYChart.Data("2017", 270970));
        series3Line.getData().add(new XYChart.Data("2018", 271264));
        series3Line.getData().add(new XYChart.Data("2019", 280924));
        series3Line.getData().add(new XYChart.Data("2020", 278401));
        series3Line.getData().add(new XYChart.Data("2021", 289468));
        

        series4Line.setName("Latin America and the Caribbean");
        series4Line.getData().add(new XYChart.Data("2017", 4104061));
        series4Line.getData().add(new XYChart.Data("2018", 4190846));
        series4Line.getData().add(new XYChart.Data("2019", 4257246));
        series4Line.getData().add(new XYChart.Data("2020", 5066101));
        series4Line.getData().add(new XYChart.Data("2021", 5534706));

        series5Line.setName("Northern America");
        series5Line.getData().add(new XYChart.Data("2017", 3049504));
        series5Line.getData().add(new XYChart.Data("2018", 3064891));
        series5Line.getData().add(new XYChart.Data("2019", 3063270));
        series5Line.getData().add(new XYChart.Data("2020", 3544380));
        series5Line.getData().add(new XYChart.Data("2021", 3579160));

        series6Line.setName("Europe");
        series6Line.getData().add(new XYChart.Data("2017", 8076159));
        series6Line.getData().add(new XYChart.Data("2018", 8112356));
        series6Line.getData().add(new XYChart.Data("2019", 8020246));
        series6Line.getData().add(new XYChart.Data("2020", 9119281));
        series6Line.getData().add(new XYChart.Data("2021", 9656398));

        lineChart.getData().addAll(series1Line, series2Line, series3Line, series4Line, series5Line, series6Line);
        lineChart.setAnimated(false);
        return lineChart;
    }

    private void handleOptionsLine(CheckBox box4, CheckBox box5, CheckBox box6, CheckBox box7, CheckBox box8, CheckBox box9) {
        lineChart.getData().clear();
        if(box4.isSelected() == true){ 
            lineChart.getData().add(series1Line);
            
        
        } else if(box4.isSelected() == false){
                lineChart.getData().remove(series1Line);
      
            }
      
        if(box5.isSelected()) {
            lineChart.getData().add(series2Line);
      
        }else if(box5.isSelected() == false){
            lineChart.getData().remove(series2Line);
       
          }
        if(box6.isSelected()) {
            lineChart.getData().add(series3Line);
        }
          else if (box6.isSelected() == false) {
            lineChart.getData().remove(series3Line);
          
        }
        if(box7.isSelected()) {
            lineChart.getData().add(series4Line);
        }
          else if (box7.isSelected() == false) {
                lineChart.getData().remove(series4Line);
          
            }
        if(box8.isSelected()) {
            lineChart.getData().add(series5Line);
        }
          else if (box8.isSelected() == false) {
                lineChart.getData().remove(series5Line);
          
            }
        if(box9.isSelected()) {
            lineChart.getData().add(series6Line);
        }
          else if (box9.isSelected() == false) {
            lineChart.getData().remove(series6Line);
          
        }
        
        return;
    }


    @Override public void start(Stage stage) throws Exception{
        CheckBox box4 = new CheckBox("Asia");
        CheckBox box5 = new CheckBox("Africa");
        CheckBox box6 = new CheckBox("Oceana");
        CheckBox box7 = new CheckBox("Latin America and the Caribbean");
        CheckBox box8 = new CheckBox("Northern America");
        CheckBox box9 = new CheckBox("Europe");
        
        Button helpButton = new Button("Refresh");
        helpButton.setOnAction(e -> handleOptionsLine(box4,box5,box6, box7,box8,box9));
        VBox layout1 = new VBox(20);
        layout1.setPadding(new Insets(20,20,20,20));
        layout1.getChildren().addAll(box4, box5, box6, box7,box8,box9, LineChart(), helpButton);
        Scene scene1 = new Scene(layout1, 600, 600);
        stage.setTitle("Line Chart Sample");       
        
       
        stage.setScene(scene1);
        stage.show();
    }

   


    public static void main(String[] args) {
        launch(args);
    }
}
