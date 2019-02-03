package eu.scislo.mobilenext.controller;

import eu.scislo.mobilenext.Animations;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MainWindowController {

    private Animations main;
    private Stage primaryState;


    public void setMain(Animations animations) {
        this.main = animations;
    }

    public void setPrimaryState(Stage primaryState) {
        this.primaryState = primaryState;
    }

    @FXML
    public void closeMainWindow() {
        this.primaryState.close();
    }

    @FXML
    public void imageViewClicked(MouseEvent evt) {
        int col = (int) (evt.getX() / 150);
        int row = (int) (evt.getY() / 150);
        int num = col + 1 + row * 3;
        System.out.println(num);
    }

}
