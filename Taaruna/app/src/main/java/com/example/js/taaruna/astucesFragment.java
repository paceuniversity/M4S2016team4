package com.example.js.taaruna;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
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
public class astucesFragment extends Fragment {

    public astucesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_astuces, container, false);


        String[] astuces = {"Un coup d'éclat au citron", "Un lait au concombre", "Un gommage au sel", "Un soin cheveux secs à l'avocat", "Un soin belle main", "Un masque à la tomate","Un sourire éclatant", "Démaquillage express", "Gommage à la pastèque"};
        List<String> Astuce = new ArrayList<String>(Arrays.asList(astuces));

        ArrayAdapter<String> astuceAdapter = new ArrayAdapter<String>(getActivity(),
                R.layout.textastuceview,
                R.id.textastuceviewitem,
                Astuce);

        ListView lv = (ListView) rootView.findViewById(R.id.listviewlayout);
        lv.setAdapter(astuceAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0: {
                        Intent intent = new Intent(getActivity(), MonAstuce1.class);
                        startActivity(intent);

                    }break;
                    case 1: {
                        Intent intent = new Intent(getActivity(), MonAstuce4.class);
                        startActivity(intent);

                    }break;
                    case 2: {
                        Intent intent = new Intent(getActivity(), MonAstuce5.class);
                        startActivity(intent);

                    }break;
                    case 3: {
                        Intent intent = new Intent(getActivity(), MonAstuce6.class);
                        startActivity(intent);

                    }break;
                    case 4: {
                        Intent intent = new Intent(getActivity(), MonAstuce7.class);
                        startActivity(intent);

                    }break;
                    case 5: {
                        Intent intent = new Intent(getActivity(), MonAstuce8.class);
                        startActivity(intent);

                    }break;
                    case 6: {
                        Intent intent = new Intent(getActivity(), MonAstuce.class);
                        startActivity(intent);

                    }break;
                    case 7: {
                        Intent intent = new Intent(getActivity(), MonAstuce2.class);
                        startActivity(intent);

                    }break;
                    case 8: {
                        Intent intent = new Intent(getActivity(), MonAstuce3.class);
                        startActivity(intent);

                    }break;
                }
            }

        });


        return  rootView;
    }
}
