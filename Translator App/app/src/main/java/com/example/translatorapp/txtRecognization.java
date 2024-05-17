package com.example.translatorapp;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

import com.github.dhaval2404.imagepicker.ImagePicker;

public class txtRecognization{

    static Context context;
    static ImageView inputCamera;
    static Uri imageUri;

    private static final int REQ_CODE = 100;
    static MainActivity ma = new MainActivity();

    public txtRecognization(Context context){
        this.context = context;
    }
    static void setListener(ImageView id){
        inputCamera = id;
        ImagePicker.with((Activity) context)
                .crop()	    			//Crop image(Optional), Check Customization for more option
                .compress(1024)			//Final image size will be less than 1 MB(Optional)
                .maxResultSize(1080, 1080)	//Final image resolution will be less than 1080 x 1080(Optional)
                .start();

    }

}
