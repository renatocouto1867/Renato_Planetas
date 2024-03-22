package com.example.renato_planetas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<Planeta> planetas;

    public MyAdapter(LayoutInflater inflater, ArrayList<Planeta> planetas) {
        this.inflater = inflater;
        this.planetas = planetas;
    }

    @Override
    public int getCount() {
        return planetas.size();
    }

    @Override
    public Object getItem(int position) {
        return planetas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Planeta planetas1 = planetas.get(position);
        convertView=inflater.inflate(R.layout.planeta_layout,null);
        TextView texto = convertView.findViewById(R.id.texto);
        texto.setText(planetas1.getNome());
        ImageView imageView = convertView.findViewById(R.id.imagem);
        imageView.setImageResource(planetas1.getImagem());
        return convertView;
    }
}
