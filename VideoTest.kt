package com.techdeity.videotest

import android.net.Uri
import android.net.Uri.parse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mediaController=MediaController(this)
        mediaController.setAnchorView(video_view1)

        val uri:Uri =parse("android.resource://" + getPackageName() + "/" + R.raw.avi)
                video_view1.setMediaController(mediaController)
                video_view1.setVideoURI(uri)
                video_view1.requestFocus()
                video_view1.start()

    }
}
