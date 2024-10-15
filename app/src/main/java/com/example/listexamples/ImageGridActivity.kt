package com.example.listexamples

import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.util.TypedValueCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImageGridActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_grid)

        val items = mutableListOf<Int>()
        for (i in 1..28)
            items.add(resources.getIdentifier("thumb$i", "drawable", packageName))

        val space = TypedValueCompat.dpToPx(20f, resources.displayMetrics)
        val imageWidth = (resources.displayMetrics.widthPixels - space) / 3

        val adapter = ImageAdapter(items, imageWidth.toInt())
        val gridView = findViewById<GridView>(R.id.grid_images)
        gridView.adapter = adapter
    }
}