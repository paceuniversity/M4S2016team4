package com.example.js.taaruna;

/**
 * Created by ADMIN on 21/08/2016.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;



public class TestRecyclerViewAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context c;
   public ArrayList<MyObject> contenus;




    public TestRecyclerViewAdapter(Context c, ArrayList<MyObject> contenus) {
        this.c=c;
        this.contenus = contenus;
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_card,parent, false);
        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        MyObject myObject = contenus.get(position);
        holder.bind(myObject);


        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {

                 final String EXTRA_TEXT = "text";

                String test=contenus.get(position).getRubrique();
                if (test == "MAQUILLAGE"){
                    Intent intent = new Intent(v.getContext(),LecteurYoutubeTaaruna.class);
                    intent.putExtra(EXTRA_TEXT,Integer.toString(position));
                    v.getContext().startActivity (intent);
                }else if(test == "PRODUIT"){
                    Intent intent = new Intent(v.getContext(),Detail.class);
                    intent.putExtra(EXTRA_TEXT,contenus.get(position).getText());
                    v.getContext().startActivity (intent);
                }

            }
        });



    }

    @Override
    public int getItemCount() {
        return contenus.size();
    }


}