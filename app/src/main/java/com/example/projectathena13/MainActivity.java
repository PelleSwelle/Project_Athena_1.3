package com.example.projectathena13;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;
import androidx.appcompat.widget.PopupMenu;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity
{

    private AppBarConfiguration mAppBarConfiguration;

    public AppBarConfiguration getmAppBarConfiguration()
    {
        return mAppBarConfiguration;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        NavController navController1 = new NavController(this);

        PopupMenu popMenu = new PopupMenu(MainActivity.this, fab);

        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

                popMenu.getMenuInflater().inflate(R.menu.fab_menu, popMenu.getMenu());

                popMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener()
                {
                    @Override
                    public boolean onMenuItemClick(MenuItem _item)
                    {
                        // TODO what happens with each menu option
                        switch (_item.getItemId()) {
                            case R.id.fab_dashboard:
                                Toast.makeText(MainActivity.this, "dashboard", Toast.LENGTH_SHORT).show();
                                //TODO fab go to dashboard
                            case R.id.fab_city:
                                Toast.makeText(MainActivity.this, "City", Toast.LENGTH_SHORT).show();
                        }



                        return false;
                    }
                });
                popMenu.show();
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home,
                R.id.nav_dashboard,
                R.id.nav_city,
                R.id.nav_todo,
                R.id.nav_languages,
                R.id.nav_achievements,
                R.id.nav_mathematics,
                R.id.nav_literacy
        ).setOpenableLayout(drawer).build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:
                Navigation.findNavController(this, R.id.nav_host_fragment).navigate(R.id.nav_settings);

            case R.id.action_logOut:
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp()
    {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}