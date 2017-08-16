package com.example.nitishsingh.android81;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    //declaration
    ListView list;
    Button btn_asc;
    Button btn_dsc;
    ArrayList months=new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=(ListView)findViewById(R.id.list);
        btn_asc=(Button)findViewById(R.id.btn_asc);
        btn_dsc=(Button)findViewById(R.id.btn_dsc);
        //adding month
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("Descember");
        //creatinmg array adapter
        final ArrayAdapter<ArrayList> arrayAdapter = new ArrayAdapter<ArrayList>(MainActivity.this,android.R.layout.simple_list_item_1,months);
        list.setAdapter(arrayAdapter);

        btn_asc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.sort(months);
                arrayAdapter.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(),"btn_asc",Toast.LENGTH_LONG).show();
            }
        });
        btn_dsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Collections.sort(months,Collections.reverseOrder());
                arrayAdapter.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(),"btn_dsc",Toast.LENGTH_LONG).show();
            }
        });

    }
}
