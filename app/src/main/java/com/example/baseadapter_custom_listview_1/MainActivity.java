package com.example.baseadapter_custom_listview_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView list;
String[] district ={"Chittagong","Dhaka","Khulna","bogura","Dinajpur",
        "magura",
        "Sherpur",
        "Dinajpur",
        "magura",
        "Sherpur"};
Integer[] imageId={R.drawable.arrpo,R.drawable.audio,R.drawable.next,R.drawable.star,R.drawable.tri,R.drawable.cross,R.drawable.arrpo,R.drawable.audio,R.drawable.next,R.drawable.star};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=findViewById(R.id.lst);
        ClassAdapter listAdapter=new ClassAdapter(MainActivity.this,district,imageId);
      list.setAdapter(listAdapter);
      list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              Toast.makeText(MainActivity.this,"You Clicked at " +district[+position],Toast.LENGTH_SHORT).show();
          }
      });
    }
}
