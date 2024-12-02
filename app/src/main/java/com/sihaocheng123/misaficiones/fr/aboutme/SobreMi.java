package com.sihaocheng123.misaficiones.fr.aboutme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.sihaocheng123.misaficiones.R;

public class SobreMi extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sobremi, container, false);
        ImageView iconface = view.findViewById(R.id.sadface);
        ImageView unchecked = view.findViewById(androidx.appcompat.R.id.unchecked);
        Button btnChangeFace = view.findViewById(R.id.botonCheer);
        btnChangeFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iconface.setImageResource(R.drawable.smiley);
                unchecked.setImageResource(R.drawable.check_box_filled);
                btnChangeFace.setVisibility(View.INVISIBLE);
                Toast toast = Toast.makeText(getContext(), "Purr", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        return view;

    }
}
