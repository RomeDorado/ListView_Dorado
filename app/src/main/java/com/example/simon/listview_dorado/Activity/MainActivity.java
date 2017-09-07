package com.example.simon.listview_dorado.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.simon.listview_dorado.Adapter.CustomAdapter;
import com.example.simon.listview_dorado.Model.College;
import com.example.simon.listview_dorado.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String[] colleges;
    String[] year;
    CustomAdapter adapter;
    List<College> listCollege;
    int[] logos;
    ListView lv_Colleges;
//    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_Colleges = (ListView) findViewById(R.id.lvColleges);
        listCollege = new ArrayList<College>();
        colleges = getResources().getStringArray(R.array.Colleges);
        year = getResources().getStringArray(R.array.Year);
        logos = new int[] {R.drawable.iics, R.drawable.engg, R.drawable.med, R.drawable.faclets, R.drawable.ipea};
        for (int i=0; i < colleges.length; i++){
            listCollege.add(new College(logos[i], colleges[i], year[i] ));
        }
        adapter = new CustomAdapter(this, listCollege);
        lv_Colleges .setAdapter(adapter);

        lv_Colleges.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = "You clicked " + colleges[i];
                Toast.makeText(getApplicationContext(),msg, Toast.LENGTH_LONG).show();
            }
        });





    }
}
