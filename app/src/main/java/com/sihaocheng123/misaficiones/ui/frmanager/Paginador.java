package com.sihaocheng123.misaficiones.ui.frmanager;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.sihaocheng123.misaficiones.fr.aficiones.Dormir;
import com.sihaocheng123.misaficiones.fr.aficiones.Comer;

public class Paginador extends FragmentPagerAdapter{

    private final Context mContext;

    public Paginador(Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Comer();
            case 1:
                return new Dormir();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
