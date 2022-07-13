package com.example.practical_19;

/*
Practical-19:Write a program that displays the color of a circle as red when the mouse button is pressed and as
blue when the mouse button is released.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Date;

public class HelloApplication extends Application
{
    @Override
    public void start(Stage primaryStage) {
        double width = 400;
        double height = 400;
        Circle c = new Circle(width / 2, height / 2, Math.min(width, height) / 10, Color.WHITE);

        c.setStroke(Color.BLACK);

        StackPane pane = new StackPane(c);

        primaryStage.setScene(new Scene(pane, width, height));
        pane.setOnMousePressed(e -> c.setFill(Color.RED));
        pane.setOnMouseReleased(e -> c.setFill(Color.BLUE));
        primaryStage.setTitle("Practical-19 by Suryadip(Click the circle)");
        primaryStage.show();

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 19");
        System.out.println("Aim:- Write a program that displays the color of a circle as red when the mouse button is pressed and as\n" +
                "blue when the mouse button is released.");
        System.out.println("Enrollment No:- 200130107056");
        System.out.println("Name:- Suryadipsinh Vaghela");
        System.out.print("Date and time: ");
        Date date = new Date();
        System.out.println(date);
        System.out.println("*********************");
        System.out.println();
    }

    public static void main(String[] args) {
        launch(args);
    }
}