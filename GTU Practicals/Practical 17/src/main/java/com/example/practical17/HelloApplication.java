package com.example.practical17;
/*
Practical-17: Write a program that displays a tic-tac-toe board. A cell may be X, O, or empty. What to display at
each cell is randomly decided. The X and O are images in the files X.gif and O.gif.
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import java.io.IOException;
import java.util.Date;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        primaryStage.setTitle("Tic-Tac-Toe by Suryadip");

        GridPane gridPane = new GridPane();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                int n = (int) (Math.random() * 3);

                if (n == 0)
                    gridPane.add(createX(), i, j);
                else if (n == 1)
                    gridPane.add(createO(), i, j);
                else
                    continue;
            }
        }
        Scene primaryScene = new Scene(gridPane, 400, 400);
        primaryStage.setScene(primaryScene);
        primaryStage.show();

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 17");
        System.out.println("Aim:- Practical-17: Write a program that displays a tic-tac-toe board. A cell may be X, O, or empty. What to display at\n" +
                "each cell is randomly decided. The X and O are images in the files X.gif and O.gif.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();
    }

    public VBox createX() {
        Image imageX = new Image("C:\\Users\\Dell\\Downloads\\x.gif");
        ImageView imageViewX = new ImageView(imageX);
        VBox xBox = setProp(imageViewX);
        return xBox;
    }

    public VBox createO() {
        Image imageO = new Image("C:\\Users\\Dell\\Downloads\\O.gif");
        ImageView imageViewO = new ImageView(imageO);
        VBox oBox = setProp(imageViewO);
        return oBox;
    }

    public VBox setProp(ImageView iv) {
        iv.setFitHeight(50);
        iv.setFitWidth(50);
        iv.setPreserveRatio(true);
        VBox vBox = new VBox();
        vBox.getChildren().add(iv);
        vBox.setStyle("-fx-border-color: green");
        return vBox;
    }

    public static void main(String[] args) {
        launch(args);
    }

}