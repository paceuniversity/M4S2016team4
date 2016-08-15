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

import java.util.ArrayList;
import java.util.Arrays;
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

        String[] astuces = {"Un coup d'éclat au citron",
                            "Un lait au concombre",
                            "Un gommage au sel",
                            "Un soin cheveux secs à l'avocat",
                            "Un soin belle main",
                            "Un masque à la tomate",
                            "Un sourire éclatant",
                            "Démaquillage express",
                            "Gommage à la pastèque"};

        List<String> Astuce = new ArrayList<String>();
        for (int i=0;i<astuces.length;i++){
            Astuce.add(astuces[i]);
        }

        ArrayAdapter<String> astuceAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.textastuceview,
                R.id.textastuceviewitem,
                Astuce);

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
