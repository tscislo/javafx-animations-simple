package eu.scislo.mobilenext.controller;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.shape.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;

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
        } else if (animationNo == 2) {
            TranslateTransition translateTransition = new TranslateTransition();
            translateTransition.setNode(this.rect1);
            translateTransition.setDuration(Duration.seconds(10));
            translateTransition.setFromX(0);
            translateTransition.setFromY(0);
            translateTransition.setByX(200);
            translateTransition.setByY(100);
            translateTransition.setCycleCount(Animation.INDEFINITE);
            animation = translateTransition;
        } else if (animationNo == 3) {
            Path path = new Path();
            MoveTo moveTo = new MoveTo(this.rect1.getWidth()/2,this.rect1.getHeight()/2);

            LineTo lineTo = new LineTo();
            lineTo.setX(100);
            lineTo.setY(this.rect1.getHeight()/2);

            Random generator = new Random();
            int i1 = generator.nextInt(400);
            int i2 = generator.nextInt(400) - 400;

            CubicCurveTo sineCurve = new CubicCurveTo(200, i1, 200, i2, 400, 0);

            path.getElements().addAll(moveTo, lineTo, sineCurve);


            PathTransition pathTransition = new PathTransition();
            pathTransition.setNode(rect1);
            pathTransition.setDuration(Duration.seconds(10));
            pathTransition.setPath(path);
            pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
            pathTransition.setCycleCount(Animation.INDEFINITE);
            pathTransition.setAutoReverse(true);
            animation = pathTransition;
        } else if (animationNo == 4) {

        }
    }

}
