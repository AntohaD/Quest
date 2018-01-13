package com.dzherdzh.anton.quest;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class Media extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

        String videoSource ="android.resource://com.dzherdzh.anton.quest/" + R.raw.video;
        VideoView videoView = (VideoView) findViewById(R.id.videoPlayer);
        videoView.setVideoURI(Uri.parse(videoSource));

        videoView.setVideoPath(videoSource);
        videoView.setMediaController(new MediaController(this));

        videoView.requestFocus();
        videoView.start();
    }
}
