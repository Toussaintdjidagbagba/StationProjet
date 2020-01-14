package Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ConnectaccountController {

    public PasswordField PASSWORD;
    public Button CONNEXION;

    @FXML
    public void connexion(MouseEvent mouseEvent) throws IOException {
        // Vérification des données de connexion

        // Généré du code de vérification qui expire dans 2min après envoie.

        // l'envoie de message


        // suivante
        Stage primary = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../lesvues/verifaccount.fxml"));
        primary.setTitle("VERIF ACCOUNT");
        primary.setScene(new Scene(root, 1300, 900));
        primary.setResizable(false);
        primary.show();

    }
}
