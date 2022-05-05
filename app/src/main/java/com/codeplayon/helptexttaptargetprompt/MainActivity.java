package com.codeplayon.helptexttaptargetprompt;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.os.CountDownTimer;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

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

    }

//    private void AppShowcase() {
////        isFirstTime = new SessionManagement().isFirstTimeLogin(this);
//            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//            drawer.openDrawer(GravityCompat.START);
//            new CountDownTimer(3000, 1000) {
//
//                public void onTick(long millisUntilFinished) {
//
//                    //here you can have your logic to set text to edittext
//                }
//                public void onFinish() {
//                    if (drawer.isDrawerOpen(GravityCompat.START)) {
//                        drawer.closeDrawer(GravityCompat.START);
//                    }
//                }
//
//            }.start();
//
//        ShowcaseConfig config = new ShowcaseConfig();
//        config.setDelay(500); // half second between each showcase view
//        MaterialShowcaseSequence sequence = new MaterialShowcaseSequence(this, SHOWCASE_ID);
//        sequence.setOnItemShownListener(new MaterialShowcaseSequence.OnSequenceItemShownListener() {
//            @Override
//            public void onShow(MaterialShowcaseView itemView, int position) {
//                new SessionManagement().setFirstTimeLoginEnabled(false, PostLoginMainActivity.this);
//
//            }
//        });
//
//        sequence.setConfig(config);
//        sequence.addSequenceItem(
//                new MaterialShowcaseView.Builder(this)
//                        .setTarget(hView.findViewById(R.id.close_navibar))
//                        .setTitleText(getResources().getString(R.string.navi_bar))
//                        .setContentText(getResources().getString(R.string.navi_bar_help))
//                        .setDismissText(getResources().getString(R.string.gotit))
//                        .setSkipText(getResources().getString(R.string.skip))
//                        .setContentTextColor(getResources().getColor(R.color.whiteColor))
//                        .build()
//        );
//
//        sequence.addSequenceItem(
//                new MaterialShowcaseView.Builder(this)
//                        .setTarget(findViewById(R.id.PostApplyForLoan))
//                        .setTitleText(getResources().getString(R.string.topUp))
//                        .setContentText(getResources().getString(R.string.topup_help))
//                        .setDismissText(getResources().getString(R.string.gotit))
//                        .setSkipText(getResources().getString(R.string.skip))
//                        .build()
//
//        );
//
//        sequence.addSequenceItem(
//                new MaterialShowcaseView.Builder(this)
//                        .setTarget(findViewById(R.id.PostPayDues))
//                        .setTitleText(getResources().getString(R.string.pay_dues))
//                        .setContentText(getResources().getString(R.string.pay_dues_help))
//                        .setDismissText(getResources().getString(R.string.gotit))
//                        .setSkipText(getResources().getString(R.string.skip))
//                        .build()
//        );
//
//        sequence.addSequenceItem(
//                new MaterialShowcaseView.Builder(this)
//                        .setTarget(findViewById(R.id.PostSaathiRefer))
//                        .setTitleText(getResources().getString(R.string.saath_refral))
//                        .setContentText(getResources().getString(R.string.saath_refral_help))
//                        .setDismissText(getResources().getString(R.string.gotit))
//                        .setSkipText(getResources().getString(R.string.skip))
//                        .build()
//        );
//
//
//        sequence.addSequenceItem(
//                new MaterialShowcaseView.Builder(this)
//                        .setTarget(findViewById(R.id.DownloadDoc))
//                        .setTitleText(getResources().getString(R.string.download_documents))
//                        .setContentText(getResources().getString(R.string.download_documents_help))
//                        .setDismissText(getResources().getString(R.string.gotit))
//                        .setSkipText(getResources().getString(R.string.skip))
//                        .build()
//        );
//
//        sequence.addSequenceItem(
//                new MaterialShowcaseView.Builder(this)
//                        .setTarget(findViewById(R.id.PostProperty_Papers))
//                        .setTitleText(getResources().getString(R.string.property_papers))
//                        .setContentText(getResources().getString(R.string.location_property_help))
//                        .setDismissText(getResources().getString(R.string.gotit))
//                        .setSkipText(getResources().getString(R.string.skip))
//                        .build()
//        );
//
//        sequence.addSequenceItem(
//                new MaterialShowcaseView.Builder(this)
//                        .setTarget(findViewById(R.id.PostTreckStatus))
//                        .setTitleText(getResources().getString(R.string.track_status))
//                        .setContentText(getResources().getString(R.string.track_status_help))
//                        .setDismissText(getResources().getString(R.string.gotit))
//                        .setSkipText(getResources().getString(R.string.skip))
//                        .build()
//        );
//
//
//        sequence.start();
//    }

}