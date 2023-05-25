package controller;

import javax.swing.text.html.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class ClassmatesController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Emlan emlan = new Emlan();
    Jiu jiu = new Jiu();
    Kiether kiether = new Kiether();
    Leanna leanna = new Leanna();
    Shalimar shalimar = new Shalimar();

    public void initialize() {

        emlan.setSex("male");
        emlan.setProgram("BSIT-MAA");
        emlan.setHobby("play Roblox all night");
        emlan.setZodiacSign("Pisces");

        jiu.setSex("female");
        jiu.setProgram("BSIT-MAA");
        jiu.setHobby("read books");
        jiu.setZodiacSign("Capricorn");

        kiether.setSex("male");
        kiether.setProgram("BSIT-MWA");
        kiether.setHobby("play Roblox all day");
        kiether.setZodiacSign("Scorpio");

        leanna.setSex("female");
        leanna.setProgram("BSIT-MWA");
        leanna.setHobby("just chill");
        leanna.setZodiacSign("Aries");

        shalimar.setSex("female");
        shalimar.setProgram("BSIT-MAA");
        shalimar.setHobby("drawing");
        shalimar.setZodiacSign("Capricorn");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Emlan is a " + emlan.getSex() + ", while his program is " + emlan.getProgram() 
            + ", he still loves to " + emlan.getHobby() + ", and his zodiac sign is " + emlan.getZodiacSign() + ".");
        }

        if (sourceButton == btn2) {
            alert.setContentText("Jiu is a " + jiu.getSex() + ", while her program is " + jiu.getProgram() 
            + ", she still loves to " + jiu.getHobby() + ", and her zodiac sign is " + jiu.getZodiacSign() + ".");
        }

        if (sourceButton == btn3) {
            alert.setContentText("Kiether is a " + kiether.getSex() + ", while his program is " + kiether.getProgram() 
            + ", he still loves to " + kiether.getHobby() + ", and his zodiac sign is " + kiether.getZodiacSign() + ".");
        }

        if (sourceButton == btn4) {
            alert.setContentText("Leanna is a " + leanna.getSex() + ", while her program is " + leanna.getProgram() 
            + ", she still loves to " + leanna.getHobby() + ", and her zodiac sign is " + leanna.getZodiacSign() + ".");
        }

        if (sourceButton == btn5) {
            alert.setContentText("Shalimar is a " + shalimar.getSex() + ", while her program is " + shalimar.getProgram() 
            + ", she still loves to " + shalimar.getHobby() + ", and her zodiac sign is " + shalimar.getZodiacSign() + ".");
        }

        alert.showAndWait();

    }
}