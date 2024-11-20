package com.sihaocheng123.misaficiones;

import android.content.Intent;

import android.os.Bundle;

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
}