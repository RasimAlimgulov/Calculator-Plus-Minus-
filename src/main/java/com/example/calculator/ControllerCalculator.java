package com.example.calculator;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ControllerCalculator {
    @FXML
    private Button ttransition;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button delete;

    @FXML
    private Button eight;

    @FXML
    private Button equal;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button minus;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button plus;

    @FXML
    private Button refresh;

    @FXML
    private Label resultat;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button zero;

    public int x=0;
    public int y=0;
    public int z=0;
    public boolean clear=false;
    public boolean summ=false;
    public boolean ActivMinus=false;
    public boolean minuss=false;

    @FXML
    void initialize() {
        one.setOnAction(actionEvent -> { if (clear) {resultat.setText("");}

            x=x*10+1;
            //if (pluss){z=z+y;}
            resultat.setText(""+x);
            clear=false;

        });
        two.setOnAction(actionEvent -> {  if (clear) {resultat.setText("");}
            x=x*10+2;resultat.setText(""+x);
            clear=false;
        });
        three.setOnAction(actionEvent -> {  if (clear) {resultat.setText("");}
            x=x*10+3; resultat.setText(""+x);
            clear=false;
        });
        four.setOnAction(actionEvent -> {  if (clear) {resultat.setText("");}

            x=x*10+4; resultat.setText(""+x);
            clear=false;
        });
        five.setOnAction(actionEvent -> {    if (clear) {resultat.setText("");}
            x=x*10+5; resultat.setText(""+x);
            clear=false;
        });
        six.setOnAction(actionEvent -> {   if (clear) {resultat.setText("");}
            x=x*10+6; resultat.setText(""+x);
            clear=false;

        });
        seven.setOnAction(actionEvent -> {   if (clear) {resultat.setText("");}
            x=x*10+7; resultat.setText(""+x);
            clear=false;
        });
        eight.setOnAction(actionEvent -> {   if (clear) {resultat.setText("");}
            x=x*10+8; resultat.setText(""+x);
            clear=false;
        });
        nine.setOnAction(actionEvent -> {  if (clear) {resultat.setText("");}
            x=x*10+9; resultat.setText(""+x);
            clear=false;
        });
        zero.setOnAction(actionEvent -> {   if (clear) {resultat.setText("");}
            x=x*10; resultat.setText(""+x);
            clear=false;
        });


        minus.setOnAction(actionEvent -> {
            if(minuss){ z=z+y-x; x=0;y=0; summ=false;}
            else{
                if(summ){z=z+x; x=0;y=0; summ=false; minuss=true;  }
                else {
                    y = x;
                    x = 0;
                    clear = true;
                    minuss = true;
                    summ = false;
                }
            }
        });
        plus.setOnAction(actionEvent -> {
            if(summ ){  z=z+x; x=0;y=0; minuss=false;  }
            else {
                if(minuss){
                    z=z+y-x;
                    y=0;
                    x=0;
                    minuss=false;
                    summ=true;
                }
                else {
                    z = z + x;
                    x = 0;
                    y = 0;

                    summ = true;
                    clear = true;

                    minuss = false;
                }

            }
        });
        equal.setOnAction(actionEvent -> {
            clear=true;
            if(summ){z=z+x;
                x=0;
                y=0;
                resultat.setText(""+z);
                summ=false;}
            else {
            if(minuss){
                y=y-x;
                z=z+y;
                resultat.setText(""+z);
                x=0;
                y=0;
                minuss=false;
            }
            else {
                resultat.setText(""+x);
            }
            }
            //  if (minuss){z=z-y-x;  resultat.setText(""+z);
            // minuss=false; }

        });
        refresh.setOnAction(actionEvent -> {
            x=0;
            y=0;
            z=0;
            resultat.setText("");
        });

        delete.setOnAction(actionEvent -> {x=x /10; resultat.setText(""+x); });
    }



}