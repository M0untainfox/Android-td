package com.example.mountainfox.applicationct;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Mountainfox on 09-Feb-17.
 */

public class Fragmentdeux extends Fragment {
    View myview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        myview=inflater.inflate(R.layout.fragment_deux,container,false);
        return myview;


    }
}
