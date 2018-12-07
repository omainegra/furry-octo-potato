package com.omainegra.frescotest

import android.graphics.Color
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.drawee.view.SimpleDraweeView
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Fresco.initialize(this)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = Color.TRANSPARENT
        }

        setContentView(R.layout.activity_main)

        val imageUrl = "https://images.freeimages.com/images/large-previews/25d/eagle-1523807.jpg"

        findViewById<SimpleDraweeView>(R.id.draweeView).setImageURI(imageUrl)
//        Picasso.get().load(imageUrl).into(findViewById<ImageView>(R.id.imageView))
    }
}
