package com.example.neshanmap

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.neshan.mapsdk.MapView
import android.widget.EditText



class MainActivity : AppCompatActivity() {
    private lateinit var mapView: MapView
    private lateinit var searchBox: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        mapView = findViewById(R.id.map)
        mapView.setZoom(14f, 0f)






    }
}