package com.example.responsi153.Adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.responsi153.R

class AdapterList(
    private val context: Activity,
    private val namasoft: Array<String>,
    private val dekripsisoft: Array<String>,
    private val iconsoft: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.activity_home2, namasoft) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.activity_home2, null, true)
        val titleText = rowView.findViewById(R.id.namautama) as TextView
        val imageView = rowView.findViewById(R.id.iconsoft) as ImageView

        titleText.text = namasoft[position]
        imageView.setImageResource(iconsoft[position])

        return rowView
    }
}