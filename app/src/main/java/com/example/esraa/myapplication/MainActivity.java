package com.example.esraa.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity {

    ImageButton air, alarm, security, curtain, housekeeping, light, tv, vip, worldclock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);


        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                Fragment selectedFragment = null;
                switch (tabId) {
                    case R.id.home:
                        selectedFragment = new HomeFragment();
                        break;
                    case R.id.favorite:
                        selectedFragment = new MainAirConditionerActivity();
                        break;
                    case R.id.search:
                        selectedFragment = new MainCurtainActivity();
                        break;
                    case R.id.link:
                        selectedFragment = new MainLightActivity();
                        break;
                    case R.id.add:
                        selectedFragment = new MainHouseKeepingActivity();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

            }
        });




     /*   BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(listener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener listener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;
            switch (menuItem.getItemId()) {
                case R.id.home:
                    selectedFragment = new HomeFragment();
                    break;
                case R.id.favorite:
                    selectedFragment = new MainAirConditionerActivity();
                    break;
                case R.id.search:
                     selectedFragment = new MainCurtainActivity();
                    break;
                case R.id.link:
                     selectedFragment = new MainLightActivity();
                    break;
                case R.id.add:
                    selectedFragment = new MainHouseKeepingActivity();
                    break;

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
            return true;
        }
    };

*/
    }
}

