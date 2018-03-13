package com.example.user.fghnfggfgh;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toolbar;


public class Episode_Activity extends AppCompatActivity {

    boolean isFromFragment = false;
    boolean isFromMain = false;
    int isFromIndex = -1;

    public Bundle sBundle = null;
    Toolbar toolbar_activity_episode;
    TabLayout tabLayout_activity_episode;

    Episode_Activity_fragement_best episode_activity_fragement_best;
    Episode_Activity_fragement_newssul episode_activity_fragement_newssul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode);
    //gitTest 올라가 주세요 !! 메로로로롱dfvdcxv
        //로로롯로로롷
       // toolbar_activity_episode = findViewById(R.id.ep)

        episode_activity_fragement_best = new Episode_Activity_fragement_best();
        episode_activity_fragement_newssul = new Episode_Activity_fragement_newssul();


        getSupportFragmentManager().beginTransaction().replace(R.id.episode_container,episode_activity_fragement_best).commit();


        tabLayout_activity_episode = findViewById(R.id.episode_tab);
        tabLayout_activity_episode.addTab(tabLayout_activity_episode.newTab().setText("베스트글"));
        tabLayout_activity_episode.addTab(tabLayout_activity_episode.newTab().setText("최신글"));


        tabLayout_activity_episode.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                int pos = tab.getPosition();
                if(pos == 0){
                    getSupportFragmentManager().beginTransaction().replace(R.id.episode_container,episode_activity_fragement_newssul).commit();
                }else if(pos == 1){
                    getSupportFragmentManager().beginTransaction().replace(R.id.episode_container,episode_activity_fragement_best).commit();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



    }

}
