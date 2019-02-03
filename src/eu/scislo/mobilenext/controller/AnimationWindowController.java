package eu.scislo.mobilenext.controller;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class AnimationWindowController {

    private Stage animationWindowStage;
    private int animationNo;

    @FXML
    Rectangle rect1;

    @FXML
    Rectangle rect2;

    @FXML
    Circle circle;


    public void setAnimationWindowStage(Stage animationWindowStage) {
        this.animationWindowStage = animationWindowStage;
    }


    public void setAnimationNo(int animationNo) {
        this.animationNo = animationNo;
    }

    @FXML
    public void closeWindow() {
        this.animationWindowStage.close();
    }

    @FXML
    public void play() {

    }

    @FXML
    public void pause() {

    }

    @FXML
    public void stop() {

    }

}
