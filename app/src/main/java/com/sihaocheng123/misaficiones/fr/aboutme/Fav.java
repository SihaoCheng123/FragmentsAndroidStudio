package com.sihaocheng123.misaficiones.fr.aboutme;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.sihaocheng123.misaficiones.R;

public class Fav extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fav, container, false);
        Button btnMostrar = view.findViewById(R.id.btnShow);
        ImageView imgFav = view.findViewById(R.id.imgFav);
        TextView hobbyFav = view.findViewById(R.id.hobbyFav);
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                imgFav.setVisibility(View.VISIBLE);
                hobbyFav.setVisibility(View.VISIBLE);
                btnMostrar.setVisibility(View.INVISIBLE);
            }
        });
        return view;
    }
}