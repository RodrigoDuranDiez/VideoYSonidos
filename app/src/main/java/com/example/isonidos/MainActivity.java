package com.example.isonidos;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void reproduceSonidos(View vista){
        MediaPlayer m = new MediaPlayer();
        int idSonido = R.raw.public_html_sonidos_s_no_willyrex;
        m = MediaPlayer.create(  this, idSonido);
        m.start();
    }
}