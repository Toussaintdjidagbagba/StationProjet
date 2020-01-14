package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import sun.security.util.Password;

import java.io.IOException;

public class CreateaccountController {
    @FXML
    public TextArea EMAIL;
    @FXML
    public TextArea IDENTIFIANT;
    @FXML
    public TextArea TEL;
    @FXML
    public Button VALIDE;
    @FXML
    public TextArea NOM;
    @FXML
    public TextArea PRENOM;
    public PasswordField PASSWORD;

    @FXML
    public void valide(MouseEvent mouseEvent) throws IOException {
        // Recuperation des données dans une variable

        String email = EMAIL.getText();
        String identifiant = IDENTIFIANT.getText();
        String nom = NOM.getText();
        String prenom = PRENOM.getText();
        String password = PASSWORD.getText();


        //controle
        // Passage au fenetre suivante
        Stage primary = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../lesvues/connectaccount.fxml"));
        primary.setTitle("CONNECT ACCOUNT");
        primary.setScene(new Scene(root, 1300, 900));
        primary.setResizable(false);
        primary.show();

    }
}
