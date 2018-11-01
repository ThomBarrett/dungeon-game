
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Window extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Dungeon Game!");
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500, Color.BLUE);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        //Launches the window and calls the Overrided start method
        launch(args);
    }
}
