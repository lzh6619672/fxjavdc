package top.keyboard.fxjavdc;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import top.keyboard.fxjavdc.service.ConvertService;

import java.io.File;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField inputDir;
    @FXML
    private TextField outputDir;
    @FXML
    private VBox vboxContent;
    @FXML
    private CheckBox useProxy;
    @FXML
    private HBox proxyContent;
    @FXML
    private TextArea logArea;
    @FXML
    private TextField proxyHost;

    @FXML
    protected void onHelloButtonClick() {
        ConvertService convertService = new ConvertService();
        convertService.doConvert(inputDir.getText(), outputDir.getText(), logArea, proxyHost.getText());
    }

    @FXML
    protected void onProxyChange() {
        if (useProxy.isSelected()) {
            proxyContent.setVisible(true);
            System.out.println("Use proxy");
        } else {
            proxyContent.setVisible(false);
            System.out.println("Not use proxy");
        }
    }

    @FXML
    protected void onChoiceInputButtonClick() {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("选择视频源文件路径");
        File file = directoryChooser.showDialog(vboxContent.getScene().getWindow());
        if (file != null) {
            inputDir.setText(file.getAbsolutePath());
        }
    }

    @FXML
    protected void onChoiceOutputButtonClick() {
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("选择视频整理文件路径");
        File file = directoryChooser.showDialog(vboxContent.getScene().getWindow());
        if (file != null) {
            outputDir.setText(file.getAbsolutePath());
        }
    }
}