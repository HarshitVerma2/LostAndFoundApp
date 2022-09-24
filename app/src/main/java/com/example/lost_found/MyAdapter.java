package com.example.lost_found;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<vendor1> list;

    public MyAdapter(Context context, ArrayList<vendor1> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.items,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        vendor1 vend1=list.get(position);
        holder.objName.setText(vend1.getObjName());
        holder.name.setText(vend1.getName());
        holder.phone.setText(vend1.getPhone());
        holder.date.setText(vend1.getDate());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView objName,name,phone,date;

        public MyViewHolder(View itemView){
            super(itemView);

            objName=itemView.findViewById(R.id.objName);
            name=itemView.findViewById(R.id.name);
            phone=itemView.findViewById(R.id.phone);
            date=itemView.findViewById(R.id.date);

        }
    }
}
