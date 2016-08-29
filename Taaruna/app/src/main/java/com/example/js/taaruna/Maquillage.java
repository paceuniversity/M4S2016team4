package com.example.js.taaruna;


import android.support.design.widget.TabLayout;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class Maquillage extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    private int [] tabIcons = {R.drawable.ic_action_image_slideshow,
            R.drawable.ic_action_image_brush};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maquillage);
        viewPager = (ViewPager) findViewById(R.id.viewpager);

        this.ajoutPages(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setOnTabSelectedListener(ecouteur(viewPager));
        setupTabIcons();


    }



    //Ajout des icones
    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
    }

    //Ajout de toutes les pages
    private void ajoutPages (ViewPager pager){

    MyFragPagerAdapter adapter= new MyFragPagerAdapter(getSupportFragmentManager());
        adapter.ajoutPage(new MaquillageFragment());
        adapter.ajoutPage(new ProduitFragment());

        //Mettre un adapter sur pager
        pager.setAdapter(adapter);

    }

    private TabLayout.OnTabSelectedListener ecouteur(final ViewPager pager ){

        return new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
            pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        };
    }





}
