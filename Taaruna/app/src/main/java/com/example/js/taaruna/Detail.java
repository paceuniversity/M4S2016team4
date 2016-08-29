package com.example.js.taaruna;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Detail extends AppCompatActivity {

    final String EXTRA_TEXT = "text";
    ProgressDialog MessProg;
    ImageView imgscv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        WebView texto=(WebView)findViewById(R.id.texto);
        imgscv = (ImageView) findViewById(R.id.imcol);
        Intent intent = getIntent();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto:"+ Uri.encode("782912730")));
                intent.putExtra("sms_body","Taaruna à l'écoute :\n");
                startActivity(intent);
            }
        });


        switch (intent.getStringExtra(EXTRA_TEXT)){
            case "Huile De Coco" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/coco.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/coco.jpg");
            break;

            case "Les Sourcils" :
                setTitle("Les Souricils");
                texto.loadUrl("file:///android_asset/sourcils.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/sourcil.jpg");
            break;

            case "Transpirations" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/transpiration.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/aisselles.jpg");
            break;

            case "Se Doucher" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/douche.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/doucher.jpg");
            break;

            case "Manucure" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/manucure.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/manicure.jpg");
            break;

            case "Les Cheveux Afro" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/cheveux_afro.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/cheveux.jpg");
            break;

            case "Peau Grasse" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/peau_grasse.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/grasse.jpg");
            break;

            case "Anti-vergetures" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/anti_vergiture.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/vergeture.jpg");
                break;

            case "Ventre Plat" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/ventre_plat.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/ventre.jpg");
                break;

            case "Produits cosmétiques à éviter" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/cometique_eviter.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/produit.jpg");
                break;

            case "0": {
                setTitle("Un coup d'éclat au citron");
                texto.loadUrl("file:///android_asset/citron.html");
                // Execution de l'AsyncTask
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/citron.jpg");
            }break;


            case "1": {
                setTitle("Un lait au concombre");
                texto.loadUrl("file:///android_asset/lait_concombre.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/concombre.jpg");
            }break;


            case "2": {
                setTitle("Un gommage au sel");
                texto.loadUrl("file:///android_asset/gommage_sel.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/gommage_sel.jpg");
            }break;


            case "3": {
                setTitle("Un soin cheveux secs à l'avocat");
                texto.loadUrl("file:///android_asset/soin_cheveux_sec.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/avocat.jpg");
            }break;


            case "4": {
                setTitle("Un soin belle main");
                texto.loadUrl("file:///android_asset/belle_main.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/main.jpg");
            }break;


            case "5": {
                setTitle("Un masque à la tomate");
                texto.loadUrl("file:///android_asset/masque_tomate.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/tomate.jpg");
            }break;


            case "6": {
                setTitle("Un sourire éclatant");
                texto.loadUrl("file:///android_asset/sourire_eclatant.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/sourire.jpg");
            }break;


            case "7": {
                setTitle("Démaquillage express");
                texto.loadUrl("file:///android_asset/demaquillage_express.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/demaquillage.jpg");
            }break;


            case "8":
            {   setTitle("Gommage à la pastèque");
                texto.loadUrl("file:///android_asset/gommage_pasteque.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/master/Images_Taaruna/pasteque.jpg");
            }break;

            case "Fond De Teint Pro" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/poudre.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/d90fbcdffd14ee622aeb99cda8cabe4f91bafabe/Images_Taaruna/poudre.jpg");
                break;

            case "Masscara" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/mascara.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/d90fbcdffd14ee622aeb99cda8cabe4f91bafabe/Images_Taaruna/mascara.png");
                break;

            case "Ombre à paupière" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/ombr_paupiere.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/d90fbcdffd14ee622aeb99cda8cabe4f91bafabe/Images_Taaruna/ombre_paupiere.png");
                break;

            case "Poudre teint parfait" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/fonte.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/d90fbcdffd14ee622aeb99cda8cabe4f91bafabe/Images_Taaruna/fonte.jpg");
                break;

            case "Floral Gloss" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/gloss.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/d90fbcdffd14ee622aeb99cda8cabe4f91bafabe/Images_Taaruna/lol.jpg");
                break;

            case "Eyelinner" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/eyeliner.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/d90fbcdffd14ee622aeb99cda8cabe4f91bafabe/Images_Taaruna/eyeliner.jpg");
                break;

            case "Stick teint parfait" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/fond.html");
                new ChargementImage().execute("https://raw.githubusercontent.com/paceuniversity/M4S2016team4/d90fbcdffd14ee622aeb99cda8cabe4f91bafabe/Images_Taaruna/fond.png");
                break;
    }


    }




    // Télécharger l'ImageBangui avec AsyncTask
    protected class ChargementImage extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Creation d'un message de progression du téléchargement de l'image
            MessProg = new ProgressDialog(Detail.this);
            // Mettre un titre à la boite de dialogue du téléchargement de l'image
            MessProg.setTitle("Téléchargement de l'image depuis Github");
            // Créer un message de progression du téléchargement
            MessProg.setMessage("Chargement ...");
            MessProg.setIndeterminate(false);
            // Montrer la boite de dialogue
            MessProg.show();
        }

        @Override
        protected Bitmap doInBackground(String... lien) {


            Bitmap bitmap = null;
            try {

                //Vérification de la connexion

                if (isOnline()== false)
                {
                    //Message appelant à la connexion
                    MessProg.dismiss();
                    Toast toast = Toast.makeText(getApplicationContext(), "Erreur de connexion", Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                    toast.show();
                }else
                {   // Télécgargement de l'image
                    URL url = new URL(lien[0]);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    //Decodage du Bitmap
                    InputStream is = con.getInputStream();
                    bitmap = BitmapFactory.decodeStream(is);
                    is.close();
                }

            } catch (Exception e) {
                Log.e("Image", "Le chargement de l'image à échouer", e);
                Log.e("error", e.getMessage());

            }

            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap result) {
            // Mettre l'image dans l'image view
            imgscv.setImageBitmap(result);
            // Fermer la boite de dialogue
            MessProg.dismiss();
            //Toast Message
            showToast();
        }
    }



    public boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnectedOrConnecting();
    }

    private void showToast(){
        Toast toast = Toast.makeText(this, "Envoyez nous des questions par SMS,\n" +
                "en cliquant sur le logo de message", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.show();


    }
}

