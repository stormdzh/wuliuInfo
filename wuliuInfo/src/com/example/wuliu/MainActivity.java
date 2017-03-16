package com.example.wuliu;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

    private ListView lv_trace;
    private ArrayList<Trace> tradeLists = new ArrayList<Trace>();
    private TraceAdapter ta;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = MainActivity.this;
        initView();
    }

    private void initView(){
        lv_trace = (ListView)findViewById(R.id.lv_trace);
        initData();
        ta = new TraceAdapter(tradeLists, context);
        lv_trace.setAdapter(ta);
    }

    private void initData(){

        tradeLists.add(new Trace(true, "������������", "", "2016-03-16 18:30:43"));
        tradeLists.add(new Trace(false, "�����ѵ������ת������", "", "2016-03-17 13:30:43"));
        tradeLists.add(new Trace(false, "��Ʒ�ѵ����ϻ���վ", "", "2016-03-18 13:30:43"));
        tradeLists.add(new Trace(false, "�������ʹ���ϸ�����վ��", "", "2016-03-19 13:30:43"));
        tradeLists.add(new Trace(false, "�̼��Ѵӹ㶫����", "15253157943", "2016-03-16 13:30:43"));
    }
}
