package com.mehmetsaitisik.burczdan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var tumBurcBilgileri: ArrayList<Burc>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        veriKaynagiHazirla()


        var myBaseAdapter = BurclarBaseAdapter(this)
        listBurclar.adapter = myBaseAdapter


    }

    private fun veriKaynagiHazirla() {
        tumBurcBilgileri = ArrayList<Burc>(12)

        var burclar = resources.getStringArray(R.array.burclar)
        var burcTarihler = resources.getStringArray(R.array.burcTarih)
        var burcResimleri = arrayOf(
            R.drawable.koc,
            R.drawable.boga,
            R.drawable.ikizler,
            R.drawable.yengec,
            R.drawable.aslan
            ,
            R.drawable.basak,
            R.drawable.terazi,
            R.drawable.akrep,
            R.drawable.yay,
            R.drawable.oglak,
            R.drawable.kova,
            R.drawable.balik
        )

        var buyukResim = arrayOf(R.drawable.buyuk)

        var burcGenelOzellikler = arrayOf()
    }
}
