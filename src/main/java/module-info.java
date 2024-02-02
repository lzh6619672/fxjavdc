module top.keyboard.fxjavdc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires lombok;
    requires cn.hutool.core;
    requires cn.hutool.http;
    requires org.jsoup;
    requires java.desktop;
    requires org.apache.commons.lang3;
    requires org.slf4j;
    requires ch.qos.logback.core;
    requires launch4j;

    opens top.keyboard.fxjavdc to javafx.fxml;
    exports top.keyboard.fxjavdc;
}