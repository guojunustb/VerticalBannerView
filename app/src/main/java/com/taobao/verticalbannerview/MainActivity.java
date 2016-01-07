package com.taobao.verticalbannerview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.taobao.library.VerticalBannerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        List<Model01> datas01 = new ArrayList<>();
        datas01.add(new Model01("白日依山尽","--->白日依山尽"));
        datas01.add(new Model01("黄河入海流","--->黄河入海流"));
        datas01.add(new Model01("欲穷千里目","--->欲穷千里目"));
        datas01.add(new Model01("更上一层楼","--->更上一层楼"));

        final SampleAdapter01 adapter01 = new SampleAdapter01(datas01);
        final VerticalBannerView banner01 = (VerticalBannerView) findViewById(R.id.banner_01);
        banner01.setAdapter(adapter01);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                banner01.start();
            }
        });

        findViewById(R.id.btn_stop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                banner01.stop();
            }
        });

        findViewById(R.id.btn_update).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Model01> newData = new ArrayList<>();
                newData.add(new Model01("锄禾日当午","--->锄禾日当午"));
                newData.add(new Model01("汗滴禾下土","--->汗滴禾下土"));
                newData.add(new Model01("谁知盘中餐","--->谁知盘中餐"));
                newData.add(new Model01("粒粒皆辛苦","--->粒粒皆辛苦"));
                adapter01.setData(newData);
            }
        });


        //-----------------------
        List<Model01> datas02 = new ArrayList<>();
        datas02.add(new Model01("Life was so beautiful","--->Life was so beautiful,"));
        datas02.add(new Model01("From morning to evening","--->From morning to evening"));
        datas02.add(new Model01("We enjoyed the road to school","--->We enjoyed the road to school,"));
        datas02.add(new Model01("Birds chirped and Peace lingered","--->Birds chirped and Peace lingered"));
        final SampleAdapter02 adapter02 = new SampleAdapter02(datas02);
        final VerticalBannerView banner02 = (VerticalBannerView) findViewById(R.id.banner_02);
        banner02.setAdapter(adapter02);
        banner02.start();

        //------------------------

        List<Model01> datas03 = new ArrayList<>();
        datas03.add(new Model01("Life is so insecure","最新"));
        datas03.add(new Model01("From afternoon to night","最火爆"));
        datas03.add(new Model01("We fear the road to school","hot"));
        datas03.add(new Model01("There may be destructive bombs,Peace has demolished","new"));
        final SampleAdapter03 adapter03 = new SampleAdapter03(datas03);
        final VerticalBannerView banner03 = (VerticalBannerView) findViewById(R.id.banner_03);
        banner03.setAdapter(adapter03);
        banner03.start();

    }

}






















