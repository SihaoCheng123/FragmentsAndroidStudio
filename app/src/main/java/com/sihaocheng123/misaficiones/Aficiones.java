package com.sihaocheng123.misaficiones;

import android.content.Intent;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.sihaocheng123.misaficiones.databinding.ActivityAficionesBinding;
import com.sihaocheng123.misaficiones.fr.aficiones.Comer;
import com.sihaocheng123.misaficiones.fr.aficiones.Dormir;
import com.sihaocheng123.misaficiones.ui.frmanager.Paginador;

import java.util.List;

public class Aficiones extends AppCompatActivity {

    private ActivityAficionesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityAficionesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Paginador paginador = new Paginador(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginador);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.fab.setImageResource(R.drawable.star);
                Toast toast = Toast.makeText(Aficiones.this, "Saved", Toast.LENGTH_SHORT);
                toast.show();
                binding.fab.setEnabled(false);
                int currentFragment = binding.viewPager.getCurrentItem();
                SharedPreferences preferences = getSharedPreferences("Actividad favorita", MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                if(currentFragment == 0){
                    editor.putString("Actividad favorita","Eating");
                }else if(currentFragment == 1){
                    editor.putString("Actividad favorita","Sleeping");
                }else{
                    Log.e("no hay datos", "onClick: ");
                }
                editor.apply();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_about_me, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.aboutMeButton){
            Intent intent = new Intent(Aficiones.this, Tabs.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
        if (id==R.id.myCodeButton){
            Toast toast = Toast.makeText(this, "Redirecting to GitHub", Toast.LENGTH_SHORT);
            toast.show();
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://github.com/SihaoCheng123"));
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}