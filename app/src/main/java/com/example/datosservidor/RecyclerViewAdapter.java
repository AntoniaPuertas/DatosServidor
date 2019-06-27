package com.example.datosservidor;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolderVillanos> {

    private ArrayList<Villano> listaVillanos;
    private Context context;
    private ArrayList<ViewHolderVillanos> listaHolderVillanos = null;

    public RecyclerViewAdapter(Context context, ArrayList<Villano> listaVillanos) {
        this.listaVillanos = listaVillanos;
        this.context = context;
    }



    @Override
    public ViewHolderVillanos onCreateViewHolder(ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista, parent, false);
        return new ViewHolderVillanos(listItem);
    }

    @Override
    public void onBindViewHolder(final ViewHolderVillanos holder, final int position) {
        listaHolderVillanos.add(holder);

        holder.imgVillano.setImageResource(R.drawable.ic_launcher_background);
        holder.txtNombreVillano.setText(listaVillanos.get(position).getNombre());
        holder.txtPelicula.setText(listaVillanos.get(position).getPelicula());
        holder.txtPoderes.setText(listaVillanos.get(position).getPoderes());
    }

    @Override
    public int getItemCount() {
        return listaVillanos.size();
    }

    static class ViewHolderVillanos extends RecyclerView.ViewHolder {

        // Referencias UI
        ImageView imgVillano;
        TextView txtNombreVillano;
        TextView txtPelicula;
        TextView txtPoderes;



        public ViewHolderVillanos(View itemView) {
            super(itemView);
            imgVillano = (ImageView)itemView.findViewById(R.id.imgVillano);
            txtNombreVillano = (TextView)itemView.findViewById(R.id.txtNombreVillano);
            txtPelicula = (TextView)itemView.findViewById(R.id.txtPelicula);
            txtPoderes = (TextView)itemView.findViewById(R.id.txtPoderes);

        }

    }
}
