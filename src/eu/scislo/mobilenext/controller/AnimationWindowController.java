package eu.scislo.mobilenext.controller;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationWindowController {

    private Stage animationWindowStage;
    private int animationNo;
    private Animation animation;

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
        this.prepareAnimation();
    }

    @FXML
    public void closeWindow() {
        this.animationWindowStage.close();
    }

    @FXML
    public void play() {
        animation.play();
    }

    @FXML
    public void pause() {
        animation.pause();
    }

    @FXML
    public void stop() {
        animation.stop();
    }

    private void prepareAnimation() {
        if (animationNo == 1) {
            RotateTransition transition = new RotateTransition();
            transition.setNode(this.rect1);
            transition.setDuration(Duration.seconds(10));
            transition.setFromAngle(0);
            transition.setToAngle(360);
            transition.setCycleCount(Animation.INDEFINITE);
            animation = transition;
        }
    }

}
