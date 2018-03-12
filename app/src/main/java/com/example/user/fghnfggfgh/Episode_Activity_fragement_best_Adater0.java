package com.example.user.fghnfggfgh;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by User on 2018-03-10.
 */

public class Episode_Activity_fragement_best_Adater0 extends BaseAdapter{



    Context context;
    ArrayList<Episode_Activity_fragement_best_DTO0> sindto ;

    public Episode_Activity_fragement_best_Adater0(Context context,ArrayList<Episode_Activity_fragement_best_DTO0> sindto){
        this.context = context;
        this.sindto=sindto;

    }

    public void addDto(Episode_Activity_fragement_best_DTO0 dto){
        Log.d("adapter","SingerAdater_addDto");
        sindto.add(dto);
    }   //SingerDTO 에 저장된 묶음을 ArrayList로 생성한 sindto 에 저장한다.

    @Override
    public int getCount() {
        Log.d("adapter","SingerAdater_getCount");
        return sindto.size();
    }// 화면에 나타낼 리스트 갯수를 리턴 해준다

    @Override
    public Object getItem(int pos) {
        Log.d("adapter","SingerAdater_getItem");
        return sindto.get(pos);
    }           //화면이 어떤 pos 값을 가지고 있나에 따라서 화면 이 바뀐다.

    @Override
    public long getItemId(int pos) {
        Log.d("adapter","SingerAdater_getItemId");
        return pos;
    }   //위와 비슷함

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {

        Episode_Activity_fragement_best_genre singView = null;

        if(view == null){
            Log.d("adapter","SingerAdater_getView_view_cut");
            singView = new Episode_Activity_fragement_best_genre(context);
        }else{
            singView = (Episode_Activity_fragement_best_genre) view;
        }

        Episode_Activity_fragement_best_DTO0 dto = sindto.get(pos);
        singView.setName(dto.getName());
        singView.setMobile(dto.getMobile());
        singView.setAge(dto.getAge());
        singView.setImage(dto.getResId());

        return singView;
    }

}
