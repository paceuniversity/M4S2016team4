package com.example.js.taaruna;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class AstucesFragment extends Fragment {

    public AstucesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_astuces, container, false);

        ListView lv = (ListView) rootView.findViewById(R.id.listviewlayout);



        ArrayList<HashMap<String, String>> Astuce = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> map;

        map = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        map.put("titre", "Un coup d'éclat au citron");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        map.put("description", "Éclaircir le teint et resserrer...");
        //on insère la référence à l'image (converti en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
        map.put("img", String.valueOf(R.drawable.citron_icone));
        //enfin on ajoute cette hashMap dans la arrayList
        Astuce.add(map);


        map = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        map.put("titre", "Un lait au concombre");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        map.put("description", "Hydrater les peaux normales....");
        //on insère la référence à l'image (converti en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
        map.put("img", String.valueOf(R.drawable.concombre_icone));
        //enfin on ajoute cette hashMap dans la arrayList
        Astuce.add(map);


        map = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        map.put("titre", "Un gommage au sel");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        map.put("description", "Éliminer les peaux mortes...");
        //on insère la référence à l'image (converti en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
        map.put("img", String.valueOf(R.drawable.gommage_sel_icone));
        //enfin on ajoute cette hashMap dans la arrayList
        Astuce.add(map);

        map = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        map.put("titre", "Un soin cheveux secs à l'avocat");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        map.put("description", "Redonner du soyeux à des cheveux cassants....");
        //on insère la référence à l'image (converti en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
        map.put("img", String.valueOf(R.drawable.avocat_icone));
        //enfin on ajoute cette hashMap dans la arrayList
        Astuce.add(map);

        map = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        map.put("titre", "Un soin belle main");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        map.put("description", "Sauver des mains sèches et rugueuses...");
        //on insère la référence à l'image (converti en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
        map.put("img", String.valueOf(R.drawable.main_icone));
        //enfin on ajoute cette hashMap dans la arrayList
        Astuce.add(map);

        map = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        map.put("titre", "Un masque à la tomate");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        map.put("description", "Réguler les peaux grasses...");
        //on insère la référence à l'image (converti en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
        map.put("img", String.valueOf(R.drawable.tomate_icone));
        //enfin on ajoute cette hashMap dans la arrayList
        Astuce.add(map);

        map = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        map.put("titre", "Un sourire éclatant");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        map.put("description", "Ecrasez une fraise juste mûre et...");
        //on insère la référence à l'image (converti en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
        map.put("img", String.valueOf(R.drawable.sourire_icone));
        //enfin on ajoute cette hashMap dans la arrayList
        Astuce.add(map);

        map = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        map.put("titre", "Démaquillage express");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        map.put("description", "On applique des touches de lait sur le front...");
        //on insère la référence à l'image (converti en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
        map.put("img", String.valueOf(R.drawable.demaquillage_icone));
        //enfin on ajoute cette hashMap dans la arrayList
        Astuce.add(map);

        map = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        map.put("titre", "Gommage à la pastèque");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        map.put("description", "Mélangez tous les ingrédients jusqu’à obtenir...");
        //on insère la référence à l'image (converti en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
        map.put("img", String.valueOf(R.drawable.pasteque_icone));
        //enfin on ajoute cette hashMap dans la arrayList
        Astuce.add(map);


        //Création d'un SimpleAdapter qui se chargera de mettre les items présents dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter astuceAdapter = new SimpleAdapter(this.getContext(), Astuce, R.layout.textastuceview,
                new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});



        lv.setAdapter(astuceAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final String EXTRA_TEXT = "text";
                Intent intent = new Intent(getContext(),Detail.class);
                intent.putExtra(EXTRA_TEXT,Integer.toString(position));
                startActivity (intent);
            }

        });
        return  rootView;
    }





}
