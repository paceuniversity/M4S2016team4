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
public class MaquillageFragment extends Fragment {
    private RecyclerView rcv;


    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v=inflater.inflate(R.layout.maquillage_fragment,null);

        //RecyclerView
        rcv= (RecyclerView) v.findViewById(R.id.recyclerMaquillage);
        rcv.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        rcv.setHasFixedSize(true);
        rcv.setAdapter(new TestRecyclerViewAdapter(this.getActivity(),getMaquillageView()));





        return v;
    }

    private ArrayList<MyObject> getMaquillageView() {
        //Ensembles des Objets relatives aux Maquillages
        ArrayList<MyObject> maquis= new ArrayList<>();

        //Création d'un Objet Maquillage
        MyObject maqui= new MyObject("Maquillage pour une soirée","https://raw.githubusercontent.com/paceuniversity/M4S2016team4/01714ee493900fb1aba865e5fd4d110e486bdd2d/Images_Taaruna/night.PNG","MAQUILLAGE");

        //Ajout de l'objet à l'ensemble
        maquis.add(maqui);

        MyObject maqui1= new MyObject("Faire ses sourcils","https://raw.githubusercontent.com/paceuniversity/M4S2016team4/01714ee493900fb1aba865e5fd4d110e486bdd2d/Images_Taaruna/sourcils.PNG","MAQUILLAGE");

        //Ajout de l'objet à l'ensemble
        maquis.add(maqui1);

        MyObject maqui2= new MyObject("Beaux sourcils sans les épiler","https://raw.githubusercontent.com/paceuniversity/M4S2016team4/01714ee493900fb1aba865e5fd4d110e486bdd2d/Images_Taaruna/epiler.PNG","MAQUILLAGE");

        //Ajout de l'objet à l'ensemble
        maquis.add(maqui2);

        MyObject maqui3= new MyObject("Maquillage de marié","https://raw.githubusercontent.com/paceuniversity/M4S2016team4/01714ee493900fb1aba865e5fd4d110e486bdd2d/Images_Taaruna/mariage.PNG","MAQUILLAGE");

        //Ajout de l'objet à l'ensemble
        maquis.add(maqui3);

        MyObject maqui4= new MyObject("Teint Parfait pour shooting","https://raw.githubusercontent.com/paceuniversity/M4S2016team4/01714ee493900fb1aba865e5fd4d110e486bdd2d/Images_Taaruna/teint.PNG","MAQUILLAGE");

        //Ajout de l'objet à l'ensemble
        maquis.add(maqui4);

        MyObject maqui5= new MyObject("Maquillage peau noire","https://raw.githubusercontent.com/paceuniversity/M4S2016team4/01714ee493900fb1aba865e5fd4d110e486bdd2d/Images_Taaruna/advice.PNG","MAQUILLAGE");

        //Ajout de l'objet à l'ensemble
        maquis.add(maqui5);

        MyObject maqui6= new MyObject("Mettre des fares a paupières","https://raw.githubusercontent.com/paceuniversity/M4S2016team4/01714ee493900fb1aba865e5fd4d110e486bdd2d/Images_Taaruna/fares.PNG","MAQUILLAGE");

        //Ajout de l'objet à l'ensemble
        maquis.add(maqui6);

        MyObject maqui7= new MyObject("Appliquer des rouges à levres","https://raw.githubusercontent.com/paceuniversity/M4S2016team4/01714ee493900fb1aba865e5fd4d110e486bdd2d/Images_Taaruna/gloss.jpg","MAQUILLAGE");

        //Ajout de l'objet à l'ensemble
        maquis.add(maqui7);

        return  maquis;
    }

    //Modifier le titre du fragment

    public  String toString(){
        return "MAQUILLAGE";
    }

}
