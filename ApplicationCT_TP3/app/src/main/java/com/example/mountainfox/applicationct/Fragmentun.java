package com.example.mountainfox.applicationct;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.style.TtsSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mountainfox on 09-Feb-17.
 */

public class Fragmentun extends Fragment{
    View myview;
    Spinner spinner;
    TextView txt;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myview=inflater.inflate(R.layout.second_activity,container,false);
        return myview;


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



        txt = (TextView) myview.findViewById(R.id.TextExtra);





        spinner = (Spinner) myview.findViewById(R.id.spinner);
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
                getActivity().getBaseContext(),
                android.R.layout.simple_spinner_item,
                exempleList
        );


               /* On definit une présentation du spinner quand il est déroulé         (android.R.layout.simple_spinner_dropdown_item) */
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Enfin on passe l'adapter au Spinner et c'est tout
        spinner.setAdapter(adapter);


        final Button btnEnter = (Button) myview.findViewById(R.id.btn1);

        btnEnter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txt.setText(spinner.getSelectedItem().toString());
            }
        });

    }
}
