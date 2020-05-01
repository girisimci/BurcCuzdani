package com.mehmetsaitisik.burczdan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var burclar= arrayOf("Koç","Boğa","İkizler","Yengeç","Aslan","Başak","Terazi","Akrep","Yay","Oğlak","Kova","Balık")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var burclarAdapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,burclar)

        listBurclar.adapter=burclarAdapter

       listBurclar.setOnItemClickListener { parent, view, position, id ->
           var gecici=view as TextView
            Toast.makeText(this,"Tıklanıldı: ${gecici.text.toString()}",Toast.LENGTH_SHORT).show()
       }


    }
}
