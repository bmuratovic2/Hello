package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label hello;
    public Label labela;

    public void submit (ActionEvent actionEvent){
        hello.setText("Hi!");
    }

    public void ispisi(ActionEvent actionEvent) {
        labela.setText("hello world");
    }
}