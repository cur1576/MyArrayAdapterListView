package com.example.myarrayadapterlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<MyItem> items = new ArrayList<>();
        items.add(new MyItem("Christian", "aus Berlin",R.mipmap.ic_launcher,true));
        items.add(new MyItem("Frank", "aus Berlin",R.mipmap.ic_launcher_round,false));
        items.add(new MyItem("Ronny", "aus Berlin",R.mipmap.ic_launcher_round,true));
        items.add(new MyItem("Sebastien", "aus Offenbach",R.mipmap.ic_launcher,true));

        ListView listView = findViewById(R.id.lv_mylist);

        View header = getLayoutInflater().inflate(R.layout.listview_header,null);
        MyAdapter adapter = new MyAdapter(this,R.layout.listview_item,items);
        listView.addHeaderView(header);
        listView.setAdapter(adapter);
    }
}
