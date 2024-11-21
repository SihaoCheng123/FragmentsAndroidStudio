package com.sihaocheng123.misaficiones;

import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.sihaocheng123.misaficiones.databinding.ActivityTabsBinding;
import com.sihaocheng123.misaficiones.ui.frmanager.Paginador2;

public class Tabs extends AppCompatActivity {

    private ActivityTabsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTabsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Paginador2 paginador = new Paginador2(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(paginador);

        TabLayout tabLayout = binding.Tabs;
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.go_back, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id== R.id.volver){
            Intent intent = new Intent(Tabs.this, Aficiones.class);
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