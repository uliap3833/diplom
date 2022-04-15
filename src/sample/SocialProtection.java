package sample;

import animations.Shake;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent; import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage; import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
public class SocialProtection extends Configs
 { @FXML
 private ResourceBundle resources;
 @FXML private URL location;
 @FXML private Button logoutButton;
 @FXML private TextField revenue1;
 @FXML private TextField peopleNumber1;
 @FXML private TextField years;
 @FXML private Button school;
 @FXML private Button milkKitchen;
 @FXML private Button onetimePay;
 @FXML private Button monthPay;
 @FXML private DatePicker date_registration;
 @FXML private DatePicker date_kom_pay;
 @FXML

private TextField revenue;
 @FXML private TextField peopleNumber;
 @FXML private Button decide;
 @FXML private TextField pay;
 @FXML private Label answer;
 @FXML void initialize() {
     school.setOnAction(event->{
     int Revenue1 = 0; int PeopleNumber1 = 0;
     int Years = 0;
     try { if (revenue1.getText().equals("")) {
         Shake userAnimRevenue = new Shake(revenue1);
         userAnimRevenue.playAnim();
     }
     else if (peopleNumber1.getText().equals("")) {
         Shake userAnimPeopleNumber = new Shake(peopleNumber1);
         userAnimPeopleNumber.playAnim();
     }
     else if (years.getText().equals("")) { Shake userAnimClassNumber = new Shake(years);
     userAnimClassNumber.playAnim();
     }
     else {
         boolean is_okay = true;
     if ((Integer.valueOf(revenue1.getText()) >= 0) && (!revenue1.getText().equals(null))) { Revenue1 = Integer.valueOf(revenue1.getText());
     }
     else{ Shake userAnimRevenue = new Shake(revenue1);
     userAnimRevenue.playAnim(); is_okay = false;
     }
     if ((Integer.valueOf(peopleNumber1.getText()) > 0) && (!peopleNumber1.getText().equals(null))){ PeopleNumber1 = Integer.valueOf(peopleNumber1.getText());
     }else{ Shake userAnimPeopleNumber = new Shake(peopleNumber1);
     userAnimPeopleNumber.playAnim();
     is_okay = false; } if ((Integer.valueOf(years.getText()) >= 0) && (!years.getText().equals(null))){ Years = Integer.valueOf(years.getText());
     }
     else{ Shake userAnimClassNumber = new Shake(years);
     userAnimClassNumber.playAnim();

        is_okay = false;
     }
     if(is_okay){
         if(Years >= 0 && Years <= 16) {
             if ((Revenue1 / PeopleNumber1) < (Globals.LiveMinPay)) { answer.setStyle("-fx-text-fill:green");
             answer.setText("Одобрено");
             }
             else { answer.setStyle("-fx-text-fill:red");
             answer.setText("Не одобрено, финансовое положение выше минимального");
             } }
             else{ answer.setStyle("-fx-text-fill:red");
             answer.setText("Не одобрено, ребеноку должно быть 16 лет или меньше");
             }
         }else{ answer.setStyle("-fx-text-fill:red");
         answer.setText("Не одобрено");
     } } } catch (NumberFormatException e){ e.printStackTrace();
     Shake userAnimRevenue = new Shake(revenue);
     userAnimRevenue.playAnim();
     } });
     milkKitchen.setOnAction(event->{
         int Revenue1 = 0;
     int PeopleNumber1 = 0;
     int Years = 0;
     int Pay1 = 0;
     try {
         if (revenue1.getText().equals("")) {
             Shake userAnimRevenue = new Shake(revenue1);
             userAnimRevenue.playAnim();
         }
         else if (peopleNumber1.getText().equals("")) {
             Shake userAnimPeopleNumber = new Shake(peopleNumber1);
             userAnimPeopleNumber.playAnim();
         } else { boolean is_okay = true;
         if ((Integer.valueOf(revenue1.getText()) >= 0) && (!revenue1.getText().equals(null))) { Revenue1 = Integer.valueOf(revenue1.getText());
         }
         else{

        Shake userAnimRevenue = new Shake(revenue1);
        userAnimRevenue.playAnim();
        is_okay = false;
         } if ((Integer.valueOf(peopleNumber1.getText()) > 0) && (!peopleNumber1.getText().equals(null))){ PeopleNumber1 = Integer.valueOf(peopleNumber1.getText());
         }else{ Shake userAnimPeopleNumber = new Shake(peopleNumber1);
         userAnimPeopleNumber.playAnim();
         is_okay = false; }
         if ((Integer.valueOf(years.getText()) >= 0) && (!years.getText().equals(null))){ Years = Integer.valueOf(years.getText());
         }
         else{ Shake userAnimClassNumber = new Shake(years);
             userAnimClassNumber.playAnim();

             is_okay = false;
         }
         if(is_okay) {
             if (Years >= 0 && Years <= 1) {
                 if ((Revenue1 / PeopleNumber1) < (Globals.LiveMinPay)) {
                     answer.setStyle("-fx-text-fill:green");
                     answer.setText("Одобрено");
                 } else {
                     answer.setStyle("-fx-text-fill:red");
                     answer.setText("Не одобрено, финансовое положение выше минимального");
                 }
             }
             else {
                 answer.setStyle("-fx-text-fill:red");
                 answer.setText("Не одобрено, ребенку должен быть год или менее");
             }
         }
         else{ answer.setStyle("-fx-text-fill:red");
         answer.setText("Не одобрено");
         } } }
     catch (NumberFormatException e){ e.printStackTrace();
     Shake userAnimRevenue = new Shake(revenue);
     userAnimRevenue.playAnim();
     } });
     monthPay.setOnAction(event->{ int Revenue1 = 0;
     int PeopleNumber1 = 0;
     int Pay1 = 0;
     int Years = 0;
     try {
         if (revenue1.getText().equals("")) { Shake userAnimRevenue = new Shake(revenue1);
         userAnimRevenue.playAnim();
     }
     else if (peopleNumber1.getText().equals("")) { Shake userAnimPeopleNumber = new Shake(peopleNumber1);
     userAnimPeopleNumber.playAnim();
     }
     else {

        boolean is_okay = true;
        if ((Integer.valueOf(revenue1.getText()) >= 0) && (!revenue1.getText().equals(null))) {
            Revenue1 = Integer.valueOf(revenue1.getText());
        }
        else{
            Shake userAnimRevenue = new Shake(revenue1);
        userAnimRevenue.playAnim();
        is_okay = false;
        }
        if ((Integer.valueOf(peopleNumber1.getText()) > 0) && (!peopleNumber1.getText().equals(null))){
            PeopleNumber1 = Integer.valueOf(peopleNumber1.getText());
        }else{ Shake userAnimPeopleNumber = new Shake(peopleNumber1);
        userAnimPeopleNumber.playAnim();
        is_okay = false;
        }
             if ((Integer.valueOf(years.getText()) >= 0) && (!years.getText().equals(null))){ Years = Integer.valueOf(years.getText());
             }
             else{ Shake userAnimClassNumber = new Shake(years);
                 userAnimClassNumber.playAnim();

                 is_okay = false;
             }
        if(is_okay){
            if (Years >= 0 && Years <= 16) {
                if ((Revenue1 / PeopleNumber1) < (Globals.LiveMinPay)) {
                    answer.setStyle("-fx-text-fill:green");
                    answer.setText("Одобрено");
                } else {
                    answer.setStyle("-fx-text-fill:red");
                    answer.setText("Не одобрено, финансовое положение выше минимального");
                }
            } else {
                    answer.setStyle("-fx-text-fill:red");
                    answer.setText("Не одобрено, ребенку должно быть 16 или меньше");
            }
            }else{ answer.setStyle("-fx-text-fill:red");
            answer.setText("Не одобрено");
        } } } catch (NumberFormatException e){
         e.printStackTrace();
        Shake userAnimRevenue = new Shake(revenue);
        userAnimRevenue.playAnim();
     } });
     onetimePay.setOnAction(event->{ int Revenue1 = 0;
     int PeopleNumber1 = 0;
     int Pay1 = 0;
     int Years = 0;
     try {
         if (revenue1.getText().equals("")) { Shake userAnimRevenue = new Shake(revenue1);
         userAnimRevenue.playAnim();
         }
         else if (peopleNumber1.getText().equals("")) { Shake userAnimPeopleNumber = new Shake(peopleNumber1);
         userAnimPeopleNumber.playAnim();
         } else { boolean is_okay = true;
         if ((Integer.valueOf(revenue1.getText()) >= 0) && (!revenue1.getText().equals(null))) {
             Revenue1 = Integer.valueOf(revenue1.getText());
         }
         else{ Shake userAnimRevenue = new Shake(revenue1);
         userAnimRevenue.playAnim();
         is_okay = false;
         }
         if ((Integer.valueOf(peopleNumber1.getText()) > 0) && (!peopleNumber1.getText().equals(null))){
             PeopleNumber1 = Integer.valueOf(peopleNumber1.getText());
         }
         else{ Shake userAnimPeopleNumber = new Shake(peopleNumber1);
         userAnimPeopleNumber.playAnim();
         is_okay = false;
         }
             if ((Integer.valueOf(years.getText()) >= 0) && (!years.getText().equals(null))){ Years = Integer.valueOf(years.getText());
             }
             else{ Shake userAnimClassNumber = new Shake(years);
                 userAnimClassNumber.playAnim();

                 is_okay = false;
             }
         if(is_okay) {
             if (Years >= 0 && Years <= 1) {
                 if ((Revenue1 / PeopleNumber1) < (Globals.LiveMinPay)) {
                     answer.setStyle("-fx-text-fill:green");
                     answer.setText("Одобрено");
                 } else {
                     answer.setStyle("-fx-text-fill:red");
                     answer.setText("Не одобрено, финансовое положение выше минимального");
                 }
             }
             else {
                 answer.setStyle("-fx-text-fill:red");
                 answer.setText("Не одобрено, ребенку должен быть год или меньше");
             }
         }
         else{ answer.setStyle("-fx-text-fill:red");
         answer.setText("Не одобрено");
         } } }
     catch (NumberFormatException e){ e.printStackTrace();
     Shake userAnimRevenue = new Shake(revenue);
     userAnimRevenue.playAnim();
     } });
     decide.setOnAction(event->{ int Revenue = 0;
     int PeopleNumber = 0;
     int Pay = 0;
     try { if (revenue.getText().equals("")) { Shake userAnimRevenue = new Shake(revenue);

        }
        else if (peopleNumber.getText().equals("")) {
            Shake userAnimPeopleNumber = new Shake(peopleNumber);
        userAnimPeopleNumber.playAnim();
        }
        else if (pay.getText().equals(""))
        {
            Shake userAnimPay = new Shake(pay);
            userAnimPay.playAnim();
        }
        else if (date_registration.getValue() == null) {
            Shake userAnimDateReg = new Shake(date_registration);
            userAnimDateReg.playAnim();
        }
        else if (date_kom_pay.getValue() == null) {
            Shake userAnimDateKomPay = new Shake(date_kom_pay);
            userAnimDateKomPay.playAnim();
        }
        else {
            boolean is_okay = true;
            if ((Integer.valueOf(revenue.getText()) >= 0) && (!revenue.getText().equals(null))) {
                Revenue = Integer.valueOf(revenue.getText());
            }
            else{ Shake userAnimRevenue = new Shake(revenue);
            userAnimRevenue.playAnim();
            is_okay = false;
            }
            if ((Integer.valueOf(peopleNumber.getText()) > 0) && (!peopleNumber.getText().equals(null))){
                PeopleNumber = Integer.valueOf(peopleNumber.getText());
            }
            else{ Shake userAnimPeopleNumber = new Shake(peopleNumber);
            userAnimPeopleNumber.playAnim();
            is_okay = false;
            }
            if ((Integer.valueOf(pay.getText()) > 0) && (!pay.getText().equals(null))){
                Pay = Integer.valueOf(pay.getText());
            }
            else{ Shake userAnimPay = new Shake(pay);
            userAnimPay.playAnim();
            is_okay = false;
            }
            if(is_okay)
            {
                if(date_registration.getValue().isBefore(date_kom_pay.getValue()))
                {
                    if((((Revenue * Globals.GKUPercents) / 100) <= Pay) || ((Revenue / PeopleNumber) < (Globals.LiveMinPay))) {
                        answer.setStyle("-fx-text-fill:green");
                    answer.setText("Одобрено");
                    }else{ answer.setStyle("-fx-text-fill:red");
                    answer.setText("Не одобрено, финансовое положение выше минимального");
                    } }
                else{ answer.setStyle("-fx-text-fill:red");
                answer.setText("Не одобрено, на момент выплат вы не были прописаны по указанному адресу");
                } }
            else{ answer.setStyle("-fx-text-fill:red"); answer.setText("Не одобрено"); } }

        }
     catch (NumberFormatException e){ e.printStackTrace();
     Shake userAnimRevenue = new Shake(revenue);
     userAnimRevenue.playAnim();
     } });
     logoutButton.setOnAction(event -> { logoutButton.getScene().getWindow().hide();
     Parent root = null;
     try {
         root = FXMLLoader.load(getClass().getResource("sample.fxml"));
     }
     catch (IOException e) { e.printStackTrace();
     } Stage primaryStage = new Stage();
     primaryStage.setTitle("Diary");
     primaryStage.setScene(new Scene(root, 700, 400));
     primaryStage.setResizable(false);
     primaryStage.show();
     });
 } }