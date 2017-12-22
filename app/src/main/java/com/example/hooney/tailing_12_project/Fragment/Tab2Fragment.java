package com.example.hooney.tailing_12_project.Fragment;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.hooney.tailing_12_project.ImageCNT.setImage;
import com.example.hooney.tailing_12_project.R;

import java.io.IOException;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2Fragment extends Fragment {
    private final int SIGNAL_G = 1001;

    private View view;

    private ImageView imageView;
    private Button loadBTN;


    public Tab2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_tab2, container, false);

        init();
        event();

        return view;
    }

    private void init(){
        imageView = (ImageView) view.findViewById(R.id.tab2_loadImage);
        loadBTN = (Button) view.findViewById(R.id.tab2_loadImageBTN);
    }

    private void event(){
        loadBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType(android.provider.MediaStore.Images.Media.CONTENT_TYPE);
                intent.setData(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent, SIGNAL_G);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == SIGNAL_G){
            if(resultCode== Activity.RESULT_OK){
                setImage.setImageView(getContext(), data.getData().toString(), imageView);
            }else{
                Toast.makeText(getContext(), "이미지를 불러오지 못했습니다", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
