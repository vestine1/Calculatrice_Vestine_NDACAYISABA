package com.example.calculatrice_vestine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    //déclaration des buttons
    Button button_Zeo;
    Button button_Un;
    Button button_deux;
    Button button_Trois;
    Button button_Quatre;
    Button button_Cinq;
    Button button_Six;
    Button button_sept;
    Button button_Huit;
    Button button_Neuf;
    Button Signe_Plus;
    Button Signe_Moins;
    Button Signe_Etoile;
    Button Signe_Division;
    Button Signe_Delete;
    Button Signe_Egal,Signe_Point;
    EditText Tableau_Affichage;
    private double chiffre1;
    private boolean clicOperateur = false;
    private boolean update = false;
    private String operateur = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tableau_Affichage = (EditText) findViewById(R.id.ecran);


        // opération d'addition
        Signe_Plus = (Button) findViewById(R.id.plus);
        Signe_Plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                plusClick();
            }
        });

        //opération Mopins
        Signe_Moins = (Button) findViewById(R.id.moins);
        Signe_Moins.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                moinsClick();
            }
        });


        //opération multiplication
        Signe_Etoile = (Button) findViewById(R.id.multiple);
        Signe_Etoile.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                etoileClick();
            }
        });

        // opération de division
        Signe_Division = (Button) findViewById(R.id.division);
        Signe_Division.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                divClick();
            }
        });

        Signe_Delete = (Button) findViewById(R.id.efface);
        Signe_Delete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Tableau_AffichageetClick();
            }
        });
        Signe_Egal = (Button) findViewById(R.id.egale);
        Signe_Egal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                egalClick();
            }
        });
        Signe_Point = (Button) findViewById(R.id.point);
        Signe_Point.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick(".");
            }
        });

        button_Zeo = (Button) findViewById(R.id.zero);
        button_Zeo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("0");
            }
        });
        button_Un = (Button) findViewById(R.id.rimwe);
        button_Un.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("1");
            }
        });
        button_deux = (Button) findViewById(R.id.deux);
        button_deux.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("2");
            }
        });
        button_Trois = (Button) findViewById(R.id.trois);
        button_Trois.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("3");
            }
        });
        button_Quatre = (Button) findViewById(R.id.quatr);
        button_Quatre.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("4");
            }
        });
        button_Cinq = (Button) findViewById(R.id.cinq);
        button_Cinq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("5");
            }
        });
        button_Six = (Button) findViewById(R.id.six);
        button_Six.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("6");
            }
        });
        button_sept = (Button) findViewById(R.id.sept);
        button_sept.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("7");
            }
        });
        button_Huit = (Button) findViewById(R.id.huit);
        button_Huit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("8");
            }
        });
        button_Neuf = (Button) findViewById(R.id.neuf);
        button_Neuf.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                chiffreClick("9");
            }
        });

    }
    public void chiffreClick(String str) {
        if(update){
            update = false;
        }else{
            if(!Tableau_Affichage.getText().equals("0"))
                str = Tableau_Affichage.getText() + str;
        }
        Tableau_Affichage.setText(str);



    }


    public void plusClick(){

        if(clicOperateur){
            FonctionPrincipale();
            Tableau_Affichage.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(Tableau_Affichage.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "+";
        update = true;
    }

    public void moinsClick(){
        if(clicOperateur){
            FonctionPrincipale();
            Tableau_Affichage.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(Tableau_Affichage.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "-";
        update = true;
    }

    //voici la méthode qui est  exécutée lorsqu'on clique sur le bouton *
    public void etoileClick(){
        if(clicOperateur){
            FonctionPrincipale();
            Tableau_Affichage.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(Tableau_Affichage.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "*";
        update = true;
    }


    public void divClick(){
        if(clicOperateur){
            FonctionPrincipale();
            Tableau_Affichage.setText(String.valueOf(chiffre1));
        }else{
            chiffre1 = Double.valueOf(Tableau_Affichage.getText().toString()).doubleValue();
            clicOperateur = true;
        }
        operateur = "/";
        update = true;
    }


    //voici la méthode qui est  exécutée lorsqu'on clique sur le bouton =
    public void egalClick(){
        FonctionPrincipale();
        update = true;
        clicOperateur = false;
    }

    //voici la méthode qui est  exécutée lorsque l'on clique sur le bouton C
    public void Tableau_AffichageetClick(){
        clicOperateur = false;
        update = true;
        chiffre1 = 0;
        operateur = "";
        Tableau_Affichage.setText("");
    }

    //Voici la méthode qui fait le FonctionPrincipale qui a été demandé par l'utilisateur
    private void FonctionPrincipale(){
        if(operateur.equals("+")){
            chiffre1 = chiffre1 + Double.valueOf(Tableau_Affichage.getText().toString()).doubleValue();
            Tableau_Affichage.setText(String.valueOf(chiffre1));
        }

        if(operateur.equals("-")){
            chiffre1 = chiffre1 - Double.valueOf(Tableau_Affichage.getText().toString()).doubleValue();
            Tableau_Affichage.setText(String.valueOf(chiffre1));
        }

        if(operateur.equals("*")){
            chiffre1 = chiffre1 * Double.valueOf(Tableau_Affichage.getText().toString()).doubleValue();
            Tableau_Affichage.setText(String.valueOf(chiffre1));
        }

        if(operateur.equals("/")){
            try{
                chiffre1 = chiffre1 / Double.valueOf(Tableau_Affichage.getText().toString()).doubleValue();
                Tableau_Affichage.setText(String.valueOf(chiffre1));
            }catch(ArithmeticException e){
                Tableau_Affichage.setText("0");
            }
        }
    }

}
