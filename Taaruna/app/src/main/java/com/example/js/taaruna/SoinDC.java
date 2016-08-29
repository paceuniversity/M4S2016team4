package com.example.js.taaruna;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;


import java.util.ArrayList;
import java.util.List;

public class SoinDC extends AppCompatActivity  {



    private RecyclerView recyclerView;
    private List<MyObject> cities = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soin_dc);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //remplir la ville
        ajouterVilles();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        //définit l'agencement des cellules, ici de façon verticale, comme une ListView
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //pour adapter en grille comme une RecyclerView, avec 2 cellules par ligne
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setHasFixedSize(true);

        //puis créer un MyAdapter, lui fournir notre liste de villes.
        //cet adapter servira à remplir notre recyclerview
        recyclerView.setAdapter(new MyAdapter(cities));
    }

    private void ajouterVilles() {
        cities.add(new MyObject("Huile De Coco","http://www.plusminceplusjeune.org/wp-content/uploads/2015/05/huile-de-noix-de-coco.jpg","SOINS DU CORPS"));
        cities.add(new MyObject("Les Sourcils","http://cdn2-doctissimo.ladmedia.fr/var/doctissimo/storage/images/media/images/yeux-peau-noire/812779-1-fre-FR/yeux-peau-noire.jpg","SOINS DU CORPS"));
        cities.add(new MyObject("Transpirations","http://www.guidetranspiration.com/wp-content/uploads/2014/11/Arr%C3%AAter-la-transpiration-des-aisselles.jpg","SOINS DU CORPS"));
        cities.add(new MyObject("Se Doucher","http://img.over-blog-kiwi.com/1/05/16/82/20150116/ob_d241b6_a-quelle-frequence-doit-on-se-doucher.jpg","SOINS DU CORPS"));
        cities.add(new MyObject("Manucure","http://we-love-nail-art.com/medias/2014-03/3d28ba379bdec7d80fa9ba83791bd014-646x446.png","SOINS DU CORPS"));
        cities.add(new MyObject("Les Cheveux Afro","http://cdn2-doctissimo.ladmedia.fr/var/doctissimo/storage/images/media/images/faire-pousser-ses-cheveux-afro-article/814143-1-fre-FR/faire-pousser-ses-cheveux-afro-article.jpg","SOINS DU CORPS"));
        cities.add(new MyObject("Anti-vergetures","http://cdn3-doctissimo.ladmedia.fr/var/doctissimo/storage/images/media/images/cellulite-art2/1331242-1-fre-FR/cellulite-art.jpg","SOINS DU CORPS"));
        cities.add(new MyObject("Peau Grasse","http://www.afriquefemme.com/images/0-0-0AAAAAAAAAAVi.jpg","SOINS DU CORPS"));
        cities.add(new MyObject("Ventre Plat","http://footage.framepool.com/shotimg/qf/310915709-swimming-pool-bikini-afro-americains-metis.jpg","SOINS DU CORPS"));
        cities.add(new MyObject("Produits à éviter","http://www.afriquefemme.com/images/00-visagecostematiooo.jpg","SOINS DU CORPS"));
    }



}
