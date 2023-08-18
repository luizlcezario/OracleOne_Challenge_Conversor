package br.com.luizlcezario.me.converter;

import br.com.luizlcezario.me.converter.service.CoinService;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class PageConverterViewController implements Initializable{
    private CoinService coinSercice = new CoinService();

    @FXML
    private TextField toConvert;

    @FXML
    private ChoiceBox toConvertChoiceBox;

    @FXML
    private ChoiceBox toRecivetChoiceBox;

    @FXML
    private TextField toRecive;

    @FXML
    private Label errorConvert;

    @FXML
    private void doConvertion() throws Exception {
        try {
            Double toConvertValue = Double.parseDouble(toConvert.getText());
            Double result = coinSercice.convertionValue(toConvertChoiceBox.getValue().toString(), toRecivetChoiceBox.getValue().toString(), toConvertValue);
            toRecive.setText(String.valueOf(result));
        } catch (Exception e) {
            errorConvert.setText("Por favor, insira um valor válido");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        toConvertChoiceBox.getItems().addAll(coinSercice.getAllCoinNam());
        toRecivetChoiceBox.getItems().addAll(coinSercice.getAllCoinNam());
    }
}
