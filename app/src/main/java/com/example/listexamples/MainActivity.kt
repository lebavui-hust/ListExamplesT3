package com.example.listexamples

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.GridView
import android.widget.ListView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val items = mutableListOf<String>()
//        for (i in 1..50)
//            items.add("Item $i")

        val items: Array<String> = arrayOf("words", "starting", "with", "set",
            "Setback", "Setline", "Setoffs", "Setouts", "Setters", "Setting",
            "Settled", "Settler", "Wordless", "Wordiness", "Adios")

        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            items
        )

//        val adapter: ArrayAdapter<String> = ArrayAdapter(
//            this,
//            R.layout.layout_item,
//            R.id.text_content,
//            items
//        )

//        val listView: ListView = findViewById(R.id.list_view)
//        listView.adapter = adapter
//
//        listView.setOnItemClickListener { adapterView, view, i, l ->
//            val selectedItem = items[i]
//            Log.v("TAG", "Selected Item: $selectedItem")
//        }

//        val spinner1 = findViewById<Spinner>(R.id.spinner1)
//        spinner1.adapter = adapter
//        spinner1.onItemSelectedListener = object: OnItemSelectedListener {
//            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
//                Log.v("TAG", "Selected Item: ${items[p2]}")
//            }
//
//            override fun onNothingSelected(p0: AdapterView<*>?) {
//                TODO("Not yet implemented")
//            }
//        }

//        val gridView = findViewById<GridView>(R.id.grid_view)
//        gridView.adapter = adapter
//
//        gridView.setOnItemClickListener { adapterView, view, i, l ->
//            Log.v("TAG", "Selected Item: ${items[i]}")
//        }

        val autoEditText = findViewById<AutoCompleteTextView>(R.id.edit_text)
        autoEditText.setAdapter(adapter)

//        findViewById<Button>(R.id.btn_add).setOnClickListener {
//            items.add(0, "NEW ITEM")
//            adapter.notifyDataSetChanged()
//        }

//        findViewById<Button>(R.id.btn_remove).setOnClickListener {
//            items.removeAt(0)
//            adapter.notifyDataSetChanged()
//        }

//        findViewById<Button>(R.id.btn_update).setOnClickListener {
//            items[0] = "UPDATED ITEM"
//            adapter.notifyDataSetChanged()
//        }
    }
}