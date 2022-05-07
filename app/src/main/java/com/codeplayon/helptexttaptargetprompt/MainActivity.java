package com.codeplayon.helptexttaptargetprompt;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

import com.codeplayon.introhelptext.MaterialHelpTextSequence;
import com.codeplayon.introhelptext.MaterialHelptextView;
import com.codeplayon.introhelptext.HelpTextConfig;
import com.codeplayon.introhelptext.shape.CircleShape;
import com.codeplayon.introhelptext.shape.NoShape;
import com.codeplayon.introhelptext.shape.OvalShape;
import com.codeplayon.introhelptext.shape.RectangleShape;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    View hView;
    private static final String HelpText_ID = "Parmit_Malik";
    Button Button1, Button2,Button3,Button4,Button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.baseline_menu_24);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


        NavigationView navigationView = findViewById(R.id.nav_view);
        hView = navigationView.getHeaderView(0);
        Button1 =findViewById(R.id.Button1);
        Button2=findViewById(R.id.Button2);
        Button3 =findViewById(R.id.Button3);
        Button4=findViewById(R.id.Button4);
        Button5 =findViewById(R.id.Button5);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MaterialHelptextView.Builder(MainActivity.this)
                        .setTarget(Button1)
                        .setDismissText("GOT IT")
                        .setShapePadding(100)
                        .setSkipText(getResources().getString(R.string.skip))
                        .setContentText("This is some amazing feature you should know about")
                        .setDelay(500)
                        .singleUse("1")
                        .show();
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MaterialHelptextView.Builder(MainActivity.this)
                        .setTarget(Button2)
                        .setDismissText("GOT IT")
                        .setShape(new OvalShape())
                        .setSkipText(getResources().getString(R.string.skip))
                        .setContentText("This is some amazing feature you should know about")
                        .setDelay(500)
                        .singleUse("2")
                        .show();
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MaterialHelptextView.Builder(MainActivity.this)
                        .setTarget(Button3)
                        .setDismissText("GOT IT")
                        .setShape(new CircleShape())
                        .setSkipText(getResources().getString(R.string.skip))
                        .setContentText("This is some amazing feature you should know about")
                        .setDelay(500)
                        .singleUse("3")
                        .show();
            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MaterialHelptextView.Builder(MainActivity.this)
                        .setTarget(Button4)
                        .setDismissText("GOT IT")
                        .setShape(new RectangleShape(160,50))
                        .setSkipText(getResources().getString(R.string.skip))
                        .setContentText("This is some amazing feature you should know about")
                        .setDelay(500)
                        .singleUse("4")
                        .show();
            }
        });

        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MaterialHelptextView.Builder(MainActivity.this)
                        .setTarget(Button5)
                        .setDismissText("GOT IT")
                        .setShape(new NoShape())
                        .setSkipText(getResources().getString(R.string.skip))
                        .setContentText("This is some amazing feature you should know about")
                        .setDelay(500)
                        .singleUse("5")
                        .show();
            }
        });
        AppShowcase();

    }

    private void AppShowcase() {
//        isFirstTime = new SessionManagement().isFirstTimeLogin(this);
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.openDrawer(GravityCompat.START);
            new CountDownTimer(3000, 1000) {

                public void onTick(long millisUntilFinished) {

                    //here you can have your logic to set text to edittext
                }
                public void onFinish() {
                    if (drawer.isDrawerOpen(GravityCompat.START)) {
                        drawer.closeDrawer(GravityCompat.START);
                    }
                }

            }.start();

        HelpTextConfig config = new HelpTextConfig();
        config.setDelay(500); // half second between each showcase view
        MaterialHelpTextSequence sequence = new MaterialHelpTextSequence(this, HelpText_ID);
        sequence.setOnItemShownListener(new MaterialHelpTextSequence.OnSequenceItemShownListener() {
            @Override
            public void onShow(MaterialHelptextView itemView, int position) {

            }
        });

        sequence.setConfig(config);
        sequence.addSequenceItem(
                new MaterialHelptextView.Builder(this)
                        .setTarget(hView.findViewById(R.id.close_navibar))
                        .setTitleText("Navi Bar ")
                        .setContentText("This is an Navi bar menu you can see more menu hara")
                        .setDismissText(getResources().getString(R.string.gotit))
                        .setSkipText(getResources().getString(R.string.skip))
                        .setContentTextColor(getResources().getColor(R.color.white))
                        .build()
        );

       sequence.addSequenceItem(
                new MaterialHelptextView.Builder(this)
                        .setTarget(findViewById(R.id.Button1))
                        .setTitleText("Help Text")
                        .setContentText("App Suggestion Help text")
                        .setDismissText(getResources().getString(R.string.gotit))
                        .setSkipText(getResources().getString(R.string.skip))
                        .build()

        );

        sequence.addSequenceItem(
                new MaterialHelptextView.Builder(this)
                        .setTarget(findViewById(R.id.Button2))
                        .setTitleText("Help Text")
                        .setContentText("App Suggestion Help text with Rectangle Shape ")
                        .setShape(new RectangleShape(160,50))
                        .setDismissText(getResources().getString(R.string.gotit))
                        .setSkipText(getResources().getString(R.string.skip))
                        .build()
        );

        sequence.addSequenceItem(
                new MaterialHelptextView.Builder(this)
                        .setTarget(findViewById(R.id.Button3))
                        .setTitleText("Help Text")
                        .setContentText("App Suggestion Help text with Circle Shape ")
                        .setShape(new CircleShape())
                        .setDismissText(getResources().getString(R.string.gotit))
                        .setSkipText(getResources().getString(R.string.skip))
                        .build()
        );


        sequence.addSequenceItem(
                new MaterialHelptextView.Builder(this)
                        .setTarget(findViewById(R.id.Button4))
                        .setTitleText("Help Text")
                        .setContentText("App Suggestion Help text with Oval Shape ")
                        .setShape(new OvalShape())
                        .setDismissText(getResources().getString(R.string.gotit))
                        .setSkipText(getResources().getString(R.string.skip))
                        .build()
        );

        sequence.addSequenceItem(
                new MaterialHelptextView.Builder(this)
                        .setTarget(findViewById(R.id.Button5))
                        .setTitleText("Help Text")
                        .setContentText("App Suggestion Help text with No Shape ")
                        .setShape(new NoShape())
                        .setDismissText(getResources().getString(R.string.gotit))
                        .setSkipText(getResources().getString(R.string.skip))
                        .build()
        );



        sequence.start();
    }

}