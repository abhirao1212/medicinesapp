package com.example.medicines_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class First_Fragment extends Fragment {
    /*------------------Adapter recycler----------------*/
    Recycler_Adapter1 recycleradapter;

    RecyclerView recyclerView1;
    ArrayList<ModelClass>arrayList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_first_,container,false);

        recyclerView1 = root.findViewById(R.id.recycler1);

        arrayList= new ArrayList<>();

//         recycleradapter=new Recycler_Adapter1(arrayList,getContext());
        Recycler_Adapter1 recycler_adapter1 = new Recycler_Adapter1(arrayList,getContext());
        recyclerView1.setLayoutManager(new GridLayoutManager(getContext(),4));
        recyclerView1.setAdapter(recycler_adapter1);


        return root;

    }
}