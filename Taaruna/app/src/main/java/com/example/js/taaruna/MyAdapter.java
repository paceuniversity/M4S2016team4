package com.example.js.taaruna;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by ADMIN on 11/08/16.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    public List<MyObject> list;

    //ajouter un constructeur prenant en entrée une liste
    public MyAdapter(List<MyObject> list) {
        this.list = list;
    }

    //cette fonction permet de créer les viewHolder
    //et par la même indiquer la vue à inflater (à partir des layout xml)
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int itemType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_soin_dc,viewGroup,false);
        return new MyViewHolder(view);
    }

    //c'est ici que nous allons remplir notre cellule avec le texte/image de chaque MyObjects
    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int position) {
        MyObject myObject = list.get(position);
        myViewHolder.bind(myObject);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder  extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView textViewView;
        private ImageView imageView;

        //itemView est la vue correspondante à 1 cellule
        public MyViewHolder(View itemView) {
            super(itemView);

            //c'est ici que l'on fait nos findView
            textViewView = (TextView) itemView.findViewById(R.id.text);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            final String EXTRA_TEXT = "text";

                        MyObject myObject = list.get(getAdapterPosition());

                        Intent intent = new Intent(v.getContext(),Detail.class);
                        intent.putExtra(EXTRA_TEXT, myObject.getText().toString());
                        v.getContext().startActivity (intent);


        }

        //puis ajouter une fonction pour remplir la cellule en fonction d'un MyObject
        public void bind(MyObject myObject){
            textViewView.setText(myObject.getText());
            Picasso.with(imageView.getContext()).load(myObject.getImageUrl()).centerCrop().fit().into(imageView);
        }

    }

}
