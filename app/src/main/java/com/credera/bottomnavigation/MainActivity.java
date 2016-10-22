package com.credera.bottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenu;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation_menu);
        mBottomNavigationView.setOnNavigationItemSelectedListener(mItemSelectedListener);

        // Launch initial fragment.
        getSupportFragmentManager().beginTransaction()
                .add(R.id.content_container, HomeFragment.newInstance(), HomeFragment.TAG)
                .addToBackStack(null)
                .commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mItemSelectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull final MenuItem item) {

            final FragmentManager supportFragmentManager = getSupportFragmentManager();

            switch (item.getItemId()) {
                case R.id.menu_home_item:
                    final Fragment homeFragment = supportFragmentManager.findFragmentByTag(HomeFragment.TAG);
                    if (homeFragment == null) {
                        supportFragmentManager.beginTransaction()
                                .replace(R.id.content_container, HomeFragment.newInstance(), HomeFragment.TAG)
                                .addToBackStack(null)
                                .commit();
                    } else {
                        supportFragmentManager.beginTransaction()
                                .replace(R.id.content_container, homeFragment)
                                .addToBackStack(null)
                                .commit();
                    }

                    break;
                case R.id.menu_locations_item:
                    final Fragment locationsFragment = supportFragmentManager.findFragmentByTag(LocationsFragment.TAG);
                    if (locationsFragment == null) {
                        supportFragmentManager.beginTransaction()
                                .replace(R.id.content_container, LocationsFragment.newInstance(), LocationsFragment.TAG)
                                .addToBackStack(null)
                                .commit();
                    } else {
                        supportFragmentManager.beginTransaction()
                                .replace(R.id.content_container, locationsFragment)
                                .addToBackStack(null)
                                .commit();
                    }

                    break;
                case R.id.menu_menu_item:
                    final Fragment menuFragment = supportFragmentManager.findFragmentByTag(MenuFragment.TAG);
                    if (menuFragment == null) {
                        supportFragmentManager.beginTransaction()
                                .replace(R.id.content_container, MenuFragment.newInstance(), MenuFragment.TAG)
                                .addToBackStack(null)
                                .commit();
                    } else {
                        supportFragmentManager.beginTransaction()
                                .replace(R.id.content_container, menuFragment)
                                .addToBackStack(null)
                                .commit();
                    }

                    break;
            }

            return false;
        }
    };
}
