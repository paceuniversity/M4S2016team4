package com.example.js.taaruna;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by ADMIN on 24/08/2016.
 */
public class MyFragPagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> pages= new ArrayList<>();

    public MyFragPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return pages.get(position);
    }

    @Override
    public int getCount() {
        return pages.size();
    }

    //Ajout d'une page
  public void ajoutPage(Fragment fgm){
        pages.add(fgm);
    }

    //Modification des titres des tables
    @Override
    public CharSequence getPageTitle(int position){
        return pages.get(position).toString();
    }

}
