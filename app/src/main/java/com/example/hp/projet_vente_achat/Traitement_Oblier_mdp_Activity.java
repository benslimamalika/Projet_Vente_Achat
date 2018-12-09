package com.example.hp.projet_vente_achat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Traitement_Oblier_mdp_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traitement__oblier_mdp_);
    }




    /****************************methode du Button Suivant dans l'activité Traitement_Oblier_mdp_Activity******************************/

    public void B_suivant(View view) {

/***********************************Recuperation des TextView et EditText dans la page XML ****************************************/


        TextView Res = (TextView) findViewById(R.id.Resultat_mdp);
       // TextView Retour = (TextView) findViewById(R.id.Retour);
        TextView Re = (TextView) findViewById(R.id.Retour_ob);
        EditText N_T = (EditText) findViewById(R.id.N_Tel);
        EditText code = (EditText) findViewById(R.id.code);


/**********************************Test pour le code  saisie de la part de  l'utilisateur ************************************/


        if (code.getText().toString().equals(getString(R.string.code_mdp))) {

            Res.setText(getString(R.string.votre_mdp_est)+getString(R.string.Admin2018));
            Re.setText(R.string.retour);
            //Retour.setText(R.string.retour);


        }else{

            Res.setText(R.string.verifier_donnee_suivant);
            Re.setText(R.string.retour);
        //    Retour.setText(R.string.retour);

        }


        }




    /**********************************************Retour à l'activité login et mot de passe******************************************/


    public void Retour(View view) {

        Intent myIntent=new Intent(this,Login_Mdp_Activity.class);
        startActivity(myIntent);

    }

    /**********************************************Retour à l'activité login et mot de passe******************************************/

    public void Retour_oblier(View view) {
        Intent myIntent=new Intent(this,Login_Mdp_Activity.class);
        startActivity(myIntent);
    }

}
