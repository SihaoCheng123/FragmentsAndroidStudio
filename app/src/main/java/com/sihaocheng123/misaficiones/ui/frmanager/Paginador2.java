package com.sihaocheng123.misaficiones.ui.frmanager;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.sihaocheng123.misaficiones.R;
import com.sihaocheng123.misaficiones.fr.aboutme.Fav;
import com.sihaocheng123.misaficiones.fr.aboutme.SobreMi;

public class Paginador2 extends FragmentPagerAdapter {
    private final Context mContext;

    public Paginador2(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @StringRes
    private static final int[] TITULOS = new int[]{
            R.string.about_me,
            R.string.fav,
            R.string.git
    };


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new SobreMi();
            case 1:
                return new Fav();
            case 2:

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TITULOS[position]);
    }
}
