package com.mrsfy.filmler;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.mirko.tbv.TabBarView;
import com.mrsfy.filmler.contents.NowPlayings;
import com.mrsfy.filmler.contents.Populars;
import com.mrsfy.filmler.tabs.NowPlayingsFragment;
import com.mrsfy.filmler.tabs.PopularsFragment;
import com.mrsfy.filmler.tabs.UpcomingsFragment;

import java.util.Locale;

/**
 * Created by mrsfy on 7.02.2016.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter implements TabBarView.IconTabProvider {
    Context context;
    private int[] tab_icons = {
            R.drawable.ic_movie_filter_black_24dp,
            R.drawable.ic_stars_black_24dp,
            R.drawable.ic_next_week_black_24dp
    };

    public SectionsPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return NowPlayingsFragment.newInstance("A", "B");
            case 1:
                return PopularsFragment.newInstance("A", "B");
            case 2:
                return UpcomingsFragment.newInstance("A", "B");
        }
        return null;
    }

    @Override
    public int getPageIconResId(int position) {
        return tab_icons[position];
    }

    @Override
    public int getCount() {
        return tab_icons.length;
    }

    @Override
    public CharSequence getPageTitle (int position){
        Locale l = Locale.getDefault();
        switch (position){
            case 0:
                return context.getResources().getString(R.string.now_playings).toUpperCase(l);
            case 1:
                return context.getResources().getString(R.string.populars).toUpperCase(l);
            case 2:
                return context.getResources().getString(R.string.upcomings).toUpperCase(l);
        }
        return null;
    }
}
