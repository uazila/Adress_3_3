package com.example.adress_3_3;

import android.icu.text.ListFormatter;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.AbstractList;
import java.util.ArrayList;

public class AdressAdapter extends RecyclerView.Adapter<ViewHolder> {
    private AbstractList<String>adresses=new ArrayList<>();

    public AdressAdapter(AbstractList<String> adresses) {
        this.adresses=adresses;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_adress, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(adresses.get(position));
    }

    @Override
    public int getItemCount() {
        return adresses.size();
    }
}
