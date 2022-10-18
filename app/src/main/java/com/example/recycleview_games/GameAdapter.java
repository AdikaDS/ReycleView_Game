package com.example.recycleview_games;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.ViewHolder>{

    private final ArrayList<Game> values;

    public GameAdapter(ArrayList<Game> values) {
        this.values = values;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_games, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameAdapter.ViewHolder holder, int position) {
        Game game = values.get(position);
        holder.txtNama.setText(game.getNamaGame());
        holder.txtPublish.setText(game.getPublisherGame());
        holder.txtDesk.setText(game.getDeskGame());

        Glide.with(holder.itemView.getContext())
                .load(game.getGambarGame())
                .apply(new RequestOptions().override(70,70))
                .into(holder.imgPict);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailGame.class);
                Bundle bundle = new Bundle();

                bundle.putString("nama", game.getNamaGame());
                bundle.putString("publish", game.getPublisherGame());
                bundle.putString("desk", game.getDeskGame());
                bundle.putInt("pict", game.getGambarGame());
                intent.putExtras(bundle);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtNama, txtPublish, txtDesk;
        ImageView imgPict;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNama = itemView.findViewById(R.id.nama_game);
            txtPublish = itemView.findViewById(R.id.publisher);
            txtDesk = itemView.findViewById(R.id.desk_game);
            imgPict = itemView.findViewById(R.id.gambar_games);

        }
    }
}
