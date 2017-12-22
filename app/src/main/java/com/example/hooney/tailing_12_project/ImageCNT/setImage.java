package com.example.hooney.tailing_12_project.ImageCNT;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.widget.ImageView;

import java.io.IOException;

/**
 * Created by hooney on 2017. 12. 15..
 */

public class setImage {
    public static void setImageView(Context context, String uri, ImageView imageView){
        try {
            Bitmap bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), Uri.parse(uri));

            //리사이즈
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();

            Bitmap resized = null;

            //높이가 500이상 일때
            while (height > 500) {
                resized = Bitmap.createScaledBitmap(bitmap, (width * 500) / height, 500, true);
                height = resized.getHeight();
                width = resized.getWidth();
            }

            //배치해놓은 ImageView에 set
            imageView.setImageBitmap(resized);

            //imageView.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void setImageView(Context context, String uri, ImageView imageView, int type){

    }
}
