package br.com.luizlcezario.me.converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.stream.Stream;

public class HomeViewController {

    @FXML
    private AnchorPane ap;

    @FXML
    private BorderPane bp;

    @FXML
    private void showScene(ActionEvent event) throws IOException {
        Parent root = new FXMLLoader(getClass().getResource("PageConverter.fxml")).load();
        bp.setCenter(root);
        ap.setCenterShape(true);
    }



}
