package eu.scislo.mobilenext.controller;

import eu.scislo.mobilenext.Animations;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController {

    private Animations main;
    private Stage primaryStage;


    public void setMain(Animations animations) {
        this.main = animations;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @FXML
    public void closeMainWindow() {
        this.primaryStage.close();
    }

    @FXML
    public void imageViewClicked(MouseEvent evt) {
        int col = (int) (evt.getX() / 150);
        int row = (int) (evt.getY() / 150);
        int num = col + 1 + row * 3;
        System.out.println(num);
        if (num == 1) {
            this.showAnimationWindow(num);
        }
    }

    public void showAnimationWindow(int num) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/views/AnimationWindowView.fxml"));
        try {
            AnchorPane pane = fxmlLoader.load();
            Stage animationWindowStage = new Stage();
            animationWindowStage.setTitle("Animation");
            animationWindowStage.initModality(Modality.WINDOW_MODAL);
            animationWindowStage.initOwner(primaryStage);
            animationWindowStage.setMinHeight(500);
            animationWindowStage.setMinWidth(500);
            Scene scene = new Scene(pane);
            animationWindowStage.setScene(scene);
            AnimationWindowController animationWindowController = fxmlLoader.getController();
            animationWindowController.setAnimationWindowStage(animationWindowStage);
            animationWindowController.setAnimationNo(num);
            animationWindowStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
