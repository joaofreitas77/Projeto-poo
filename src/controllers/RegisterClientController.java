package controllers;

import entities.Client;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import utils.DataStorage;
import application.Main;

import java.util.List;

public class RegisterClientController {

    @FXML private TextField inputName;
    @FXML private TextField inputPhone;
    @FXML private TextField inputEmail;

    private List<Client> clients = DataStorage.loadClients();

    @FXML
    private void saveClient() {

        String name = inputName.getText();
        String phone = inputPhone.getText();
        String email = inputEmail.getText();

        if (name.isEmpty() || phone.isEmpty() || email.isEmpty()) {
            System.out.println("Todos os dados são obrigatórios!");
            exibirMensagemErro("Todos os dados são obrigatórios!");
            return;
        }

        Client c = new Client(clients.size() + 1, name, phone, email);

        clients.add(c);
        DataStorage.saveClients(clients);

        System.out.println("Cliente salvo.");

        inputName.clear();
        inputPhone.clear();
        inputEmail.clear();
        exibirMensagemSucesso("Cliente criado com sucesso!");
    }

    @FXML
    private void goBack() throws Exception {
        Main.changeScene("main.fxml");
    }

    private static void exibirMensagemErro(String mensagem) {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro!");
            alert.setContentText(mensagem);
            alert.showAndWait();
        });
    }

    private static void exibirMensagemSucesso(String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sucesso");
        alert.setContentText(mensagem);
        alert.showAndWait();
    }
}
