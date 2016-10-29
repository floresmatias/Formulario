package com.example.matiasmsi.formulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listas;

    String formularios []  = {

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listas= (ListView)findViewById(R.id.lista);
        formularios = getResources().getStringArray(R.array.obras);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, formularios);
        listas.setAdapter(adapter);
        listas.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        listas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
             //   Toast.makeText(getApplicationContext(),"posicion" + id + formularios[i],Toast.LENGTH_SHORT).show();
                String item = (String) parent.getItemAtPosition(i);
                Toast.makeText(MainActivity.this,  item ,Toast.LENGTH_SHORT).show();
                //desde aca deberia estar recatando el valor






            }
        });

    }
}
