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

public class Episode_Activity_fragement_best_Adater1 extends BaseAdapter{



    Context context1;
    ArrayList<Episode_Activity_fragement_best_DTO1> sindto1 ;

    public Episode_Activity_fragement_best_Adater1(Context context1, ArrayList<Episode_Activity_fragement_best_DTO1> sindto1){
        this.context1 = context1;
        this.sindto1=sindto1;

    }

    public void addDto(Episode_Activity_fragement_best_DTO1 dto){
        Log.d("adapter","SingerAdater_addDto");
        sindto1.add(dto);
    }   //SingerDTO 에 저장된 묶음을 ArrayList로 생성한 sindto 에 저장한다.

    @Override
    public int getCount() {
        Log.d("adapter","SingerAdater_getCount");
        return sindto1.size();
    }// 화면에 나타낼 리스트 갯수를 리턴 해준다

    @Override
    public Object getItem(int pos) {
        Log.d("adapter","SingerAdater_getItem");
        return sindto1.get(pos);
    }           //화면이 어떤 pos 값을 가지고 있나에 따라서 화면 이 바뀐다.

    @Override
    public long getItemId(int pos) {
        Log.d("adapter","SingerAdater_getItemId");
        return pos;
    }   //위와 비슷함

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {

        Episode_Activity_fragement_best_list singView = null;

        if(view == null){
            Log.d("adapter","SingerAdater_getView_view_cut");
            singView = new Episode_Activity_fragement_best_list(context1);
        }else{
            singView = (Episode_Activity_fragement_best_list) view;
        }

        Episode_Activity_fragement_best_DTO1 dto = sindto1.get(pos);
        singView.setName(dto.getName());
        singView.setMobile(dto.getMobile());
        singView.setAge(dto.getAge());
        singView.setImage(dto.getResId());

        return singView;
    }

}
