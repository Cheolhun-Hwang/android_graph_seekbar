package com.example.hooney.tailing_12_project.Recycler;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hooney.tailing_12_project.R;

/**
 * Created by hooney on 2017. 12. 8..
 */

public class mainDataHolder extends ViewHolder {
    public ImageView imageView;
    public TextView context;
    public Button button;


    public mainDataHolder(View itemView) {
        super(itemView);

        this.imageView = (ImageView) itemView.findViewById(R.id.item_main_imageview);
        this.context = (TextView) itemView.findViewById(R.id.item_main_textview);
        this.button = (Button) itemView.findViewById(R.id.item_main_button);

    }
}
