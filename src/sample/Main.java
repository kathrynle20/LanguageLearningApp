package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Group;
import java.text.SimpleDateFormat;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Assignments Page");
        GridPane grid = new GridPane();
        grid.setVgap(10.0);
        grid.setPadding(new Insets(25, 25, 25, 25));

        FlowPane pane = new FlowPane(10, 10);
        pane.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));

        Scene scene = new Scene(grid, 350, 500);
        primaryStage.setScene(scene);

        Text scenetitle = new Text("Assignments");
        scenetitle.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 1, 1);

        int amountOfAssignments = 5;
        for (int assignmentNumber = 1; assignmentNumber <= amountOfAssignments; assignmentNumber++) {
            int columnIndex = 5;
            int rowIndex = assignmentNumber * 2;

            Label assignment = new Label("Assignment #" + assignmentNumber + ":");
            grid.add(assignment, columnIndex, rowIndex);

            Label dueDate = new Label("Due:");
            grid.add(dueDate, columnIndex, rowIndex + 1);

            //ADD BUTTON TO INDICATE ASSIGNMENT IS OPENED
            Button assignmentButton = new Button();

            //Try to add a border

            //Try to add an image



            //add a due date using SimpleDataFormat


        }

        primaryStage.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}