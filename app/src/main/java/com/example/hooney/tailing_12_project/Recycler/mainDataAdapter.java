package com.example.hooney.tailing_12_project.Recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.hooney.tailing_12_project.R;

import java.util.ArrayList;

/**
 * Created by hooney on 2017. 12. 8..
 */

public class mainDataAdapter extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<mainDataItem> list;

    public mainDataAdapter(Context context, ArrayList<mainDataItem> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyc_main,parent,false);
        mainDataHolder holder = new mainDataHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        mainDataHolder hold = (mainDataHolder) holder;

        //hold.imageView.

        hold.context.setText(list.get(position).getContext());

        hold.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "MSG : " + list.get(position).getSendMag(), Toast.LENGTH_SHORT).show();
            }
        });

        hold.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "List Item : " + list.get(position).getSendMag(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
