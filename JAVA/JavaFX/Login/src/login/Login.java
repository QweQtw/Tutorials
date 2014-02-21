/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

/**
 *
 * @author VCLERK
 */
public class Login extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane grid = getGrid();
        grid.add(new Label("User Name:"), 0, 1);
        grid.add(new TextField(), 1, 1);
        grid.add(new Label("Password:"), 0,2);
        grid.add(new PasswordField(),1,2);
        Group root = new Group();
        
        Group circles = new Group();
        for (int i = 0; i < 30; i++) {
   Circle circle = new Circle(100+i*10, Color.web("black", 0.05));
   circle.setStrokeType(StrokeType.OUTSIDE);
   circle.setStroke(Color.web("black", 0.16));
   circle.setStrokeWidth(4);
   circles.getChildren().add(circle);
    }
        root.getChildren().add(circles);
        grid.add(root, 0, 3);

        Scene scene = new Scene(grid, 320, 200);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane getGrid()
    {
        GridPane mainGrid = new GridPane();
        mainGrid.setAlignment(Pos.CENTER);
        mainGrid.setHgap(8);
        mainGrid.setVgap(8);
        mainGrid.setPadding(new Insets(16,16,16,16));
        return mainGrid;
    }
    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
