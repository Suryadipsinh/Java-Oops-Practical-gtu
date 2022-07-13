package com.example.practical_18;

/*
Practical-18:Write a program that moves a circle up, down, left or right using arrow keys.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import java.util.Date;

public class HelloApplication extends Application
{
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setPadding(new Insets(30, 30, 30, 30));
        Circle circle = new Circle(30, 30, 30);
        pane.getChildren().add(circle);

        pane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case UP : circle.setCenterY(circle.getCenterY() >
                        circle.getRadius() ? circle.getCenterY() - 15 :
                        circle.getCenterY()); break;
                case DOWN : circle.setCenterY(circle.getCenterY() <
                        pane.getHeight() - circle.getRadius() ?
                        circle.getCenterY() + 15 : circle.getCenterY());
                    break;
                case LEFT : circle.setCenterX(circle.getCenterX() >
                        circle.getRadius() ? circle.getCenterX() - 15 :
                        circle.getCenterX()); break;
                case RIGHT : circle.setCenterX(circle.getCenterX() <
                        pane.getWidth() - circle.getRadius() ?
                        circle.getCenterX() + 15: circle.getCenterX());
            }
        });

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Practical:- 18 by Suryadip");
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.requestFocus();

        //driver code by Suryadip
        System.out.println("*********************");
        System.out.println("Practical No:- 18");
        System.out.println("Aim:- Write a program that moves a circle up, down, left or right using arrow keys.");
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