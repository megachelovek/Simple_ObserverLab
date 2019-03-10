package sample;

import javafx.application.Application;
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


public class Main extends Application implements MouseListener {
    private static final String standart = "file:src\\picture\\standart.png";
    private static final String leftEye = "file:src\\picture\\leftEye.png";
    private static final String rightEye = "file:src\\picture\\rightEye.png";
    private static final String mouth = "file:src\\picture\\mouth.png";
    private static final String nose = "file:src\\picture\\nose.png";

    @Override
    public void start(Stage stage) throws Exception{
        Image image = new Image(standart);

        ImageView imageView = new ImageView(image);
        imageView.setX(0);
        imageView.setY(0);
        imageView.setFitHeight(250);
        imageView.setFitWidth(250);

        imageView.setPreserveRatio(true);
        Group root = new Group(imageView);
        imageView.addEventHandler(MouseListener);
        Scene scene = new Scene(root, 250, 250);
        stage.setTitle("ObserverTest");
        stage.setScene(scene);

        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
        blankArea.addMouseListener(this);
        addMouseListener();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}