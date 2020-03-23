package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Group;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Assignments Page");
        GridPane grid = new GridPane();
        grid.setVgap(10.0);
        grid.setPadding(new Insets(30, 30, 30, 30));

        Scene scene = new Scene(grid, 550, 700);
        primaryStage.setScene(scene);

        Text scenetitle = new Text("Assignments");
        scenetitle.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 35));
        grid.add(scenetitle, 0, 0, 1, 1);


        int amountOfAssignments = 5;
        for (int assignmentNumber = 1; assignmentNumber <= amountOfAssignments; assignmentNumber++) {
            int columnIndex = 6;
            int rowIndex = assignmentNumber * 3;

            Label assignment = new Label("Assignment #" + assignmentNumber + ":");
            assignment.setFont((Font.font("Cambria", 25)));
            grid.add(assignment, columnIndex, rowIndex);

            //set date
            DateFormat dueDate = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
            Calendar cal = Calendar.getInstance();

            Label due = new Label("Due: " + dueDate.format(cal.getTime()));
            grid.add(due, columnIndex, rowIndex + 1);


            //ADD BUTTON TO INDICATE ASSIGNMENT IS OPENED
            Button assignmentButton = new Button("OPEN");
            Label assignmentButtonPressed = new Label("Your assignment is: ");
            assignmentButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override public void handle(ActionEvent e) {
                    grid.add(assignmentButtonPressed, 7,rowIndex + 2);
                }
            });
            grid.add(assignmentButton, 6, rowIndex + 2);

            //Try to add a border

            //Try to add an image
            Image assignmentImage = new Image("https://www.learnupon.com/wp-content/uploads/assignments720.png", 150,100, true,true);
            grid.add(new ImageView(assignmentImage), 0, rowIndex, 1,3);
            //Image assignmentImage = new Image("https://i.dlpng.com/static/png/1467425_thumb.png", 100,100, false,false);
            //grid.add(new ImageView(assignmentImage), 0, rowIndex, 1,3);



        }

        primaryStage.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}