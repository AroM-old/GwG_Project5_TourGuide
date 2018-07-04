/*
 * MIT License
 *
 * Copyright (c) 2018 Algenis Romero<algenisromero@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.example.android.gwg_project5_tourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Set the content of the activity layout file

        /**
         * TODO Add proper back navigation to navigate
         * TODO Add launcher icon on action bar.
         * */

        //Load the home fragment and display the content on screen
        loadFragment(new HomeFragment());

        //Listener for the navigation bar and switch fragment when touch
        BottomNavigationView navigationView = findViewById(R.id.navigation);


        //Remove bottom view menu animation
        BottomNavigationViewHelper.disableShifMode(navigationView);

        //Set listener for the bottom view menu icons
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null; //Check for fragments

                //Change fragment view when user touch the bottom bar icons
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        fragment = new HomeFragment();
                        break;

                    case R.id.navigation_attractions:
                        fragment = new AttractionsFragment();
                        break;

                    case R.id.navigation_hotels:
                        fragment = new HotelsFragment();
                        break;

                    case R.id.navigation_food:
                        fragment = new FoodFragment();
                        break;

                    case R.id.navigation_shopping:
                        fragment = new ShoppingFragment();
                        break;
                }

                return loadFragment(fragment);
            }
        });

    }

    // TODO possible implementation of swipe fragments and show action in bottom nav.
    //Load fragments into activity main layout
    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
            return true;
        }

        return false;
    }

}