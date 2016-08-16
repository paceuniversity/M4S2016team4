package com.example.js.taaruna;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.widget.ImageView;

public class Detail extends AppCompatActivity {

    final String EXTRA_TEXT = "text";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView texto=(WebView)findViewById(R.id.texto);
        ImageView imgscv = (ImageView) findViewById(R.id.imcol);
        Intent intent = getIntent();
        switch (intent.getStringExtra(EXTRA_TEXT)){
            case "Huile De Coco" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/coco.html");
                imgscv.setImageResource(R.drawable.coco);
            break;

            case "Les Sourcils" :
                setTitle("Les Souricils");
                texto.loadUrl("file:///android_asset/sourcils.html");
                imgscv.setImageResource(R.drawable.sourcil);
            break;

            case "Transpirations" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/transpiration.html");
                imgscv.setImageResource(R.drawable.aisselles);
            break;

            case "Se Doucher" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/douche.html");
                imgscv.setImageResource(R.drawable.doucher);
            break;

            case "Manucure" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/manucure.html");
                imgscv.setImageResource(R.drawable.manicure);
            break;

            case "Les Cheveux Afro" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/cheveux_afro.html");
                imgscv.setImageResource(R.drawable.cheveux);
            break;

            case "Peau Grasse" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/peau_grasse.html");
                imgscv.setImageResource(R.drawable.grasse);
            break;

            case "Anti-vergetures" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/anti_vergiture.html");
                imgscv.setImageResource(R.drawable.vergeture);
                break;

            case "Ventre Plat" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/ventre_plat.html");
                imgscv.setImageResource(R.drawable.ventre);
                break;

            case "Produits cosmétiques à éviter" :
                setTitle(intent.getStringExtra(EXTRA_TEXT));
                texto.loadUrl("file:///android_asset/cometique_eviter.html");
                imgscv.setImageResource(R.drawable.produit);
                break;

            case "0": {
                setTitle("Un coup d'éclat au citron");
                texto.loadUrl("file:///android_asset/citron.html");
                imgscv.setImageResource(R.drawable.citron);
            }break;


            case "1": {
                setTitle("Un lait au concombre");
                texto.loadUrl("file:///android_asset/lait_concombre.html");
                imgscv.setImageResource(R.drawable.concombre);
            }break;


            case "2": {
                setTitle("Un gommage au sel");
                texto.loadUrl("file:///android_asset/gommage_sel.html");
                imgscv.setImageResource(R.drawable.gommage_sel);
            }break;


            case "3": {
                setTitle("Un soin cheveux secs à l'avocat");
                texto.loadUrl("file:///android_asset/soin_cheveux_sec.html");
                imgscv.setImageResource(R.drawable.avocat);
            }break;


            case "4": {
                setTitle("Un soin belle main");
                texto.loadUrl("file:///android_asset/belle_main.html");
                imgscv.setImageResource(R.drawable.main);
            }break;


            case "5": {
                setTitle("Un masque à la tomate");
                texto.loadUrl("file:///android_asset/masque_tomate.html");
                imgscv.setImageResource(R.drawable.tomate);
            }break;


            case "6": {
                setTitle("Un sourire éclatant");
                texto.loadUrl("file:///android_asset/sourire_eclatant.html");
                imgscv.setImageResource(R.drawable.sourire);
            }break;


            case "7": {
                setTitle("Démaquillage express");
                texto.loadUrl("file:///android_asset/demaquillage_express.html");
                imgscv.setImageResource(R.drawable.demaquillage);
            }break;


            case "8":
            {   setTitle("Gommage à la pastèque");
                texto.loadUrl("file:///android_asset/gommage_pasteque.html");
                imgscv.setImageResource(R.drawable.pasteque);
            }break;
    }


    }
}

