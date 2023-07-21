package com.example.medicines_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Recycler_Adapter1 extends RecyclerView.Adapter<Recycler_Adapter1.Myviewholder> {

    ArrayList<ModelClass> arrayList;
    Context context;

    public Recycler_Adapter1(ArrayList<ModelClass> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public Recycler_Adapter1.Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_adapter1,null,false);
        Myviewholder myviewholder=new Myviewholder(view);
        return myviewholder;



    }

    @Override
    public void onBindViewHolder(@NonNull Recycler_Adapter1.Myviewholder holder, int position) {


        Glide.with(context).load(arrayList.get(position).getImage()).into(holder.img);
        holder.text.setText(arrayList.get(position).getName());



    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class Myviewholder extends RecyclerView.ViewHolder {

        TextView text;
        ImageView img;

        public Myviewholder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img_rectop);
            text = itemView.findViewById(R.id.textxml1);
        }
    }
}
