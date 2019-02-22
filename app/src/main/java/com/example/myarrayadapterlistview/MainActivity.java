package com.example.myarrayadapterlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
    }
}
