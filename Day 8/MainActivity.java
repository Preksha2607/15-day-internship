package com.example.listviewfruit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lvname;
    int[] image={R.drawable.apple,R.drawable.banana,R.drawable.cherry,R.drawable.kiwi,R.drawable.mango,R.drawable.orange};
    String[] name={"This is apple ","This is banana","This is cherry","This is kiwi","This is mango","This is orange"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvname=findViewById(R.id.lvname);

        Myadpter myadpter=new Myadpter(image,name,MainActivity.this);
        lvname.setAdapter(myadpter);
    }
}