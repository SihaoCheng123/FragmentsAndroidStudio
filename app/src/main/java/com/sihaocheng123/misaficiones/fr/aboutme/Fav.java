package com.sihaocheng123.misaficiones.fr.aboutme;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;
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
                SharedPreferences preferences = getActivity().getSharedPreferences("Actividad favorita", MODE_PRIVATE);
                String texto = preferences.getString("Actividad favorita", null);
                if (texto != null){
                    hobbyFav.setText(texto);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.clear().apply();
                    hobbyFav.setVisibility(View.VISIBLE);
                    imgFav.setImageResource(R.drawable.feliz);
                    imgFav.setVisibility(View.VISIBLE);
                    btnMostrar.setVisibility(View.INVISIBLE);
                }else{
                    hobbyFav.setVisibility(View.VISIBLE);
                    imgFav.setImageResource(R.drawable.awkward);
                    imgFav.setVisibility(View.VISIBLE);
                }




            }
        });
        return view;
    }
}