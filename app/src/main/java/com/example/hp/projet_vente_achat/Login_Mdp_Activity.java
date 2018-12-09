package com.example.hp.projet_vente_achat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Login_Mdp_Activity extends AppCompatActivity {
    DBConnections db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__mdp_);
        db = new DBConnections(this);

    }


    /*************************méthode pour tester le login et mot de passe ****************************/

    public void Button_test(View view) {

        EditText login=(EditText)findViewById(R.id.input_Login);
        EditText mdp=(EditText)findViewById(R.id.input_Mdp);
        final TextView V_login=(TextView)findViewById(R.id.verifier_login);
        final TextView V_mdp=(TextView)findViewById(R.id.verifier_mdp);

        String L=login.getText().toString();
        String M=mdp.getText().toString();
        ArrayList l2 = new ArrayList();
        l2=db.getcompte(L, M);
        int taille = l2.size();

        //Tester les champs de login et mot de passe

        if ((login.getText().toString().equals(getString(R.string.login_Admin)))&&(mdp.getText().toString().equals(getString(R.string.mdp_Admin)))){

            //Si les champs correcte

            Intent myIntent=new Intent(this,Accueil_Activity.class);

            Bundle b = new Bundle();
            b.putString("Login1",login.getText().toString());
            b.putString("Mdp1",mdp.getText().toString());

            myIntent.putExtras(b);

            startActivity(myIntent);

            return;

        }

        //Tester les champs de login et mot de passe Client

        if(taille!=0){

            //Si les champs correcte

            V_login.setText(R.string.V_login);
            V_mdp.setText(R.string.V_mdp);
            Intent myIntent=new Intent(this,Accueil_Activity.class);

            Bundle b = new Bundle();
            b.putString("Login1",login.getText().toString());
            b.putString("Mdp1",mdp.getText().toString());

            myIntent.putExtras(b);

            startActivity(myIntent);

        }else{

            V_login.setText(R.string.X_login);
            V_mdp.setText(R.string.X_mdp);

        }




    }

    /*************************méthode pour ouvrir l'activity Traitement_oublier_mdp_Activity *****************************/

    public void oblier_mdp(View view) {

        Intent myIntent=new Intent(this,Traitement_Oblier_mdp_Activity.class);
        startActivity(myIntent);

    }


    /************************methode pour ouvrir l'activity Traitement_compte_Activity ********************************/

    public void creer_compte(View view) {

        Intent myIntent=new Intent(this,Traitement_Compte_Activity.class);
        startActivity(myIntent);

    }





}
