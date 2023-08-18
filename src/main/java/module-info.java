module br.com.luizlcezario.me.converter {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;


    opens br.com.luizlcezario.me.converter to javafx.fxml;
    exports br.com.luizlcezario.me.converter;
    exports br.com.luizlcezario.me.converter.service;
    opens br.com.luizlcezario.me.converter.service to javafx.fxml;
}