package com.example.projectathena13;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.view.inputmethod.InputMethodManager;
import android.widget.*;
import androidx.appcompat.widget.PopupMenu;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    public static NavigationView navigationView;
    View nav_header;
    TextView navHeaderUsername;
    TextView navHeaderEmail;
    EditText et_userName;
    EditText et_password;
    Button bt_enter;
    public static FloatingActionButton fab;
    public static Toolbar toolbar;

    public static User user;

    public AppBarConfiguration getmAppBarConfiguration() {
        return mAppBarConfiguration;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        fab = findViewById(R.id.fab);
        toolbar = findViewById(R.id.toolbar);
        NavController navController1 = new NavController(this);

        navigationView = findViewById(R.id.nav_view);
        nav_header = navigationView.getHeaderView(0);


        PopupMenu popMenu = new PopupMenu(MainActivity.this, fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                popMenu.getMenuInflater().inflate(R.menu.fab_menu, popMenu.getMenu());

                popMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem _item) {
                        // TODO what happens with each menu option
                        switch (_item.getItemId()) {
                            case R.id.fab_dashboard:
                                Log.d("FAB", "onMenuItemClick: fab_dashboard");
                                Navigation.findNavController(MainActivity.this, R.id.nav_host_fragment).navigate(R.id.nav_dashboard);
                                Toast.makeText(MainActivity.this, "dashboard", Toast.LENGTH_SHORT).show();
                                break;
                            //TODO fab go to dashboard
                            case R.id.fab_city:
                                Log.d("FAB", "onMenuItemClick: fab_city");
                                Navigation.findNavController(MainActivity.this, R.id.nav_host_fragment).navigate(R.id.nav_city);
                                Toast.makeText(MainActivity.this, "City", Toast.LENGTH_SHORT).show();
                                break;
                        }

                        return true;
                    }
                });
                popMenu.show();
            }
        });
        fab.setVisibility(View.INVISIBLE);
        toolbar.setVisibility(View.INVISIBLE);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);


        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
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

    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // settings menu
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:
                Navigation.findNavController(this, R.id.nav_host_fragment).navigate(R.id.nav_settings);
                break;

            case R.id.action_logOut:
                Navigation.findNavController(this, R.id.nav_host_fragment).navigate(R.id.nav_login);
                break;
        }
        Log.d("TAG", "onOptionsItemSelected: " + item.toString());
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void updateStatusBarColor(String color){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor(color));
        }
    }
    public void updateNavBarColor(String color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setNavigationBarColor(Color.parseColor(color));
        }
    }
    public void updateActionBarColor(String color) {
        View toolBar = findViewById(R.id.toolbar);
        toolBar.setBackgroundColor(Color.parseColor(color));
    }
    public void updateNavHeaderColor(String color) {
        LinearLayout navHeader = findViewById(R.id.nav_header);
        navHeader.setBackgroundColor(Color.parseColor(color));
    }

}