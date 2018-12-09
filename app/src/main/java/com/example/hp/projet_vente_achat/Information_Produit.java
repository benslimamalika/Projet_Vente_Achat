package com.example.hp.projet_vente_achat;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Information_Produit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information__produit);


/********************************************************************************************************************************/
        final Bundle b2=getIntent().getExtras();
        final String Titre=b2.getString("titre1");
        final String Description=b2.getString("desc1");

/********************************Appelle de la méthode affiche**********************************************/

        B_affiche();

    }


    /*******************Tableau contient les images de la liste des produits à vendre***********************************/

    int index=0;
    //tableau qui contient les images
    int[] tab_img=new int[]{R.drawable.voiture1,R.drawable.voiture2,R.drawable.voiture3};
    int[] tab_img1=new int[]{R.drawable.pc_hp1,R.drawable.pc_hp2,R.drawable.pc_hp3,R.drawable.pc_hp4};
    int[] tab_img2=new int[]{R.drawable.ram1,R.drawable.ram2};
    int[] tab_img3=new int[]{R.drawable.clavier1,R.drawable.clavier2,R.drawable.clavier3};

    /********************************Evenement Click du boutton next de la liste*****************************************************/

    public void Button_next(View View) {

        /*Récupération des données */
        final Bundle b2=getIntent().getExtras();
        final String Titre=b2.getString("titre1");
        final String Description=b2.getString("desc1");

        TextView Nom=(TextView)findViewById(R.id.Nom_Info);
        TextView Prenom=(TextView)findViewById(R.id.Prenom_Info);
        TextView N_Tel=(TextView)findViewById(R.id.Num_Tel_Info);
        TextView Nom_produit=(TextView)findViewById(R.id.Nom_Produit_Info);
        TextView Desc_produit=(TextView)findViewById(R.id.Desc_produit_Info);
        TextView Prix=(TextView)findViewById(R.id.prix);
        /* Test pour afficher les images correspondantes pour voitures*/

        if(Titre.equals(getString(R.string.voiture))){
            ImageView image=(ImageView)findViewById(R.id.image_Info);
            image.setImageResource(tab_img[index]);
            index++;
            if (index>2){
                index=0;
            }

            // Récupération des données sur le vendeur
            Nom.setText(R.string.Nom_V);
            Prenom.setText(R.string.prenom_v);
            N_Tel.setText(R.string.num_tel_v);
            Nom_produit.setText(Titre);
            Desc_produit.setText(Description);
            Prix.setText(R.string.prix_v);
        }

        /* Test pour afficher les images correspondantes pour PC*/

        if (Titre.equals(getString(R.string.pc))){

            ImageView image=(ImageView)findViewById(R.id.image_Info);
            image.setImageResource(tab_img1[index]);
            index++;
            if (index>3){
                index=0;
            }

            // Récupération des données sur le vendeur

            Nom.setText(R.string.nom_p);
            Prenom.setText(R.string.prenom_p);
            N_Tel.setText(R.string.num_tel_p);
            Nom_produit.setText(Titre);
            Desc_produit.setText(Description);
            Prix.setText(R.string.prix_p);


        }

        /* Test pour afficher les images correspondantes pour Ram*/
        if (Titre.equals(getString(R.string.ram))){

            ImageView image=(ImageView)findViewById(R.id.image_Info);
            image.setImageResource(tab_img2[index]);
            index++;
            if (index>1){
                index=0;
            }

            // Récupération des données sur le vendeur

            Nom.setText(R.string.nom_r);
            Prenom.setText(R.string.prenom_r);
            N_Tel.setText(R.string.num_tel_r);
            Nom_produit.setText(Titre);
            Desc_produit.setText(Description);
            Prix.setText(R.string.prix_r);

        }
        /* Test pour afficher les images correspondantes pour Clavier*/

        if (Titre.equals(getString(R.string.clavier))){

            ImageView image=(ImageView)findViewById(R.id.image_Info);
            image.setImageResource(tab_img3[index]);
            index++;
            if (index>2){
                index=0;
            }

            // Récupération des données sur le vendeur

            Nom.setText(R.string.nom_c);
            Prenom.setText(R.string.prenom_c);
            N_Tel.setText(R.string.num_tel_c);
            Nom_produit.setText(Titre);
            Desc_produit.setText(Description);
            Prix.setText(R.string.prix_c);


        }


    }

    /******************************Evenement Click du boutton précédant de la liste************************************************/

    public void Button_precedant(View view) {

        /*Récupération des données */
        final Bundle b2=getIntent().getExtras();
        final String Titre=b2.getString("titre1");
        final String Description=b2.getString("desc1");

        TextView Nom=(TextView)findViewById(R.id.Nom_Info);
        TextView Prenom=(TextView)findViewById(R.id.Prenom_Info);
        TextView N_Tel=(TextView)findViewById(R.id.Num_Tel_Info);
        TextView Nom_produit=(TextView)findViewById(R.id.Nom_Produit_Info);
        TextView Desc_produit=(TextView)findViewById(R.id.Desc_produit_Info);
        TextView Prix=(TextView)findViewById(R.id.prix);
        /* Test pour afficher les images correspondantes pour voitures*/

        if(Titre.equals(getString(R.string.voiture))){
            ImageView image=(ImageView)findViewById(R.id.image_Info);
            image.setImageResource(tab_img[index]);
            index++;
            if (index>2){
                index=0;
            }

            // Récupération des données sur le vendeur
            Nom.setText(R.string.Nom_V);
            Prenom.setText(R.string.prenom_v);
            N_Tel.setText(R.string.num_tel_v);
            Nom_produit.setText(Titre);
            Desc_produit.setText(Description);
            Prix.setText(R.string.prix_v);
        }

        /* Test pour afficher les images correspondantes pour PC*/

        if (Titre.equals(getString(R.string.pc))){

            ImageView image=(ImageView)findViewById(R.id.image_Info);
            image.setImageResource(tab_img1[index]);
            index++;
            if (index>3){
                index=0;
            }

            // Récupération des données sur le vendeur

            Nom.setText(R.string.nom_p);
            Prenom.setText(R.string.prenom_p);
            N_Tel.setText(R.string.num_tel_p);
            Nom_produit.setText(Titre);
            Desc_produit.setText(Description);
            Prix.setText(R.string.prix_p);


        }

        /* Test pour afficher les images correspondantes pour Ram*/
        if (Titre.equals(getString(R.string.ram))){

            ImageView image=(ImageView)findViewById(R.id.image_Info);
            image.setImageResource(tab_img2[index]);
            index++;
            if (index>1){
                index=0;
            }

            // Récupération des données sur le vendeur

            Nom.setText(R.string.nom_r);
            Prenom.setText(R.string.prenom_r);
            N_Tel.setText(R.string.num_tel_r);
            Nom_produit.setText(Titre);
            Desc_produit.setText(Description);
            Prix.setText(R.string.prix_r);

        }
        /* Test pour afficher les images correspondantes pour Clavier*/

        if (Titre.equals(getString(R.string.clavier))){

            ImageView image=(ImageView)findViewById(R.id.image_Info);
            image.setImageResource(tab_img3[index]);
            index++;
            if (index>2){
                index=0;
            }

            // Récupération des données sur le vendeur

            Nom.setText(R.string.nom_c);
            Prenom.setText(R.string.prenom_c);
            N_Tel.setText(R.string.num_tel_c);
            Nom_produit.setText(Titre);
            Desc_produit.setText(Description);
            Prix.setText(R.string.prix_c);


        }


    }

    /********Traitement de Button affiche pour afficher les informations directement qui on fait appelle dans la méthode Oncreate *******/

    public void B_affiche() {

        /*Récupération des données */
        final Bundle b2=getIntent().getExtras();
        final String Titre=b2.getString("titre1");
        final String Description=b2.getString("desc1");

        TextView Nom=(TextView)findViewById(R.id.Nom_Info);
        TextView Prenom=(TextView)findViewById(R.id.Prenom_Info);
        TextView N_Tel=(TextView)findViewById(R.id.Num_Tel_Info);
        TextView Nom_produit=(TextView)findViewById(R.id.Nom_Produit_Info);
        TextView Desc_produit=(TextView)findViewById(R.id.Desc_produit_Info);
        TextView Prix=(TextView)findViewById(R.id.prix);
        /* Test pour afficher les images correspondantes pour voitures*/

        if(Titre.equals(getString(R.string.voiture))){
            ImageView image=(ImageView)findViewById(R.id.image_Info);
            image.setImageResource(tab_img[index]);
            index++;
            if (index>2){
                index=0;
            }

            // Récupération des données sur le vendeur
            Nom.setText(R.string.Nom_V);
            Prenom.setText(R.string.prenom_v);
            N_Tel.setText(R.string.num_tel_v);
            Nom_produit.setText(Titre);
            Desc_produit.setText(Description);
            Prix.setText(R.string.prix_v);
        }

        /* Test pour afficher les images correspondantes pour PC*/

        if (Titre.equals(getString(R.string.pc))){

            ImageView image=(ImageView)findViewById(R.id.image_Info);
            image.setImageResource(tab_img1[index]);
            index++;
            if (index>3){
                index=0;
            }

            // Récupération des données sur le vendeur

            Nom.setText(R.string.nom_p);
            Prenom.setText(R.string.prenom_p);
            N_Tel.setText(R.string.num_tel_p);
            Nom_produit.setText(Titre);
            Desc_produit.setText(Description);
            Prix.setText(R.string.prix_p);


        }

        /* Test pour afficher les images correspondantes pour Ram*/
        if (Titre.equals(getString(R.string.ram))){

            ImageView image=(ImageView)findViewById(R.id.image_Info);
            image.setImageResource(tab_img2[index]);
            index++;
            if (index>1){
                index=0;
            }

            // Récupération des données sur le vendeur

            Nom.setText(R.string.nom_r);
            Prenom.setText(R.string.prenom_r);
            N_Tel.setText(R.string.num_tel_r);
            Nom_produit.setText(Titre);
            Desc_produit.setText(Description);
            Prix.setText(R.string.prix_r);

        }
        /* Test pour afficher les images correspondantes pour Clavier*/

        if (Titre.equals(getString(R.string.clavier))){

            ImageView image=(ImageView)findViewById(R.id.image_Info);
            image.setImageResource(tab_img3[index]);
            index++;
            if (index>2){
                index=0;
            }

            // Récupération des données sur le vendeur

            Nom.setText(R.string.nom_c);
            Prenom.setText(R.string.prenom_c);
            N_Tel.setText(R.string.num_tel_c);
            Nom_produit.setText(Titre);
            Desc_produit.setText(Description);
            Prix.setText(R.string.prix_c);


        }

    }

    /*****************méthode pour le boutton appel pour appeler le vendeur********************************************************/

    public void appel(View view) {

        Uri telNumber = Uri.parse("tel:+55124578");
        Intent call = new Intent(Intent.ACTION_DIAL, telNumber);
        startActivity(call);

    }



    /***************************Evenement Click du TextView deconnexion*************************************************/

    public void deconnexion_info(View view) {

        Intent myIntent=new Intent(this,Login_Mdp_Activity.class);

        startActivity(myIntent);

    }

    /***************************Evenement Click du TextView retour*************************************************/

    public void retour_info(View view) {

        Intent myIntent=new Intent(this,Accueil_Activity.class);
        Bundle b=new Bundle();
        myIntent.putExtras(b);
        startActivity(myIntent);


    }
}
