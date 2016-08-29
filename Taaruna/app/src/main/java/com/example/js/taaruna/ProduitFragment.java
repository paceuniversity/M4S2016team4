package com.example.js.taaruna;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/**
 * Created by ADMIN on 24/08/2016.
 */
public class ProduitFragment extends Fragment {

    private RecyclerView rcv;

    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v=inflater.inflate(R.layout.produit_fragment,null);

        //RecyclerView
        rcv= (RecyclerView) v.findViewById(R.id.recyclerProduit);
        rcv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rcv.setHasFixedSize(true);
        rcv.setAdapter(new TestRecyclerViewAdapter(getActivity(),getProduitView()));

        return v;
    }

    private ArrayList<MyObject> getProduitView() {

        //Ensembles des Objets relatives aux Produits
        ArrayList<MyObject> produits= new ArrayList<>();

        //Création d'un Objet Produit
        MyObject produit= new MyObject("Fond De Teint Pro","https://raw.githubusercontent.com/paceuniversity/M4S2016team4/d90fbcdffd14ee622aeb99cda8cabe4f91bafabe/Images_Taaruna/poudre.jpg","PRODUIT");

        //Ajout de l'objet à l'ensemble
       produits.add(produit);

        //Création d'un Objet Produit
        MyObject produit1= new MyObject("Masscara","https://raw.githubusercontent.com/paceuniversity/M4S2016team4/d90fbcdffd14ee622aeb99cda8cabe4f91bafabe/Images_Taaruna/mascara.png","PRODUIT");

        //Ajout de l'objet à l'ensemble
        produits.add(produit1);

        //Création d'un Objet Produit
        MyObject produit2= new MyObject("Ombre à paupière","https://raw.githubusercontent.com/paceuniversity/M4S2016team4/d90fbcdffd14ee622aeb99cda8cabe4f91bafabe/Images_Taaruna/ombre_paupiere.png","PRODUIT");

        //Ajout de l'objet à l'ensemble
        produits.add(produit2);

        //Création d'un Objet Produit
        MyObject produit3= new MyObject("Poudre teint parfait","https://raw.githubusercontent.com/paceuniversity/M4S2016team4/d90fbcdffd14ee622aeb99cda8cabe4f91bafabe/Images_Taaruna/fonte.jpg","PRODUIT");

        //Ajout de l'objet à l'ensemble
        produits.add(produit3);

        //Création d'un Objet Produit
        MyObject produit4= new MyObject("Floral Gloss","https://raw.githubusercontent.com/paceuniversity/M4S2016team4/d90fbcdffd14ee622aeb99cda8cabe4f91bafabe/Images_Taaruna/lol.jpg","PRODUIT");

        //Ajout de l'objet à l'ensemble
        produits.add(produit4);

        //Création d'un Objet Produit
        MyObject produit5 = new MyObject("Eyelinner","https://raw.githubusercontent.com/paceuniversity/M4S2016team4/d90fbcdffd14ee622aeb99cda8cabe4f91bafabe/Images_Taaruna/eyeliner.jpg","PRODUIT");

        //Ajout de l'objet à l'ensemble
        produits.add(produit5);

        //Création d'un Objet Produit
        MyObject produit6= new MyObject("Stick teint parfait","https://raw.githubusercontent.com/paceuniversity/M4S2016team4/d90fbcdffd14ee622aeb99cda8cabe4f91bafabe/Images_Taaruna/fond.png","PRODUIT");

        //Ajout de l'objet à l'ensemble
        produits.add(produit6);

        return  produits;
    }

    //Modifier le titre du fragment

    public  String toString(){
        return "PRODUIT";
    }

}
