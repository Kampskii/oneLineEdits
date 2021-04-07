package sample;

import javafx.application.Application;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Controller {
    public TextField textField1;
    public Button saveButton;
    public TextArea bigTextBoi;
    public ListView listboi;
    public LocalDateTime localDateTime;
    public DatePicker datePicker;
    public LocalDate localDate;

    public void userSavedText() {
        //Date and Time
        localDate = datePicker.getValue();
        localDateTime = LocalDateTime.now();
        String convertedDateTime = localDateTime.format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy hh: mm:ss a"));

        //TextField (Top Row)
        String textToSave1 = textField1.getText();
        String oldText = bigTextBoi.getText();
        textField1.setText("");

        //TextArea (Below the List View)
        bigTextBoi.setText(textToSave1 + " was saved on: " + convertedDateTime);
        bigTextBoi.setText(oldText + ": " + convertedDateTime);
        bigTextBoi.setDisable(false);

        //Save Button (Next to the TextField)
        saveButton.setText("Saved :)");
        saveButton.setDisable(false);

        //List View (Below the TextField + Save Button)
        listboi.getItems().add(textToSave1 + ": " + localDate);



    }
}
