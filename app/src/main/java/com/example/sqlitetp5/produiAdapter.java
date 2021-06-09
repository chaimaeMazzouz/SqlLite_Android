package com.example.sqlitetp5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class produiAdapter extends BaseAdapter {
    private ArrayList<Produit> liste;
    private Context ctx;
    private int resId;
    public produiAdapter(@NonNull Context context, @NonNull ArrayList<Produit> liste) {
        this.liste=liste; this.ctx=context;
    }
    @Override
    public int getCount() {
        return liste.size();
    }

    @Override
    public Object getItem(int position) {
        return liste.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Produit pro=liste.get(position); if(convertView==null) {
            LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.poduit_item, parent, false);
        }
        TextView code = (TextView) convertView.findViewById(R.id.code_l);
        TextView desc = (TextView) convertView.findViewById(R.id.description_l);
        TextView prix = (TextView) convertView.findViewById(R.id.prix_l);
        code.setText(String.valueOf(pro.getCode()));
        desc.setText(pro.getDescription());
        prix.setText(String.valueOf(pro.getPrix()));
        return convertView;
    }
}
