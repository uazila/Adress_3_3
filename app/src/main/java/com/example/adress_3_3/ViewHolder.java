package com.example.adress_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_adress;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_adress=itemView.findViewById(R.id.adress);

    }
    public void bind (String adress){
        tv_adress.setText(adress);
    }
}
