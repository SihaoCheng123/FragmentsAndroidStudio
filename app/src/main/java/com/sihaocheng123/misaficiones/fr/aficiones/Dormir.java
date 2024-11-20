package com.sihaocheng123.misaficiones.fr.aficiones;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.sihaocheng123.misaficiones.R;

public class Dormir extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dormir, container, false);

        Button btnDormir = view.findViewById(R.id.btnDormir);
        ImageView zzz = view.findViewById(R.id.zzz);
        btnDormir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                if (btnDormir.getText().toString().equals("Turn off the lights")){
                    view.setBackgroundColor(Color.BLACK);
                    btnDormir.setText("Turn on the lights");
                    zzz.setColorFilter(Color.WHITE);
                    zzz.setVisibility(View.VISIBLE);
                }else{
                    view.setBackgroundColor(Color.WHITE);
                    btnDormir.setText("Turn off the lights");
                    zzz.setColorFilter(Color.BLACK);
                    zzz.setVisibility(View.INVISIBLE);
                }

            }
        });


        return view;
    }
}
