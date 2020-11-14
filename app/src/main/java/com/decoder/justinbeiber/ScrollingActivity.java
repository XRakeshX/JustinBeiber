package com.decoder.justinbeiber;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity {

    ImageView imgPlay0,imgPlay1,imgPlay2,imgPlay3,imgPlay4,imgPlay5,imgPlay6;

    ImageView imgPause0,imgPause1,imgPause2,imgPause3,imgPause4,imgPause5,imgPause6;

    TextView songTitle,name;

    MediaPlayer song0,song1,song2,song3,song4,song5,song6;

    String[] songName = {"Yummy","Never Say Never","Heart Breaker","I Don't Care","All I Want For Christmas Is You","Confident","Friends"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        song0 = MediaPlayer.create(this,R.raw.yummy);
        song1 = MediaPlayer.create(this,R.raw.never_say_never);
        song2 = MediaPlayer.create(this,R.raw.heart_breaker);
        song3 = MediaPlayer.create(this,R.raw.i_dont);
        song4 = MediaPlayer.create(this,R.raw.all_i_want);
        song5 = MediaPlayer.create(this,R.raw.confident);
        song6 = MediaPlayer.create(this,R.raw.heart_breaker);

       imgPlay0 = findViewById(R.id.one_play);
       imgPlay1 = findViewById(R.id.two_play);
       imgPlay2 = findViewById(R.id.three_play);
       imgPlay3 = findViewById(R.id.four_play);
       imgPlay4 = findViewById(R.id.five_play);
       imgPlay5 = findViewById(R.id.six_play);
       imgPlay6 = findViewById(R.id.seven_play);


       imgPause0 = findViewById(R.id.one_pause);
       imgPause1 = findViewById(R.id.two_pause);
       imgPause2 = findViewById(R.id.three_pause);
       imgPause3 = findViewById(R.id.four_pause);
       imgPause4 = findViewById(R.id.five_pause);
       imgPause5 = findViewById(R.id.six_pause);
       imgPause6 = findViewById(R.id.seven_pause);

        songTitle = findViewById(R.id.song);
        name = findViewById(R.id.name);

    }

    public void one(View view) {

        stop1();
        song(song0,imgPlay0,imgPause0,0);
    }

    public void two(View view) {

        stop2();
        song(song1,imgPlay1,imgPause1,1);

    }

    public void three(View view) {


        stop3();
        song(song2,imgPlay2,imgPause2,2);

    }

    public void four(View view) {

        stop4();

        song(song3,imgPlay3,imgPause3,3);

    }

    public void five(View view) {

        stop5();
        song(song4,imgPlay4,imgPause4,4);


    }

    public void six(View view) {

        stop6();
        song(song5,imgPlay5,imgPause5,5);

    }

    public void seven(View view) {

        stop7();
        song(song6,imgPlay6,imgPause6,6);

    }

   protected void song(MediaPlayer player,ImageView imgPlayL,ImageView imgPauseL,int songNo){
       name.setAlpha(0f);

       songTitle.setText(songName[songNo]);
       if(player.isPlaying()){
           player.pause();
           imgPlayL.setAlpha(1f);
           imgPauseL.setAlpha(0f);
       }

       else{
           player.start();
           imgPlayL.setAlpha(0f);
           imgPauseL.setAlpha(1f);
       }
   }

   protected void stop1(){
        if(song1.isPlaying()) song1.pause();

       if(song2.isPlaying()) song2.pause();

       if(song3.isPlaying()) song2.pause();

       if(song4.isPlaying()) song3.pause();

       if(song5.isPlaying()) song4.pause();

       if(song6.isPlaying()) song5.pause();


       imgPause1.setAlpha(0f);
       imgPause2.setAlpha(0f);
       imgPause3.setAlpha(0f);
       imgPause4.setAlpha(0f);
       imgPause5.setAlpha(0f);
       imgPause6.setAlpha(0f);

       imgPlay1.setAlpha(1f);
       imgPlay2.setAlpha(1f);
       imgPlay3.setAlpha(1f);
       imgPlay4.setAlpha(1f);
       imgPlay5.setAlpha(1f);
       imgPlay6.setAlpha(1f);

   }

    protected void stop2(){
        if(song0.isPlaying()) song0.pause();

        if(song2.isPlaying()) song2.pause();

        if(song3.isPlaying()) song2.pause();

        if(song4.isPlaying()) song3.pause();

        if(song5.isPlaying()) song4.pause();

        if(song6.isPlaying()) song5.pause();

        imgPause0.setAlpha(0f);
        imgPause2.setAlpha(0f);
        imgPause3.setAlpha(0f);
        imgPause4.setAlpha(0f);
        imgPause5.setAlpha(0f);
        imgPause6.setAlpha(0f);

        imgPlay0.setAlpha(1f);
        imgPlay2.setAlpha(1f);
        imgPlay3.setAlpha(1f);
        imgPlay4.setAlpha(1f);
        imgPlay5.setAlpha(1f);
        imgPlay6.setAlpha(1f);
    }

    protected void stop3(){
        if(song1.isPlaying()) song1.pause();

        if(song0.isPlaying()) song0.pause();

        if(song3.isPlaying()) song2.pause();

        if(song4.isPlaying()) song3.pause();

        if(song5.isPlaying()) song4.pause();

        if(song6.isPlaying()) song5.pause();

        imgPause1.setAlpha(0f);
        imgPause0.setAlpha(0f);
        imgPause3.setAlpha(0f);
        imgPause4.setAlpha(0f);
        imgPause5.setAlpha(0f);
        imgPause6.setAlpha(0f);

        imgPlay1.setAlpha(1f);
        imgPlay0.setAlpha(1f);
        imgPlay3.setAlpha(1f);
        imgPlay4.setAlpha(1f);
        imgPlay5.setAlpha(1f);
        imgPlay6.setAlpha(1f);
    }

    protected void stop4(){
        if(song1.isPlaying()) song1.pause();

        if(song2.isPlaying()) song2.pause();

        if(song0.isPlaying()) song0.pause();

        if(song4.isPlaying()) song3.pause();

        if(song5.isPlaying()) song4.pause();

        if(song6.isPlaying()) song5.pause();

        imgPause1.setAlpha(0f);
        imgPause2.setAlpha(0f);
        imgPause0.setAlpha(0f);
        imgPause4.setAlpha(0f);
        imgPause5.setAlpha(0f);
        imgPause6.setAlpha(0f);

        imgPlay1.setAlpha(1f);
        imgPlay2.setAlpha(1f);
        imgPlay0.setAlpha(1f);
        imgPlay4.setAlpha(1f);
        imgPlay5.setAlpha(1f);
        imgPlay6.setAlpha(1f);
    }

    protected void stop5(){
        if(song1.isPlaying()) song1.pause();

        if(song2.isPlaying()) song2.pause();

        if(song3.isPlaying()) song2.pause();

        if(song0.isPlaying()) song0.pause();

        if(song5.isPlaying()) song4.pause();

        if(song6.isPlaying()) song5.pause();

        imgPause1.setAlpha(0f);
        imgPause2.setAlpha(0f);
        imgPause3.setAlpha(0f);
        imgPause0.setAlpha(0f);
        imgPause5.setAlpha(0f);
        imgPause6.setAlpha(0f);

        imgPlay1.setAlpha(1f);
        imgPlay2.setAlpha(1f);
        imgPlay3.setAlpha(1f);
        imgPlay0.setAlpha(1f);
        imgPlay5.setAlpha(1f);
        imgPlay6.setAlpha(1f);
    }

    protected void stop6(){
        if(song1.isPlaying()) song1.pause();

        if(song2.isPlaying()) song2.pause();

        if(song3.isPlaying()) song2.pause();

        if(song4.isPlaying()) song3.pause();

        if(song0.isPlaying()) song0.pause();

        if(song6.isPlaying()) song5.pause();

        imgPause1.setAlpha(0f);
        imgPause2.setAlpha(0f);
        imgPause3.setAlpha(0f);
        imgPause4.setAlpha(0f);
        imgPause0.setAlpha(0f);
        imgPause6.setAlpha(0f);

        imgPlay1.setAlpha(1f);
        imgPlay2.setAlpha(1f);
        imgPlay3.setAlpha(1f);
        imgPlay4.setAlpha(1f);
        imgPlay0.setAlpha(1f);
        imgPlay6.setAlpha(1f);
    }

    protected void stop7(){
        if(song1.isPlaying()) song1.pause();

        if(song2.isPlaying()) song2.pause();

        if(song3.isPlaying()) song2.pause();

        if(song4.isPlaying()) song3.pause();

        if(song5.isPlaying()) song4.pause();

        if(song0.isPlaying()) song0.pause();

        imgPause1.setAlpha(0f);
        imgPause2.setAlpha(0f);
        imgPause3.setAlpha(0f);
        imgPause4.setAlpha(0f);
        imgPause5.setAlpha(0f);
        imgPause0.setAlpha(0f);

        imgPlay1.setAlpha(1f);
        imgPlay2.setAlpha(1f);
        imgPlay3.setAlpha(1f);
        imgPlay4.setAlpha(1f);
        imgPlay5.setAlpha(1f);
        imgPlay0.setAlpha(1f);
    }
}
