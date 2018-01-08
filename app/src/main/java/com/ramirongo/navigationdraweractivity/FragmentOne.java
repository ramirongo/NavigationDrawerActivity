package com.ramirongo.navigationdraweractivity;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by ramir on 05-01-2018.
 */

public class FragmentOne extends android.support.v4.app.Fragment{
    // ctrl + o     to search the methods

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_one, container,false);    //change this line like this
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final RelativeLayout rl = (RelativeLayout)getActivity().findViewById(R.id.fragOne_background);
        final Button changeBG = (Button)getActivity().findViewById(R.id.fragOne_button_BG);
        final Button showToast = (Button)getActivity().findViewById(R.id.fragOne_button_Toast);
                                //(Button)view.findViewById(R.id.fragOne_button_BG)



        changeBG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rl.setBackgroundColor(Color.YELLOW);
                changeBG.setTextColor(Color.WHITE);
                showToast.setTextColor(Color.WHITE);
            }
        });

        showToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"You clicked the TOAST",Toast.LENGTH_LONG).show();
            }
        });
    }
}

//to create fragment_one.xml
//right click over layout
//new layout resource file

