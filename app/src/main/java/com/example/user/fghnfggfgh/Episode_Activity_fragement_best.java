package com.example.user.fghnfggfgh;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by User on 2018-03-10.
 */

public class Episode_Activity_fragement_best extends Fragment {

    Button button1;
    ListView listView1;
    Episode_Activity_fragement_best_Adater0 adapter;
    ArrayList<Episode_Activity_fragement_best_DTO0> sindto;

    Button button2;
    ListView listView2;
    Episode_Activity_fragement_best_Adater0 adapter1;
    ArrayList<Episode_Activity_fragement_best_DTO1> sindto1;


    public Episode_Activity_fragement_best(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup group = (ViewGroup) inflater.inflate(R.layout.activity_episode_fragement_best,container,false);
        button1 = group.findViewById(R.id.button_Main_00);
        listView1 = group.findViewById(R.id.listView_Main_00);
        sindto = new ArrayList<>();
        adapter = new Episode_Activity_fragement_best_Adater0(getContext(),sindto);
        adapter.addDto(new Episode_Activity_fragement_best_DTO0("이룸0","000-9854-4589",27,R.drawable.img1));
        adapter.addDto(new Episode_Activity_fragement_best_DTO0("이룸1","111-9854-1234",29,R.drawable.img1));
        adapter.addDto(new Episode_Activity_fragement_best_DTO0("이룸2","222-9854-4231",24,R.drawable.img1));
        adapter.addDto(new Episode_Activity_fragement_best_DTO0("이룸3","333-9854-5676",28,R.drawable.img1));
        adapter.addDto(new Episode_Activity_fragement_best_DTO0("이룸4","444-9854-9998",23,R.drawable.img1));
        adapter.addDto(new Episode_Activity_fragement_best_DTO0("이룸5","555-9854-1345",26,R.drawable.img1));
        listView1.setAdapter(adapter);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                Episode_Activity_fragement_best_DTO0 dto = (Episode_Activity_fragement_best_DTO0) adapter.getItem(pos);
            }
        });


/*        button2 = group.findViewById(R.id.button_Main_01);
        listView2 = group.findViewById(R.id.listView_Main_01);
        sindto1 = new ArrayList<>();
        adapter1 = new Episode_Activity_fragement_best_Adater1(getContext(),sindto1);
        adapter1.addDto(new Episode_Activity_fragement_best_DTO1("aa","555-9854-1345",33,R.drawable.img1));*/




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = "이민기";
                String mobile = "222-5555-8888";
                int age = 22;
                int resId = R.drawable.img1;
                adapter.addDto(new Episode_Activity_fragement_best_DTO0(name,mobile, age,resId));

                adapter.notifyDataSetChanged();

            }
        });

        return group;
    }
}
