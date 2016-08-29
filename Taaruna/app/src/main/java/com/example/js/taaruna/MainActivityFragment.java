package com.example.js.taaruna;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {


    private Button butSDC = null;
    private Button astuce= null;
    private Button maquill = null;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        butSDC = (Button)rootView.findViewById(R.id.butSC);
        butSDC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SoinDC.class);
                startActivity(intent);
            }
        });

        astuce = (Button) rootView.findViewById(R.id.butAN);
        astuce.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Astuces.class);
                startActivity(intent);

            }
        });

        maquill= (Button) rootView.findViewById(R.id.butMaq);
        maquill.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Maquillage.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
