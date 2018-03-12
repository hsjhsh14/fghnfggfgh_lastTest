package com.example.user.fghnfggfgh;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by User on 2018-03-10.
 */

public class Episode_Activity_fragement_best_genre extends LinearLayout{

    TextView textView1;
    TextView textView2;
    TextView textView3;
    ImageView imageView1;

    public Episode_Activity_fragement_best_genre(Context context){

        super(context);
        init(context);
    }

    public  Episode_Activity_fragement_best_genre(Context context, @Nullable AttributeSet attributeSet){

        super(context,attributeSet);
        init(context);
    }

    public void init(Context context){

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        inflater.inflate(R.layout.activity_episode_layout_best_genre,this,true);

        textView1 = findViewById(R.id.textView_singer_00);
        textView2 = findViewById(R.id.textView_singer_01);
        textView3 = findViewById(R.id.textView_singer_02);
        imageView1 = findViewById(R.id.imageView_singer_00);

    }

    public void setName(String name){

        textView1.setText(name);

    }

    public void setMobile(String mobile){

        textView2.setText(mobile);
    }

    public void setAge(int age){

        textView3.setText(String.valueOf(age));
    }

    public void setImage(int resId){

        imageView1.setImageResource(resId);
    }

}
