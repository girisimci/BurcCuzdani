package com.mehmetsaitisik.burczdan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.tek_satir.view.*

class BurclarBaseAdapter(context: Context) : BaseAdapter() {

    var tumBurclar: ArrayList<Burclar>
    var context: Context

    init {
        tumBurclar = ArrayList<Burclar>(12)
        this.context = context
        var burcAdlari = context.resources.getStringArray(R.array.burclar)
        var burcTarihleri = context.resources.getStringArray(R.array.burcTarih)
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


        for (i in 0..11) {
            var arraylisteAtanacakBurc: Burclar =
                Burclar(burcAdlari[i], burcTarihleri[i], burcResimleri[i])
            tumBurclar.add(arraylisteAtanacakBurc)
        }

    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {

        var tek_satir_view = convertView
        var viewHolder: ViewHolder2

        if (tek_satir_view == null) {
            var inflater = LayoutInflater.from(context)
            tek_satir_view = inflater.inflate(R.layout.tek_satir, parent, false)

            viewHolder = ViewHolder2(tek_satir_view)
            tek_satir_view.tag = viewHolder

        } else {

            viewHolder = tek_satir_view.tag as ViewHolder2
        }


        viewHolder.burcResim.setImageResource(tumBurclar.get(position).burcSembol)
        viewHolder.burcAdi.text = tumBurclar.get(position).burcAdi
        viewHolder.burcTarih.text = tumBurclar.get(position).burcTarih


        return tek_satir_view
    }

    override fun getItem(position: Int): Any {

        return tumBurclar.get(position)

    }

    override fun getItemId(position: Int): Long {

        return 0
    }

    override fun getCount(): Int {

        return tumBurclar.size

    }
}

class ViewHolder2(tek_satir_view: View) {
    var burcResim: ImageView
    var burcAdi: TextView
    var burcTarih: TextView

    init {
        this.burcResim = tek_satir_view.imgBurcSembol
        this.burcAdi = tek_satir_view.tvBurcAdi
        this.burcTarih = tek_satir_view.tvBurcTarihi

    }
}