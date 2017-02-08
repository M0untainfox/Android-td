package com.example.mountainfox.applicationct;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mountainfox on 25-Jan-17.
 */

public class SecondActivity extends Activity {
    Spinner spinner;
    TextView txt;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);


        Intent intent = getIntent();

        txt = (TextView) findViewById(R.id.TextExtra);

        if (intent != null) {
            txt.setText(intent.getStringExtra("VAL"));
        }
        else{
            txt.setText("null");
        }



        spinner = (Spinner) findViewById(R.id.spinner);
        //Création d'une liste d'élément à mettre dans le Spinner(pour l'exemple)
        List exempleList = new ArrayList();
        exempleList.add("Boxer");
        exempleList.add("35c15");
        exempleList.add("35c13");
        exempleList.add("110.54");
        exempleList.add("Avensis");
        exempleList.add("Yaris");
        exempleList.add("450wrf");
        exempleList.add("250cr");
        exempleList.add("125cr");
        exempleList.add("pc110");
        exempleList.add("kx81-a");
        exempleList.add("E140");

		/*Le Spinner a besoin d'un adapter pour sa presentation alors on lui passe le context(this) et
                un fichier de presentation par défaut( android.R.layout.simple_spinner_item)
		Avec la liste des elements (exemple) */
        ArrayAdapter adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                exempleList
        );


               /* On definit une présentation du spinner quand il est déroulé         (android.R.layout.simple_spinner_dropdown_item) */
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Enfin on passe l'adapter au Spinner et c'est tout
        spinner.setAdapter(adapter);


        final Button btnEnter = (Button) findViewById(R.id.btn1);

        btnEnter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txt.setText(spinner.getSelectedItem().toString());
            }
        });


    }
}