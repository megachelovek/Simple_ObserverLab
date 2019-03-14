package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.BoxBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;


public class Main extends Application  {
    private static final String standart = "file:src\\picture\\standart.png";
    private static final String leftEye = "file:src\\picture\\leftEye.png";
    private static final String rightEye = "file:src\\picture\\rightEye.png";
    private static final String mouth = "file:src\\picture\\mouth.png";
    private static final String nose = "file:src\\picture\\nose.png";

    private static ImageView imageView;
    private static Image image;
    private static String current = standart;
    private static Scene scene;

    @Override
    public void start(Stage stage) throws Exception{
        image = new Image(standart);
        current =standart;
        imageView = new ImageView(image);
        imageView.setX(0);
        imageView.setY(0);
        imageView.setFitHeight(250);
        imageView.setFitWidth(250);

        imageView.setPreserveRatio(true);
        Group root = new Group(imageView);
        imageView.setOnMouseClicked(click -> {
            UpdateImage(click.getX(),click.getY());
        } );
        scene = new Scene(root, 250, 250);
        stage.setTitle("ObserverTest");
        stage.setScene(scene);

        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }

    private static void UpdateImage(double x,double y){
        if ( 40<x && x<95 && 40<y && y<95 ) {
            if (current == standart){
                leftEye();
            }else{
                standart();
            }
        }
        if ( 128<x && x<180 && 50<y && y<105 ) {
            if (current == standart){
                rightEye();
            }else{
                standart();
            }
        }
        if ( 95<x && x<130 && 100<y && y<155 ) {
            if (current == standart){
                nose();
            }else{
                standart();
            }
        }
        if ( 60<x && x<180 && 180<y && y<218 ) {
            if (current == standart){
                mouth();
            }else{
                standart();
            }
        }

    }

    private static void leftEye(){
        image = new Image(leftEye);
        imageView.setImage(image);
        current= leftEye;
    }

    private static void standart(){
        image = new Image(standart);
        imageView.setImage(image);
        current= standart;
    }

    private static void rightEye(){
        image = new Image(rightEye);
        imageView.setImage(image);
        current= rightEye;
    }

    private static void mouth(){
        image = new Image(mouth);
        imageView.setImage(image);
        current= mouth;
    }

    private static void nose(){
        image = new Image(nose);
        imageView.setImage(image);
        current= nose;
    }

}
