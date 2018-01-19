package com.example.student.customview;

import android.graphics.drawable.Icon;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.list_view);
        datasettiog();
    }
    public void datasettiog(){
        CustomViewAdapter customViewAdapter = new CustomViewAdapter();


        for(int i = 0;i<10;i++){
            customViewAdapter.addItem(ContextCompat.getDrawable(getApplicationContext(),R.drawable.ic_launcher_background),"name "+i,"contents"+i);
        }
        listView.setAdapter(customViewAdapter);
    }
}
