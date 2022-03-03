package com.cursoandroid.sliderproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide(new FragmentSlide.Builder()
                                  .background(android.R.color.white)
                                  .fragment(R.layout.intro_1)
                                  .build()
        );
        addSlide(new FragmentSlide.Builder()
                                   .background(android.R.color.white)
                                   .fragment(R.layout.intro_2)
                                   .build()
        );

        /*
        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide(new SimpleSlide.Builder()
                                .title("titulo")
                                .description("descrição")
                                .image(R.drawable.um)
                                .background(android.R.color.holo_orange_dark)
                                .build()
        );
        addSlide(new SimpleSlide.Builder()
                                .title("titulo2")
                                .description("descrição")
                                .image(R.drawable.dois)
                                .background(android.R.color.holo_orange_dark)
                                .build()
        );
        addSlide(new SimpleSlide.Builder()
                                .title("titulo3")
                                .description("descrição")
                                .image(R.drawable.tres)
                                .background(android.R.color.holo_orange_dark)
                                .build()
        );

         */
    }


}