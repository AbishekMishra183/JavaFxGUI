package cos.mos.socket.server;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        Button btn1 = new Button("I");
        Button btn2 = new Button("LIKE");
        Button btn3=new Button("watching");
        Button btn4=new Button("football");
        Button btn5=new Button("during");
        Button btn6=new Button("class");

        HBox hBox = new HBox();
        hBox.getChildren().addAll(btn1, btn2,btn3,btn4,btn5,btn6);

        Scene scene = new Scene(hBox, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}