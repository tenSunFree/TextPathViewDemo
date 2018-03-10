package com.example.administrator.textpathviewdemo;

import android.animation.Animator;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import yanzhikai.textpath.SyncTextPathView;
import yanzhikai.textpath.TextPathAnimatorListener;

public class MainActivity extends AppCompatActivity {

    private SyncTextPathView
            laceSyncTextPathView, laceSyncTextPathView2, laceSyncTextPathView3,
            laceSyncTextPathView4, laceSyncTextPathView5, laceSyncTextPathView6,
            laceSyncTextPathView7, laceSyncTextPathView8, laceSyncTextPathView9,
            laceSyncTextPathView10, laceSyncTextPathView11, laceSyncTextPathView12,
            laceSyncTextPathView13, laceSyncTextPathView14, laceSyncTextPathView15,
            laceSyncTextPathView16, laceSyncTextPathView17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                laceSyncTextPathView = findViewById(R.id.laceSyncTextPathView);
                laceSyncTextPathView.startAnimation(0, 1);

                laceSyncTextPathView17 = findViewById(R.id.laceSyncTextPathView17);
                laceSyncTextPathView17.startAnimation(0, 1);
                laceSyncTextPathView17.setAnimatorListener(new TextPathAnimatorListener(){
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        laceSyncTextPathView17.showFillColorText();
                    }
                });
            }
        }, 2600);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                laceSyncTextPathView2 = findViewById(R.id.laceSyncTextPathView2);
                laceSyncTextPathView2.startAnimation(0, 1);
            }
        }, 2800);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                laceSyncTextPathView3 = findViewById(R.id.laceSyncTextPathView3);
                laceSyncTextPathView3.startAnimation(0, 1);
            }
        }, 3000);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                laceSyncTextPathView4 = findViewById(R.id.laceSyncTextPathView4);
                laceSyncTextPathView4.startAnimation(0, 1);
            }
        }, 3200);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                laceSyncTextPathView5 = findViewById(R.id.laceSyncTextPathView5);
                laceSyncTextPathView5.startAnimation(0, 1);
            }
        }, 200);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                laceSyncTextPathView6 = findViewById(R.id.laceSyncTextPathView6);
                laceSyncTextPathView6.startAnimation(0, 1);
            }
        }, 400);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                laceSyncTextPathView7 = findViewById(R.id.laceSyncTextPathView7);
                laceSyncTextPathView7.startAnimation(0, 1);
            }
        }, 600);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                laceSyncTextPathView8 = findViewById(R.id.laceSyncTextPathView8);
                laceSyncTextPathView8.startAnimation(0, 1);
            }
        }, 800);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                laceSyncTextPathView9 = findViewById(R.id.laceSyncTextPathView9);
                laceSyncTextPathView9.startAnimation(0, 1);
            }
        }, 1000);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                laceSyncTextPathView10 = findViewById(R.id.laceSyncTextPathView10);
                laceSyncTextPathView10.startAnimation(0, 1);
            }
        }, 1200);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                laceSyncTextPathView11 = findViewById(R.id.laceSyncTextPathView11);
                laceSyncTextPathView11.startAnimation(0, 1);
            }
        }, 1400);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                laceSyncTextPathView12 = findViewById(R.id.laceSyncTextPathView12);
                laceSyncTextPathView12.startAnimation(0, 1);
            }
        }, 1600);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                laceSyncTextPathView13 = findViewById(R.id.laceSyncTextPathView13);
                laceSyncTextPathView13.startAnimation(0, 1);
            }
        }, 1800);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                laceSyncTextPathView14 = findViewById(R.id.laceSyncTextPathView14);
                laceSyncTextPathView14.startAnimation(0, 1);
            }
        }, 2000);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                laceSyncTextPathView15 = findViewById(R.id.laceSyncTextPathView15);
                laceSyncTextPathView15.startAnimation(0, 1);
            }
        }, 2200);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                laceSyncTextPathView16 = findViewById(R.id.laceSyncTextPathView16);
                laceSyncTextPathView16.startAnimation(0, 1);
            }
        }, 2400);
    }
}
