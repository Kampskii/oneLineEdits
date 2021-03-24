package sample;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    public TextField textField1;
    public Button saveButton;
    public TextArea bigTextBoi;
    public ListView listboi;

    public void userSavedText() {
        String textToSave1 = textField1.getText();
        bigTextBoi.setText(textToSave1);
        bigTextBoi.setDisable(false);
        textField1.setText("");
        saveButton.setText("Saved :)");
        saveButton.setDisable(true);

        listboi.getItems().add(textToSave1);
    }
}
