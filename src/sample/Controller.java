package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
public class Controller extends Configs
{ @FXML private ResourceBundle resources;
@FXML private URL location;
@FXML private TextField loginField;
@FXML private PasswordField passwordField;
@FXML private Button enterButton;
@FXML void initialize() { enterButton.setOnAction(event -> { String Ulogin = loginField.getText().trim();
String Upassword = passwordField.getText().trim();
System.out.println(Ulogin);
try {

    Globals.rs = Globals.stmt.executeQuery("select * from users where login = '" + Ulogin + "' and password = '" + Upassword + "'");
    int count = 0;
    while (Globals.rs.next()) {
        count ++;
    Globals.user_id = Globals.rs.getString(Globals.rs.findColumn("user_id"));
    }
    if(count == 1){
        enterButton.getScene().getWindow().hide();
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("socialProtection.fxml"));
    try {
        loader.load();
    } catch (IOException e) {
        e.printStackTrace();
    } Parent root = loader.getRoot();
    Stage stage = new Stage();
    stage.setScene(new Scene(root));
    stage.setResizable(false);
    stage.showAndWait();
    }
} catch (SQLException e) { e.printStackTrace();
} });
} }